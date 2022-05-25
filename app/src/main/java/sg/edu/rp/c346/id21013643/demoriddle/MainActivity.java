package sg.edu.rp.c346.id21013643.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // event handling step 1:
    TextView tvQ1;
    Button btnRevealQ1;
    TextView riddle1;
    TextView riddle2;
    TextView tvQ2;
    Button btnRevealQ2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Event handling step 2:
        tvQ1 = findViewById(R.id.textViewQ1);
        btnRevealQ1 = findViewById(R.id.buttonRevealQ1);
        tvQ2 = findViewById(R.id.textViewQ2);
        btnRevealQ2 = findViewById(R.id.buttonRevealQ2);



        // Event handling step 3:

        btnRevealQ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AnswerActivity1.class);
                intent.putExtra("Question", "Q1");
                //riddle1.setText("This word has the same pronunciation even after removing 4 letters from it.");
                startActivity(intent);


            }
        });

        btnRevealQ2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, AnswerActivity2.class);
                intent2.putExtra("Question", "Q2");
                //riddle2.setText("How do you make 1 disappear?");
                startActivity(intent2);
            }
        }));

    }
}