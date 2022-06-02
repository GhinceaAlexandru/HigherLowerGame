package com.example.proiect2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    private String selectedTopicName="";
    public static final String NAME="NAME";
    private TextView nameText;
    private String name;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        nameText=findViewById(R.id.textView);
        Intent i = getIntent();
        name = i.getStringExtra(NAME);
        nameText.setText("Hi! "+name);


        final LinearLayout muzica = findViewById(R.id.muzicaLayout);
        final LinearLayout fotbal = findViewById(R.id.fotbalLayout);
        final LinearLayout jocuri =findViewById(R.id.gamesLayout);
        final LinearLayout limbaje= findViewById(R.id.programmingLayout);


        final Button startBtn = findViewById(R.id.startQuizBtn);


        muzica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName="Music";
                muzica.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
                 fotbal.setBackgroundResource(R.drawable.round_back_white10);
                jocuri.setBackgroundResource(R.drawable.round_back_white10);
                limbaje.setBackgroundResource(R.drawable.round_back_white10);

            }
        });

        fotbal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName="Football";
                muzica.setBackgroundResource(R.drawable.round_back_white10);
                fotbal.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
                jocuri.setBackgroundResource(R.drawable.round_back_white10);
                limbaje.setBackgroundResource(R.drawable.round_back_white10);

            }
        });

        jocuri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName="Games";
                muzica.setBackgroundResource(R.drawable.round_back_white10);
                fotbal.setBackgroundResource(R.drawable.round_back_white10);
                jocuri.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
                limbaje.setBackgroundResource(R.drawable.round_back_white10);

            }
        });
        limbaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName="Programming languages";
                muzica.setBackgroundResource(R.drawable.round_back_white10);
                fotbal.setBackgroundResource(R.drawable.round_back_white10);
                jocuri.setBackgroundResource(R.drawable.round_back_white10);
                limbaje.setBackgroundResource(R.drawable.round_back_white_stroke2_10);

            }
        });
  startBtn.setOnClickListener(new View.OnClickListener() {
      @Override
       public void onClick(View v) {
          Intent intent = new Intent(HomeActivity.this, QuizActivity.class);
          intent.putExtra("selectedTopic",selectedTopicName);
          startActivity(intent);
      }


  });
    }
}