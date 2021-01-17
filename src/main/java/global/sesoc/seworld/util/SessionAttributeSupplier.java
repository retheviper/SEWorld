package global.sesoc.seworld.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.servlet.http.HttpSession;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SessionAttributeSupplier {

    private final String LOGIN_ID_KEY = "loginId";

    public static String getLoginId(final HttpSession session) {
        return (String) session.getAttribute("loginId");
    }
}
