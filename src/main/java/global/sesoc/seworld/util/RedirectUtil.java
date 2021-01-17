package global.sesoc.seworld.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RedirectUtil {

    private static final String REDIRECT_TO_HOME = "redirect:/";

    private static final String REDIRECT_TO = "redirect:/%s";

    public static String redirectToHome() {
        return REDIRECT_TO_HOME;
    }

    public static String redirectTo(final String path) {
        return String.format(REDIRECT_TO, path);
    }
}
