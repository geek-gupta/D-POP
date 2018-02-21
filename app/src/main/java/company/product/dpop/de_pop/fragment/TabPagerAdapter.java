package company.product.dpop.de_pop.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by gaurav on 20/2/18.
 */
public class TabPagerAdapter extends FragmentPagerAdapter {

    public TabPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment currFragment = null;
        switch (position) {
            case 0:
                currFragment = new NoticeFragment();
                break;
            case 1:
                currFragment = new ProjectFragment();
                break;
            case 2:
                currFragment = new QueryBenchFragment();
                break;
        }
        return currFragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
