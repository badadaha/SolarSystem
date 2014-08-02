package com.badadaha.solarsystem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;

public class PlanetsMenuActivity extends Activity {
	
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.planets_menu);
        
        RelativeLayout mercury = (RelativeLayout)findViewById(R.id.mercury_container);
        RelativeLayout venus = (RelativeLayout)findViewById(R.id.venus_container);
        RelativeLayout earth = (RelativeLayout)findViewById(R.id.earth_container);
        RelativeLayout mars = (RelativeLayout)findViewById(R.id.mars_container);
        RelativeLayout saturn = (RelativeLayout)findViewById(R.id.saturn_container);
        RelativeLayout jupiter = (RelativeLayout)findViewById(R.id.jupiter_container);
        RelativeLayout neptune = (RelativeLayout)findViewById(R.id.neptune_container);
        RelativeLayout uranus = (RelativeLayout)findViewById(R.id.uranus_container);
        
        mercury.setOnClickListener(mainListener);
        venus.setOnClickListener(mainListener);
        earth.setOnClickListener(mainListener);
        mars.setOnClickListener(mainListener);
        saturn.setOnClickListener(mainListener);
        jupiter.setOnClickListener(mainListener);
        neptune.setOnClickListener(mainListener);
        uranus.setOnClickListener(mainListener);
        
    }
	
	private OnClickListener mainListener = new OnClickListener(){
    	public void onClick(View view)
        {                        
             Intent myIntent = new Intent(getBaseContext(), ViewSource.class);
             String source = "";
             switch(view.getId()){
             	case R.id.mercury_container:
             		source = "mercury";
             		break;
             	case R.id.venus_container:
             		source = "venus";
             		break;
             	case R.id.earth_container:
             		source = "earth";
             		break;
             	case R.id.mars_container:
             		source = "mars";
             		break;
             	case R.id.saturn_container:
             		source = "saturn";
             		break;
             	case R.id.jupiter_container:
             		source = "jupiter";
             		break;
             	case R.id.neptune_container:
             		source = "neptune";
             		break;
             	case R.id.uranus_container:
             		source = "uranus";
             		break;
             }
             myIntent.putExtra("source", source);
             startActivity(myIntent);
        }
    };
    
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if ((keyCode == KeyEvent.KEYCODE_BACK))
        {
            finish();
        }
        return super.onKeyDown(keyCode, event);
    }
	
}
