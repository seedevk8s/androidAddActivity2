package kr.co.myactivity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_launcher);
        setTitle("메인 액티비티 (수정)");

        final RadioButton rdoSecond = findViewById(R.id.rdoSecond);

        Button btnNewActivity = findViewById(R.id.btnNewActivity);
        btnNewActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;

                if (rdoSecond.isChecked() == true)
                    intent = new Intent(getApplicationContext(), SecondActivity.class);
                else
                    intent = new Intent(getApplicationContext(), ThirdActivity.class);

                startActivity(intent);

            }
        });
    }
}
























