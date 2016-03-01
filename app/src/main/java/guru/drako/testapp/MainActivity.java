package guru.drako.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle inState) {
        super.onCreate(inState);
        setContentView(R.layout.activity_main);

        WebView content = (WebView)findViewById(R.id.webview);
        if (inState != null) {
            content.restoreState(inState);
        }
        else {
            content.loadUrl("file:///android_asset/index.html");
        }

        WebSettings settings = content.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        content.addJavascriptInterface(new WebAppInterface(this), "Android");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        WebView content = (WebView)findViewById(R.id.webview);
        content.saveState(outState);
    }
}
