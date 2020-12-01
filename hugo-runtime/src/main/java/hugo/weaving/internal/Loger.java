package hugo.weaving.internal;

import android.util.Log;

public class Loger {
    private static HugoLoger logerImpl;

    public static void setLogerImpl(HugoLoger logerImpl) {
        Loger.logerImpl = logerImpl;
    }

    private Loger() {}

    public static void v(String tag, String msg) {
        if (logerImpl != null) {
            logerImpl.v(tag, msg);
        } else {
            Log.v(tag, msg);
        }
    }

    public static void d(String tag, String msg) {
        if (logerImpl != null) {
            logerImpl.d(tag, msg);
        } else {
            Log.d(tag, msg);
        }
    }

    public static void i(String tag, String msg) {
        if (logerImpl != null) {
            logerImpl.i(tag, msg);
        } else {
            Log.i(tag, msg);
        }
    }

    public interface HugoLoger {
        void v(String tag, String msg);
        void d(String tag, String msg);
        void i(String tag, String msg);
    }
}
