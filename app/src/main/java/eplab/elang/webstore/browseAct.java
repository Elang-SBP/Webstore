package eplab.elang.webstore;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;


public class browseAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse);

        //Load Webpage
        WebView webview = new WebView(this);
        setContentView(webview);
        webview.loadUrl("https://epstore.ga/wp/");

    }
}
