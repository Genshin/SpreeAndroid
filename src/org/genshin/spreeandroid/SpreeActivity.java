package org.genshin.spreeandroid;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SpreeActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spree);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_spree, menu);
        return true;
    }
}
