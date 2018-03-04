package eplab.elang.webstore;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private ProgressDialog mProgressDialog;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Navigation
        Button browseBtn = findViewById(R.id.browseBtn);
        Button descBtn = findViewById(R.id.descBtn);
        Button inputBtn = findViewById(R.id.inputBtn);
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
}