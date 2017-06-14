package android.sample.textviewchangebyedittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//      Defining Variables
        final EditText JavaTextChangerEditText;
        Button JavaTextChangerButton;
        final TextView JavaTextChangingTextView;

//      Connecting Them to Views
        JavaTextChangerEditText = (EditText) findViewById(R.id.TextChangerEditText);
        JavaTextChangerButton = (Button) findViewById(R.id.TextChangerButton);
        JavaTextChangingTextView = (TextView) findViewById(R.id.TextChangingTextView);

//      Main Function
        JavaTextChangerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    String Text = JavaTextChangerEditText.getText().toString();
                    JavaTextChangingTextView.setText(Text);
            }
        });
    }
}
