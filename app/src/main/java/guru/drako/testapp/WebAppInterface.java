package guru.drako.testapp;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

/**
 * Created by Felix on 29.02.2016.
 */
public class WebAppInterface {
    Context context_;

    WebAppInterface(Context context) {
        context_ = context;
    }

    @JavascriptInterface
    public void showToast(String toast) {
        Toast.makeText(context_, toast, Toast.LENGTH_SHORT).show();
    }
}
