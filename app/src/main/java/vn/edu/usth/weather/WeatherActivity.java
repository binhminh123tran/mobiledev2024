package vn.edu.usth.weather;

<<<<<<< HEAD
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
=======
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.ScrollView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import vn.edu.usth.weather.ForecastFragment;
>>>>>>> 6974e102eef7a095ba53d828ac984daa625ee03d


public class WeatherActivity extends AppCompatActivity {
    private static final String TAG = "WeatherActivity";
<<<<<<< HEAD

=======
//    private ScrollView scrollView;
>>>>>>> 6974e102eef7a095ba53d828ac984daa625ee03d

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
<<<<<<< HEAD
        setContentView(R.layout.viewpager);

        PagerAdapter adapter = new HomeFragmentPagerAdapter(
                getSupportFragmentManager());


        ViewPager pager = (ViewPager) findViewById(R.id.viewpage);


        pager.setOffscreenPageLimit(3);
        pager.setAdapter(adapter);


=======
        setContentView(R.layout.activity_weather);
>>>>>>> 6974e102eef7a095ba53d828ac984daa625ee03d

        Log.i(TAG, "onCreate: Activity created");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: Activity started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: Activity resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: Activity paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: Activity stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: Activity destroyed");
    }


}

