package android.sample.textviewchangebybutton;

        import android.support.annotation.IdRes;
        import android.support.annotation.Nullable;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.webkit.JavascriptInterface;
        import android.widget.Button;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//      Defining Java Views
        final TextView JavaMainTextView;
        final Button JavaTextChangerButton;

//      Connecting Them to Views
        JavaMainTextView = (TextView) findViewById(R.id.MainTextView);
        JavaTextChangerButton = (Button) findViewById(R.id.TextChangerButton);

//      Main Functions
        JavaTextChangerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JavaMainTextView.setText("Text Changed");
                JavaTextChangerButton.setEnabled(false);
            }
        });
    }
}
