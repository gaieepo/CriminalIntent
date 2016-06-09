package com.example.CriminalIntent;

import android.app.Fragment;

/**
 * Created by gaieepo on 9/6/2016.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
