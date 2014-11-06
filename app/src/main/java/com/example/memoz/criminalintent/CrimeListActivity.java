package com.example.memoz.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by memoz on 11/4/2014.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}