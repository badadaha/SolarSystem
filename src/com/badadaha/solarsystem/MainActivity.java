package com.badadaha.solarsystem;

import android.support.v7.app.ActionBarActivity;
//import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
//import android.os.Build;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        RelativeLayout systemContainer = (RelativeLayout)findViewById(R.id.system_container);
        RelativeLayout sunContainer = (RelativeLayout)findViewById(R.id.sun_container);
        RelativeLayout planetsContainer = (RelativeLayout)findViewById(R.id.planets_container);
        
        systemContainer.setOnClickListener(viewListener);
        sunContainer.setOnClickListener(viewListener);
        planetsContainer.setOnClickListener(planetsListener);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }
    
    private OnClickListener viewListener = new OnClickListener(){
    	public void onClick(View view)
        {                        
             Intent myIntent = new Intent(getBaseContext(), ViewSource.class);
             String source = "";
             switch(view.getId()){
             	case R.id.system_container:
             		source = "system";
             	case R.id.sun_container:
             		source = "sun";
             }
             myIntent.putExtra("source", source);
             startActivity(myIntent);
        }
    };
    
    private OnClickListener planetsListener = new OnClickListener(){
    	public void onClick(View view)
        {                        
             Intent myIntent = new Intent(getBaseContext(), PlanetsMenuActivity.class);
             startActivity(myIntent);
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }

}
