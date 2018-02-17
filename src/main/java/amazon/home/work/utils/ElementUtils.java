package amazon.home.work.utils;

import java.util.function.Consumer;
import java.util.function.Supplier;

import static amazon.home.work.pageobjects.SearchPage.unknounItemSearch;
import static java.lang.System.currentTimeMillis;

/**
 * Created by Roman_Iovlev on 2/16/2018.
 */
public class ElementUtils {

    public static boolean assertWaitEquals(Supplier<String> actual, String expected) {
        String result = "";
        long currentTime = currentTimeMillis();
        long delta;
        do {
            try { result = actual.get();
            } catch (Exception ignore) {}
            delta = currentTimeMillis() - currentTime;
        } while (!result.equals(expected) && delta < 5000);
        return result.equals(expected);
    }
}
