// Automatically generated by rust_swig
package com.schuetz.rust_android_ios;
import android.support.annotation.NonNull;

public final class Session {

    public Session() {
        mNativeObj = init();
    }
    private static native long init();

    public final int add_and1(int val) {
        int ret = do_add_and1(mNativeObj, val);

        return ret;
    }
    private static native int do_add_and1(long self, int val);

    public static native @NonNull String greet(@NonNull String to);

    public synchronized void delete() {
        if (mNativeObj != 0) {
            do_delete(mNativeObj);
            mNativeObj = 0;
       }
    }
    @Override
    protected void finalize() throws Throwable {
        try {
            delete();
        }
        finally {
             super.finalize();
        }
    }
    private static native void do_delete(long me);
    /*package*/ Session(InternalPointerMarker marker, long ptr) {
        assert marker == InternalPointerMarker.RAW_PTR;
        this.mNativeObj = ptr;
    }
    /*package*/ long mNativeObj;
}