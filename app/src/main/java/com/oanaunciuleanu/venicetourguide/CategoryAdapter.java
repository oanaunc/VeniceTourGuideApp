package com.oanaunciuleanu.venicetourguide;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class CategoryAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;


    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MonumentsFragment();
        } else if (position == 1) {
            return new BridgesFragment();
        } else if (position == 2) {
            return new PizzaFragment();
        } else {
            return new IceCreamFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_monuments);
        } else if (position == 1) {
            return mContext.getString(R.string.category_bridges);
        } else if (position == 2) {
            return mContext.getString(R.string.category_pizza);
        } else {
            return mContext.getString(R.string.category_iceCream);
        }
    }
}
