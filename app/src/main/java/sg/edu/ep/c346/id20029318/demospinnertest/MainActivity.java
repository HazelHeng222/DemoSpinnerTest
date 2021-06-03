package sg.edu.ep.c346.id20029318.demospinnertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spnYesNo;
    TextView yes_no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spnYesNo = findViewById(R.id.spinner);
        yes_no = findViewById(R.id.textView);

        spnYesNo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Toast.makeText(MainActivity.this, "Spinner Item, Yes Selected", Toast.LENGTH_SHORT).show();
                        yes_no.setText("Spinner Item, Yes Selected" );
                        break;

                    case 1:
                        Toast.makeText(MainActivity.this, "Spinner Item, No Selected", Toast.LENGTH_SHORT).show();
                        yes_no.setText("Spinner Item, No Selected" );
                        break;
                }
                /*
                * if  (position == 0) {
                *     yes_no.setText("Spinner Item, Yes Selected" );
                * }
                * else if (position == 1) {
                *     yes_no.setText("Spinner Item, No Selected" );
                * }*/

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}