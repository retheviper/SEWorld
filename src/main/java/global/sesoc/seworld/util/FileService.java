package global.sesoc.seworld.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class FileService {

    /**
     * 업로드 된 파일을 지정된 경로에 저장하고, 저장된 파일명을 리턴
     *
     * @param upload     업로드된 파일
     * @param uploadPath 저장할 경로
     * @return 저장된 파일명
     */
    public static String saveFile(final MultipartFile upload, final String uploadPath) {
        //저장 폴더가 없으면 생성
        final Path path = Paths.get(uploadPath);
        if (Files.notExists(path)) {
            try {
                Files.createDirectories(path.getParent());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //원본 파일명
        final String originalFilename = upload.getOriginalFilename();
        if (originalFilename.strip().length() == 0) {
            return "";
        }

        final String sdf = LocalDate.now() + UUID.randomUUID().toString();

        //원본 파일의 확장자와 파일명 분리
        final String filename;        // 확장자를 뺀 파일명
        final String ext;             // 확장명

        final int lastIndex = originalFilename.lastIndexOf('.');

        //확장자가 없는 경우
        if (lastIndex == -1) {
            ext = "";
            filename = originalFilename;
        }

        //확장자가 있는 경우
        else {
            ext = originalFilename.substring(lastIndex);
            filename = originalFilename.substring(0, lastIndex);
        }

        // DB에 저장될 파일명
        final String savedFilePath = uploadPath + "/" + filename + "_" + sdf + ext;
        try {
            if (Files.exists(Path.of(savedFilePath))) {
                //같은 이름의 파일이 있으면 이름 뒤에 long 타입의 시간정보를 덧붙임.
                final String savedFilePathWithTime = savedFilePath + LocalTime.now();
                upload.transferTo(Path.of(savedFilePathWithTime));
                return savedFilePathWithTime;
            } else {
                upload.transferTo(Path.of(savedFilePath));
                return savedFilePath;
            }  // 지정된 이름으로 지정된 위치에 파일 저장
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     * 서버에 저장된 파일의 전체 경로를 전달받아, 해당 파일을 삭제
     *
     * @param fullPath 삭제할 파일의 경로
     * @return 삭제 여부
     */
    public static boolean deleteFile(final String fullPath) {
        try {
            return Files.deleteIfExists(Path.of(fullPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}