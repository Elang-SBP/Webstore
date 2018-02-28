package eplab.elang.webstore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.io.IOException;
import java.io.InputStream;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import android.os.AsyncTask;
import android.app.Activity;
import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // URL Address
    String url = "https://www.epstore.ga/wp";
    ProgressDialog mProgressDialog;
    //Navigation
    Button browseBtn = findViewById(R.id.browseBtn);
    Button descBtn = findViewById(R.id.descBtn);
    Button inputBtn = findViewById(R.id.inputBtn);

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changePageBrowser(View view) {
        Intent intent = new Intent(this, browseAct.class);
        startActivity(intent);
    }

    public void changePageInput(View view){
        Intent intent = new Intent(this, inputAct.class);
        startActivity(intent);
    }

    public void changePageDescription(View view){
        Intent intent = new Intent(this, descAct.class);
        startActivity(intent);
    }

        /*
        // Capture button click Activity
        browseBtn.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                // Execute Browse
                new browse.execute();
            }
        });

        // Capture button click Activity
        descBtn.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                // Execute Description
                new description().execute();
            }
        });

        // Capture button click Activity
        inputBtn.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                // Execute Input
                new input().execute();
            }
        });

    }


    // Title AsyncTask
    private class Title extends AsyncTask<Void, Void, Void> {
        String title;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            mProgressDialog = new ProgressDialog(MainActivity.this);
            mProgressDialog.setTitle("EPStore");
            mProgressDialog.setMessage("Loading...");
            mProgressDialog.setIndeterminate(false);
            mProgressDialog.show();
        }

        @Override
        protected Void doInBackground(Void... params) {
            try {
                // Connect to the web site
                Document document = Jsoup.connect(url).get();
                // Get the html document title
                title = document.title();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            // Set title into TextView
            TextView txttitle = findViewById(R.id.titletxt);
            txttitle.setText(title);
            mProgressDialog.dismiss();
        }
    }

    // Description AsyncTask
    private class Description extends AsyncTask<Void, Void, Void> {
        String desc;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            mProgressDialog = new ProgressDialog(MainActivity.this);
            mProgressDialog.setTitle("EPStore");
            mProgressDialog.setMessage("Loading...");
            mProgressDialog.setIndeterminate(false);
            mProgressDialog.show();
        }

        @Override
        protected Void doInBackground(Void... params) {
            try {
                // Connect to the web site
                Document document = Jsoup.connect(url).get();
                // Using Elements to get the Meta data
                Elements description = document
                        .select("meta[name=description]");
                // Locate the content attribute
                desc = description.attr("content");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            // Set description into TextView
            TextView txtdesc = findViewById(R.id.desctxt);
            txtdesc.setText(desc);
            mProgressDialog.dismiss();
        }
    }

    // Logo AsyncTask
    private class Logo extends AsyncTask<Void, Void, Void> {
        Bitmap bitmap;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            mProgressDialog = new ProgressDialog(MainActivity.this);
            mProgressDialog.setTitle("EPStore");
            mProgressDialog.setMessage("Loading...");
            mProgressDialog.setIndeterminate(false);
            mProgressDialog.show();
        }

        @Override
        protected Void doInBackground(Void... params) {

            try {
                // Connect to the web site
                Document document = Jsoup.connect(url).get();
                // Using Elements to get the class data
                Elements img = document.select("a[class=brand brand-image] img[src]");
                // Locate the src attribute
                String imgSrc = img.attr("src");
                // Download image from URL
                InputStream input = new java.net.URL(imgSrc).openStream();
                // Decode Bitmap
                bitmap = BitmapFactory.decodeStream(input);

            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            // Set downloaded image into ImageView
            ImageView logoimg = findViewById(R.id.logo);
            logoimg.setImageBitmap(bitmap);
            mProgressDialog.dismiss();
        }
    }
    */
}