package com.example.lol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //waarom heeft dit ding een spellchecker. leaf me be.
    //todo: schrijf stuff idek
    //oh, nice ik wist niet dat android studio dat deed.
    //also, waarom gebruikt het letterlijk >2GB ram. android studio why

    private ImageView ivStats;
    private EditText dingetje;
    private Button butt;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.ivStats = findViewById(R.id.ivStats);
        this.dingetje = findViewById(R.id.dingetje);
        this.butt = findViewById(R.id.butt); //yeey it found the butt
    }

    //ImageView view = new ImageView();
    //view.setImageBitmap(yeet);
}
