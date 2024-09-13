package vn.edu.usth.weather;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class HomeFragmentPagerAdapter extends FragmentPagerAdapter {
    private final int PAGE_COUNT = 3;
    private String titles[] = new String[] { "Hanoi", "Paris", "Toulouse" };
    public HomeFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public int getCount() {
        return PAGE_COUNT; // number of pages for a ViewPager
    }


    @Override
    public Fragment getItem(int page) {
        switch (page) {
            case 0:
                return Hanoi.newInstance("Hanoi", "Details about Hanoi");
            case 1:
                return Hcm.newInstance("Paris", "Details about Paris");
            case 2:
                return WeatherAndForecastFragment.newInstance("Toulouse", "Details about Toulouse");
        }
        return new EmptyFragment(); // failsafe
    }

    @Override
    public CharSequence getPageTitle(int page) {
// returns a tab title corresponding to the specified page
        return titles[page];
    }
}