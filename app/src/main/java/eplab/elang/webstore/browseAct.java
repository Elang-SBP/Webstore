package eplab.elang.webstore;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;


public class browseAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse);

        //Load Webpage Using WebView
        final Activity  activity = this;
        WebView webview = new WebView(this);
        setContentView(webview);
        webview.setWebChromeClient(new WebChromeClient());
        webview.setWebViewClient(new WebViewClient() {
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(activity, "Oh no! " + description, Toast.LENGTH_SHORT).show();
            }
        });
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("https://epstore.ga/store/");

    }
}
