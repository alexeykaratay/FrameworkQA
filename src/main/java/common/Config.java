package common;

public class Config {

    /**
     * constant browser version
     * chrome for macOS
     */
    public static final String PLATFORM_AND_BROWSER= "mac_chrome";
    /**
     * Clear browser cookies and storage after each iteration
     * if true - clear cookie
     */
    public static final boolean CLEAR_COOKIES_AND_STORAGE = true;
    /**
     * to keep the browser open after suite
     * if true - close browser
     */
    public static final boolean HOLD_BROWSER_OPEN = true;

}
