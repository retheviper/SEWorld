-- 180917_c6_v4_create_table.sql


CREATE TABLE c6_exbtinfo (
--  exhibitionInfo
    exhibitionTitleKor VARCHAR2(500 BYTE) NOT NULL,
    exhibitionTitleEng VARCHAR2(500 BYTE) NOT NULL,
    openingTerm VARCHAR2(19 BYTE) NOT NULL,
    openingCycle VARCHAR2(40 BYTE),
    firstOpeningYear VARCHAR2(9 BYTE), -- NOT NULL
    openingScale VARCHAR2(2000 BYTE),
    openingCountry VARCHAR2(30 BYTE) NOT NULL,
    openingCity VARCHAR2(30 BYTE),
    exhibitionHall VARCHAR2(500 BYTE) NOT NULL,

--  lastYearOpeningResult
    participatingNationCount NUMBER, -- NOT NULL
    openingCountryCount NUMBER, -- NOT NULL
    overseasCount NUMBER, -- NOT NULL
    openingCountryVisitorsCount NUMBER,
    mainParticipatingNations VARCHAR2(1500 BYTE),
    KOREACompanyWhether CHAR(1 BYTE),
    KOREACompanyParticipatingCount NUMBER,
    totalVisitorsCount NUMBER,
    overseasVisitorsCount NUMBER,
    exhibitionArea VARCHAR2(1500 BYTE),

--  sponsorInfo
    sponsor VARCHAR2(500 BYTE), -- NOT NULL
    personInCharge VARCHAR2(500 BYTE),
    address VARCHAR2(500 BYTE),
    telephone VARCHAR2(50 BYTE),
    fax VARCHAR2(50 BYTE),
    homepage VARCHAR2(500 BYTE),
    email VARCHAR2(500 BYTE),

--  reference
    createdDate DATE NOT NULL,
    lastUpdatedDate DATE NOT NULL,
    source VARCHAR2(500 BYTE),
    dataOffer VARCHAR2(241 BYTE),
    exhibitionItem VARCHAR2(2136 BYTE),
    remarks VARCHAR2(2000 BYTE)
);


-- 대륙
CREATE TABLE c6_regions (
    regionId NUMBER(1, 0) PRIMARY KEY,
    regionName VARCHAR2(40 BYTE) UNIQUE NOT NULL
);
COMMENT ON TABLE c6_regions IS '대륙';
COMMENT ON COLUMN c6_regions.regionId IS '대륙 ID';
COMMENT ON COLUMN c6_regions.regionName IS '대륙 이름';


-- 국가
CREATE TABLE c6_countries (
    countryId CHAR(2 BYTE) PRIMARY KEY,
    countryName VARCHAR2(40 BYTE) UNIQUE NOT NULL,
    regionId NUMBER(1, 0) NOT NULL,
    CONSTRAINT c6_countries_fk FOREIGN KEY(regionId)
    REFERENCES c6_regions(regionId)
);
COMMENT ON TABLE c6_countries IS '국가';
COMMENT ON COLUMN c6_countries.countryId IS '국가 ID';
COMMENT ON COLUMN c6_countries.countryName IS '국가 이름';
COMMENT ON COLUMN c6_countries.regionId IS '대륙 ID';


-- 도시
CREATE TABLE c6_cities (
    cityId NUMBER(4, 0) PRIMARY KEY,
    cityName VARCHAR2(40 BYTE) UNIQUE NOT NULL,
    countryId CHAR(2 BYTE) NOT NULL,
    CONSTRAINT c6_cities_fk FOREIGN KEY(countryId)
    REFERENCES c6_countries(countryId)
);
COMMENT ON TABLE c6_cities IS '도시';
COMMENT ON COLUMN c6_cities.cityId IS '도시 ID';
COMMENT ON COLUMN c6_cities.cityName IS '도시 이름';
COMMENT ON COLUMN c6_cities.countryId IS '국가 ID';


-- 전시정보
CREATE TABLE c6_exhibition (
    exhibitionId CHAR(13 BYTE) PRIMARY KEY,
    -- countryId(2 BYTE) + cityId(4 BYTE) + '-E'(2 BYTE) + c6_exhibition_seq(5 BYTE)
    -- (ex) 'KR1000-E00001'
    exhibitionTitleKor VARCHAR2(500 BYTE) NOT NULL,
    exhibitionTitleEng VARCHAR2(500 BYTE) NOT NULL,
    openingTerm VARCHAR2(19 BYTE) NOT NULL,
    firstOpeningYear VARCHAR2(9 BYTE),
    openingCountry VARCHAR2(30 BYTE) NOT NULL,
    openingCity VARCHAR2(30 BYTE),
    exhibitionHall VARCHAR2(500 BYTE) NOT NULL,
    sponsor VARCHAR2(500 BYTE),
    createdDate DATE NOT NULL,
    updatedDate DATE NOT NULL,
    dataOffer VARCHAR2(241 BYTE) NOT NULL,
    CONSTRAINT c6_exhibition_fk1 FOREIGN KEY(openingCountry)
    REFERENCES c6_countries(countryName),
    CONSTRAINT c6_exhibition_fk2 FOREIGN KEY(openingCity)
    REFERENCES c6_cities(cityName)
);
COMMENT ON TABLE c6_exhibition IS '전시정보';
COMMENT ON COLUMN c6_exhibition.exhibitionId IS '전시정보 ID';
COMMENT ON COLUMN c6_exhibition.exhibitionTitleKor IS '전시회명 한글';
COMMENT ON COLUMN c6_exhibition.exhibitionTitleEng IS '전시회명 영문';
COMMENT ON COLUMN c6_exhibition.openingTerm IS '개최기간';
COMMENT ON COLUMN c6_exhibition.firstOpeningYear IS '최초개최연도';
COMMENT ON COLUMN c6_exhibition.openingCountry IS '개최국가';
COMMENT ON COLUMN c6_exhibition.openingCity IS '개최도시';
COMMENT ON COLUMN c6_exhibition.exhibitionHall IS '전시장';
COMMENT ON COLUMN c6_exhibition.sponsor IS '주최기관';
COMMENT ON COLUMN c6_exhibition.createdDate IS '등록일';
COMMENT ON COLUMN c6_exhibition.updatedDate IS '수정일';
COMMENT ON COLUMN c6_exhibition.dataOffer IS '자료제공';


--------------------------------------------------------------------------------------------------------------------------------


-- 회원
CREATE TABLE c6_member (
    memberId VARCHAR2(40 BYTE) PRIMARY KEY,
    memberPwd VARCHAR2(20 BYTE),
    memberName VARCHAR2(20 BYTE) NOT NULL,
    memberType VARCHAR2(8 BYTE) NOT NULL,
    verified CHAR(1 BYTE) DEFAULT 'N' NOT NULL,
    regDate DATE DEFAULT SYSDATE NOT NULL
);
COMMENT ON TABLE c6_member IS '회원';
COMMENT ON COLUMN c6_member.memberId IS '회원 계정';
COMMENT ON COLUMN c6_member.memberPwd IS '회원 비밀번호';
COMMENT ON COLUMN c6_member.memberName IS '회원 이름';
COMMENT ON COLUMN c6_member.memberType IS '계정종류';
COMMENT ON COLUMN c6_member.verified IS '회원 인증여부';
COMMENT ON COLUMN c6_member.regDate IS '회원 등록일';


-- 회원 프로필
CREATE TABLE c6_member_profile (
    memberId VARCHAR2(40 BYTE) PRIMARY KEY, 
    ogFilename VARCHAR2(260 BYTE) NOT NULL,
    svFilename VARCHAR2(40 BYTE) NOT NULL,
    fileSize NUMBER,
    createdDate DATE DEFAULT SYSDATE NOT NULL,
    updatedDate DATE DEFAULT SYSDATE NOT NULL,
    CONSTRAINT c6_member_profile_fk FOREIGN KEY(memberId)
    REFERENCES c6_member(memberId)
);
COMMENT ON TABLE c6_member_profile IS '회원 프로필';
COMMENT ON COLUMN c6_member_profile.memberId IS '회원 ID';
COMMENT ON COLUMN c6_member_profile.ogFilename IS '원본 파일이름';
COMMENT ON COLUMN c6_member_profile.svFilename IS '저장된 파일이름';
COMMENT ON COLUMN c6_member_profile.fileSize IS '파일 크기';
COMMENT ON COLUMN c6_member_profile.createdDate IS '등록일';
COMMENT ON COLUMN c6_member_profile.updatedDate IS '수정일';


-- 가고싶어요
CREATE TABLE c6_wishing (
    memberId VARCHAR2(40 BYTE) NOT NULL,
    exhibitionId CHAR(13 BYTE) NOT NULL,
    wished CHAR(1 BYTE) DEFAULT 'Y' NOT NULL,
    createdDate DATE DEFAULT SYSDATE NOT NULL,
    updatedDate DATE DEFAULT SYSDATE NOT NULL,
    CONSTRAINT c6_wishing_fk1 FOREIGN KEY(memberId)
    REFERENCES c6_member(memberId),
    CONSTRAINT c6_wishing_fk2 FOREIGN KEY(exhibitionId)
    REFERENCES c6_exhibition(exhibitionId),
    CONSTRAINT c6_wishing_pk PRIMARY KEY(memberId, exhibitionId)
);
COMMENT ON TABLE c6_wishing IS '가고싶어요';
COMMENT ON COLUMN c6_wishing.memberId IS '회원 ID';
COMMENT ON COLUMN c6_wishing.exhibitionId IS '전시정보 ID';
COMMENT ON COLUMN c6_wishing.wished IS '클릭 여부';
COMMENT ON COLUMN c6_wishing.createdDate IS '등록일';
COMMENT ON COLUMN c6_wishing.updatedDate IS '수정일';


-- 좋아요
CREATE TABLE c6_liking (
    memberId VARCHAR2(40 BYTE) NOT NULL,
    exhibitionId CHAR(13 BYTE) NOT NULL,
    liked CHAR(1 BYTE) DEFAULT 'Y' NOT NULL,
    createdDate DATE DEFAULT SYSDATE NOT NULL,
    updatedDate DATE DEFAULT SYSDATE NOT NULL,
    CONSTRAINT c6_liking_fk1 FOREIGN KEY(memberId)
    REFERENCES c6_member(memberId),
    CONSTRAINT c6_liking_fk2 FOREIGN KEY(exhibitionId)
    REFERENCES c6_exhibition(exhibitionId),
    CONSTRAINT c6_liking_pk PRIMARY KEY(memberId, exhibitionId)
);
COMMENT ON TABLE c6_liking IS '좋아요';
COMMENT ON COLUMN c6_liking.memberId IS '회원 ID';
COMMENT ON COLUMN c6_liking.exhibitionId IS '전시정보 ID';
COMMENT ON COLUMN c6_liking.liked IS '좋아요 여부';
COMMENT ON COLUMN c6_liking.createdDate IS '등록일';
COMMENT ON COLUMN c6_liking.updatedDate IS '수정일';


-- 평가하기
CREATE TABLE c6_comment (
    memberId VARCHAR2(20 BYTE) NOT NULL,
    exhibitionId CHAR(13 BYTE) NOT NULL,
    rating NUMBER(1, 0) NOT NULL,
    content VARCHAR2(2000 BYTE),
    createdDate DATE DEFAULT SYSDATE NOT NULL,
    updatedDate DATE DEFAULT SYSDATE NOT NULL,
    likes NUMBER DEFAULT 0 NOT NULL,
    CONSTRAINT c6_comment_fk1 FOREIGN KEY(memberId)
    REFERENCES c6_member(memberId),
    CONSTRAINT c6_comment_fk2 FOREIGN KEY(exhibitionId)
    REFERENCES c6_exhibition(exhibitionId),
    CONSTRAINT c6_comment_pk PRIMARY KEY(memberId, exhibitionId)
);
COMMENT ON TABLE c6_comment IS '코멘트';
COMMENT ON COLUMN c6_comment.memberId IS '회원 ID';
COMMENT ON COLUMN c6_comment.exhibitionId IS '전시정보 ID';
COMMENT ON COLUMN c6_comment.rating IS '평점';
COMMENT ON COLUMN c6_comment.content IS '코멘트';
COMMENT ON COLUMN c6_comment.createdDate IS '등록일';
COMMENT ON COLUMN c6_comment.updatedDate IS '수정일';
COMMENT ON COLUMN c6_comment.likes IS '좋아요 수';


-- 평가하기 좋아요
CREATE TABLE c6_comment_likes (
    memberId VARCHAR2(20 BYTE) NOT NULL,
    exhibitionId CHAR(13 BYTE) NOT NULL,
    createdDate DATE DEFAULT SYSDATE NOT NULL,
    CONSTRAINT c6_comment_likes_fk1 FOREIGN KEY(memberId)
    REFERENCES c6_member(memberId),
    CONSTRAINT c6_comment_likes_fk2 FOREIGN KEY(exhibitionId)
    REFERENCES c6_exhibition(exhibitionId),
    CONSTRAINT c6_comment_likes_pk PRIMARY KEY(memberId, exhibitionId)
);
COMMENT ON TABLE c6_comment_likes IS '평가하기 좋아요';
COMMENT ON COLUMN c6_comment_likes.memberId IS '회원 ID';
COMMENT ON COLUMN c6_comment_likes.exhibitionId IS '전시정보 ID';
COMMENT ON COLUMN c6_comment_likes.createdDate IS '등록일';


-- 평가하기 댓글
CREATE TABLE c6_comment_reply (
    commentReplyId CHAR(8 BYTE) PRIMARY KEY,
    -- 'CR' + c6_comment_reply_seq(6 BYTE)
    -- (ex) 'CR100001'
    writerId VARCHAR2(20 BYTE) NOT NULL,
    memberId VARCHAR2(20 BYTE) NOT NULL,
    exhibitionId CHAR(13 BYTE) NOT NULL,
    content VARCHAR2(2000 BYTE) NOT NULL,
    createdDate DATE DEFAULT SYSDATE NOT NULL,
    updatedDate DATE DEFAULT SYSDATE NOT NULL,
    likes NUMBER DEFAULT 0 NOT NULL,
    CONSTRAINT c6_comment_reply_fk1 FOREIGN KEY(writerId)
    REFERENCES c6_member(memberId),
    CONSTRAINT c6_comment_reply_fk2 FOREIGN KEY(memberId, exhibitionId)
    REFERENCES c6_comment(memberId, exhibitionId)
);
COMMENT ON TABLE c6_comment_reply IS '평가하기 댓글';
COMMENT ON COLUMN c6_comment_reply.commentReplyId IS '평가하기 댓글 ID';
COMMENT ON COLUMN c6_comment_reply.writerId IS '댓글회원 ID';
COMMENT ON COLUMN c6_comment_reply.memberId IS '회원 ID';
COMMENT ON COLUMN c6_comment_reply.exhibitionId IS '전시정보 ID';
COMMENT ON COLUMN c6_comment_reply.content IS '댓글 내용';
COMMENT ON COLUMN c6_comment_reply.createdDate IS '등록일';
COMMENT ON COLUMN c6_comment_reply.updatedDate IS '수정일';
COMMENT ON COLUMN c6_comment_reply.likes IS '좋아요 수';


-- 평가하기 댓글 좋아요
CREATE TABLE c6_comment_reply_likes (
    memberId VARCHAR2(20 BYTE) NOT NULL,
    exhibitionId CHAR(13 BYTE) NOT NULL,
    createdDate DATE DEFAULT SYSDATE NOT NULL,
    CONSTRAINT c6_comment_reply_likes_fk1 FOREIGN KEY(memberId)
    REFERENCES c6_member(memberId),
    CONSTRAINT c6_comment_reply_likes_fk2 FOREIGN KEY(exhibitionId)
    REFERENCES c6_exhibition(exhibitionId),
    CONSTRAINT c6_comment_reply_likes_pk PRIMARY KEY(memberId, exhibitionId)
);
COMMENT ON TABLE c6_comment_reply_likes IS '평가하기 댓글 좋아요';
COMMENT ON COLUMN c6_comment_reply_likes.memberId IS '회원 ID';
COMMENT ON COLUMN c6_comment_reply_likes.exhibitionId IS '전시정보 ID';
COMMENT ON COLUMN c6_comment_reply_likes.createdDate IS '등록일';


-- 게시판
CREATE TABLE c6_board (
    boardId CHAR(10 BYTE) PRIMARY KEY,
    -- 'B'(1 BYTE) + c6_board_seq(9 BYTE)
    -- (ex) 'B000000001'
    memberId VARCHAR2(20 BYTE) NOT NULL,
    category VARCHAR2(40 BYTE),
    title VARCHAR2(1000 BYTE) NOT NULL,
    content VARCHAR2(4000 BYTE) NOT NULL,
    createdDate DATE DEFAULT SYSDATE NOT NULL,
    updatedDate DATE DEFAULT SYSDATE NOT NULL,
    exhibitionId CHAR(13 BYTE),
    CONSTRAINT c6_board_fk1 FOREIGN KEY(memberId)
    REFERENCES c6_member(memberId),
    CONSTRAINT c6_board_fk2 FOREIGN KEY(exhibitionId)
    REFERENCES c6_exhibition(exhibitionId)
);
COMMENT ON TABLE c6_board IS '게시글';
COMMENT ON COLUMN c6_board.boardId IS '게시글 ID';
COMMENT ON COLUMN c6_board.memberId IS '회원 ID';
COMMENT ON COLUMN c6_board.category IS '게시글 범주';
COMMENT ON COLUMN c6_board.title IS '제목';
COMMENT ON COLUMN c6_board.content IS '내용';
COMMENT ON COLUMN c6_board.createdDate IS '등록일';
COMMENT ON COLUMN c6_board.updatedDate IS '수정일';
COMMENT ON COLUMN c6_board.exhibitionId IS '전시정보 ID';


-- 게시글 첨부파일
CREATE TABLE c6_board_file (
    boardFileId CHAR(16 BYTE) PRIMARY KEY,
    -- boardId(10 BYTE) + '-F'(2 BYTE) + c6_board_file_seq(4 BYTE)
    -- (ex) 'B000000001-F0001'
    boardId CHAR(10 BYTE) NOT NULL,
    ogFilename VARCHAR2(500 BYTE) NOT NULL,
    svFilename VARCHAR2(500 BYTE) NOT NULL,
    fileSize LONG,
    createdDate DATE DEFAULT SYSDATE NOT NULL,
    updatedDate DATE DEFAULT SYSDATE NOT NULL,
    CONSTRAINT c6_board_file_fk FOREIGN KEY(boardId)
    REFERENCES c6_board(boardId)
);
COMMENT ON TABLE c6_board_file IS '게시글 첨부파일';
COMMENT ON COLUMN c6_board_file.boardFileId IS '게시글 첨부파일 ID';
COMMENT ON COLUMN c6_board_file.boardId IS '게시글 ID';
COMMENT ON COLUMN c6_board_file.ogFilename IS '원본 파일이름';
COMMENT ON COLUMN c6_board_file.svFilename IS '저장된 파일이름';
COMMENT ON COLUMN c6_board_file.fileSize IS '파일 크기';
COMMENT ON COLUMN c6_board_file.createdDate IS '등록일';
COMMENT ON COLUMN c6_board_file.updatedDate IS '수정일';


-- 게시글 댓글
CREATE TABLE c6_board_reply (
    boardReplyId CHAR(16 BYTE) PRIMARY KEY,
    -- boardId(10 BYTE) + '-R'(2 BYTE) + c6_board_reply_seq(4 BYTE)
    -- (ex) 'B000000001-R0001'
    boardId CHAR(10 BYTE) NOT NULL,
    memberId VARCHAR2(40 BYTE) NOT NULL,
    content VARCHAR2(4000 BYTE) NOT NULL,
    createdDate DATE DEFAULT SYSDATE NOT NULL,
    updatedDate DATE DEFAULT SYSDATE NOT NULL,
    CONSTRAINT c6_board_reply_fk1 FOREIGN KEY(boardId)
    REFERENCES c6_board(boardId),
    CONSTRAINT c6_board_reply_fk2 FOREIGN KEY(memberId)
    REFERENCES c6_member(memberId)
);
COMMENT ON TABLE c6_board_reply IS '게시글 댓글';
COMMENT ON COLUMN c6_board_reply.boardReplyId IS '게시글 댓글 ID';
COMMENT ON COLUMN c6_board_reply.boardId IS '게시글 ID';
COMMENT ON COLUMN c6_board_reply.memberId IS '회원 ID';
COMMENT ON COLUMN c6_board_reply.content IS '내용';
COMMENT ON COLUMN c6_board_reply.createdDate IS '등록일';
COMMENT ON COLUMN c6_board_reply.updatedDate IS '수정일';


-- 팔로우 관계
CREATE TABLE c6_followship (
    follower VARCHAR2(40 BYTE) NOT NULL,
    following VARCHAR2(40 BYTE) NOT NULL,
    createdDate DATE DEFAULT SYSDATE NOT NULL
);
ALTER TABLE c6_followship ADD PRIMARY KEY(follower, following);
COMMENT ON TABLE c6_followship IS '팔로우 관계';
COMMENT ON COLUMN c6_followship.follower IS '팔로워';
COMMENT ON COLUMN c6_followship.following IS '팔로잉';
COMMENT ON COLUMN c6_followship.createdDate IS '팔로우 날짜';


-- 캘린더
CREATE TABLE c6_calendar (
    calendarId CHAR(10 BYTE) PRIMARY KEY,
    memberId VARCHAR2(40 BYTE) NOT NULL,
    title VARCHAR2(100 BYTE),
    bgType VARCHAR2(10 BYTE),
    startDay DATE,
    endDay DATE,
    createdDate DATE DEFAULT SYSDATE NOT NULL,
    updatedDate DATE DEFAULT SYSDATE NOT NULL,
    CONSTRAINT c6_calendar_fk FOREIGN KEY(memberId)
    REFERENCES c6_member(memberId)
);
COMMENT ON TABLE c6_calendar IS '캘린더';
COMMENT ON COLUMN c6_calendar.calendarId IS '캘린더 ID';
COMMENT ON COLUMN c6_calendar.memberId IS '회원 ID';
COMMENT ON COLUMN c6_calendar.title IS '제목';
COMMENT ON COLUMN c6_calendar.bgType IS '배경색';
COMMENT ON COLUMN c6_calendar.startDay IS '시작일';
COMMENT ON COLUMN c6_calendar.endDay IS '종료일';
COMMENT ON COLUMN c6_calendar.createdDate IS '캘린더 생성일';
COMMENT ON COLUMN c6_calendar.updatedDate IS '캘린더 수정일';


CREATE SEQUENCE c6_cities_seq START WITH 1360 INCREMENT BY 1 MAXVALUE 9999;
CREATE SEQUENCE c6_exhibition_seq START WITH 15960 INCREMENT BY 1 MAXVALUE 99999;
CREATE SEQUENCE c6_board_seq;
CREATE SEQUENCE c6_board_file_seq;
CREATE SEQUENCE c6_board_reply_seq;
CREATE SEQUENCE c6_comment_reply_seq;
CREATE SEQUENCE c6_calendar_seq;
