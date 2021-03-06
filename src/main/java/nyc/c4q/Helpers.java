package nyc.c4q;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;

public class Helpers {
    public static String getResourceId(View v) {
        // http://stackoverflow.com/a/17583380/198348
        int id = v.getId();
        String idString = "no id";
        if (id != View.NO_ID) {
            Resources res = v.getResources();
            if (res != null)
                idString = res.getResourceEntryName(id);
        }
        return idString;
    }

    public static View findViewByIdString(Activity a, String s) {
        return a.findViewById(a.getResources().getIdentifier(s, "id", a.getPackageName()));
    }

    public static Class getClassByString(String s) throws ClassNotFoundException {
        return ClassLoader.getSystemClassLoader().loadClass(s);
    }
}