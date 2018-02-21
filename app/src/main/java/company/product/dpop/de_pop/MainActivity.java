package company.product.dpop.de_pop;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.Window;

import java.util.ArrayList;

import company.product.dpop.de_pop.fragment.TabPagerAdapter;

public class MainActivity extends AppCompatActivity implements ActionBar.TabListener {

    ViewPager viewPager;
    TabPagerAdapter pagerAdapter;
    ActionBar actionBar;
    ArrayList<String> tabs;
    private ActionBar mActionBar;


    @TargetApi(Build.VERSION_CODES.M)
    @SuppressLint("ResourceType")
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mActionBar = getSupportActionBar();
        mActionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#CDDC39")));
        mActionBar.setStackedBackgroundDrawable(new ColorDrawable(Color.parseColor("#CDDC39")));


        viewPager = (ViewPager) findViewById(R.id.main_viewPager);
        actionBar = getSupportActionBar();
        pagerAdapter = new TabPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);
        if(actionBar!=null)
            actionBar.setNavigationMode(android.app.ActionBar.NAVIGATION_MODE_TABS);
        tabs = new ArrayList<>();
        tabs.add("Notice");
        tabs.add("Project");
        tabs.add("Query");
        for (String curr:tabs) {
            actionBar.addTab(actionBar.newTab().
                    setText(curr).setTabListener( MainActivity.this));
        }
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                actionBar.setSelectedNavigationItem(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        viewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = new MenuInflater(this);
        menuInflater.inflate(R.menu.main_activity_menu,menu);
        return true;
    }

}
