package android.sample.shortcutsbybutton;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//  Defining Variables
    Button JavaDialButton,JavaWebsiteButton,JavaMapButton;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Initialize(); //Connecting Variables to Views by Another Method

//      Main Functions
//        Dialing Function
        JavaDialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent CallRayanRooyeshDial = new Intent(Intent.ACTION_DIAL , Uri.parse("tel:02433440919"));
                /* Also Can Be Written Like This :
                   Intent CallRayanRooyeshDial = new Intent(Intent.ACTION_DIAL);
                   CallRayanRooyeshDial.setData(Uri.parse("tel:02433440919"));
                 */
                startActivity(CallRayanRooyeshDial);
            }
        });
//        Website Function
        JavaWebsiteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent CallRayanRooyeshWebsite = new Intent(Intent.ACTION_VIEW , Uri.parse("http://rayanrooyesh.ir"));
                /* Also Can Be Written Like This :
                   Intent CallRayanRooyeshWebsite = new Intent(Intent.ACTION_VIEW); صحیفه امام ـ جلد 1
                   CallRayanRooyeshWebsite.setData(Uri.parse("http://rayanrooyesh.ir"));
                 */
                startActivity(CallRayanRooyeshWebsite);
            }
        });
//        Map Function
        JavaMapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent CallRayanRooyeshMap = new Intent(Intent.ACTION_VIEW , Uri.parse("geo:36.673285, 48.489718"));
                /* Also Can Be Written Like This :
                   Intent CallRayanRooyeshMap = new Intent(Intent.ACTION_VIEW);
                   CallRayanRooyeshMap.setData(Uri.parse("geo:36.673285, 48.489718"));
                 */
                startActivity(CallRayanRooyeshMap);
            }
        });
    }

    private void Initialize() {
//      Connecting Them to Views
        JavaDialButton = (Button) findViewById(R.id.DialButton);
        JavaWebsiteButton = (Button) findViewById(R.id.WebSiteButton);
        JavaMapButton = (Button) findViewById(R.id.MapButton);
    }
}
