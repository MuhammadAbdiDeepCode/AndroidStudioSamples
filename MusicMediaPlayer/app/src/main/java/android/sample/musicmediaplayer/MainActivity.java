package android.sample.musicmediaplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    int MusicPlaying = 0;
    MediaPlayer MusicPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button JavaHamedHomayoun_PeopleOfTheCity;
        JavaHamedHomayoun_PeopleOfTheCity = (Button) findViewById(R.id.HamedHomayoun_PeopleOfTheCity);

        final Button JavaHomayounShajarian_CheraRafti;
        JavaHomayounShajarian_CheraRafti = (Button) findViewById(R.id.HomayounShajarian_CheraRafti);

        JavaHamedHomayoun_PeopleOfTheCity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(MusicPlaying==0){
                    MusicPlaying = 1;
                    MusicPlayer = MediaPlayer.create(MainActivity.this , R.raw.hamed_homayoun_people_of_the_city);
                    MusicPlayer.start();
                    JavaHamedHomayoun_PeopleOfTheCity.setText("Pause");
                    JavaHomayounShajarian_CheraRafti.setEnabled(false);
                }
                else{
                    MusicPlaying = 0;
                    MusicPlayer.stop();
                    JavaHamedHomayoun_PeopleOfTheCity.setText("Play");
                    JavaHomayounShajarian_CheraRafti.setEnabled(true);
                }
            }
        });

        JavaHomayounShajarian_CheraRafti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(MusicPlaying==0){
                    MusicPlaying = 1;
                    MusicPlayer = MediaPlayer.create(MainActivity.this , R.raw.homayoun_shajarian_chera_rafti);
                    MusicPlayer.start();
                    JavaHomayounShajarian_CheraRafti.setText("Pause");
                    JavaHamedHomayoun_PeopleOfTheCity.setEnabled(false);
                }
                else{
                    MusicPlaying = 0;
                    MusicPlayer.stop();
                    JavaHomayounShajarian_CheraRafti.setText("Play");
                    JavaHamedHomayoun_PeopleOfTheCity.setEnabled(true);
                }
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        MusicPlayer.stop();
        finish();
    }
}
