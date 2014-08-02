package com.badadaha.solarsystem;

import java.io.InputStream;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;

public class ViewSource extends Activity {
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_source);
        
        Bundle extras = getIntent().getExtras();
        String source = extras.getString("source");
        
        setView(source);
    }
	
	private void setView(String source){
		
		TextView srcTitle = (TextView)findViewById(R.id.tvTitle);
		TextView srcTxt = (TextView)findViewById(R.id.tvSource);
		
		String result = "";
		InputStream in_s = null;
		
	    try {
	        Resources res = getResources();
	        switch(source){
		        case "system":
	        		this.setTitle(R.string.main);
	        		srcTitle.setCompoundDrawablesWithIntrinsicBounds(R.drawable.system, 0, 0, 0);
	    	        srcTitle.setText(R.string.main);
	        		in_s = res.openRawResource(R.raw.system);
	        		break;
	        	case "sun":
	        		this.setTitle(R.string.sun);
	        		srcTitle.setCompoundDrawablesWithIntrinsicBounds(R.drawable.sun, 0, 0, 0);
	    	        srcTitle.setText(R.string.sun);
	        		in_s = res.openRawResource(R.raw.sun);
	        		break;
	        	case "mercury":
	        		this.setTitle(R.string.mercury);
	        		srcTitle.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mercury, 0, 0, 0);
	    	        srcTitle.setText(R.string.mercury);
	        		in_s = res.openRawResource(R.raw.mercury);
	        		break;
	        	case "venus":
	        		this.setTitle(R.string.venus);
	        		srcTitle.setCompoundDrawablesWithIntrinsicBounds(R.drawable.venus, 0, 0, 0);
	    	        srcTitle.setText(R.string.venus);
	        		in_s = res.openRawResource(R.raw.venus);
	        		break;
	        	case "earth":
	        		this.setTitle(R.string.earth);
	        		srcTitle.setCompoundDrawablesWithIntrinsicBounds(R.drawable.earth, 0, 0, 0);
	    	        srcTitle.setText(R.string.earth);
	        		in_s = res.openRawResource(R.raw.earth);
	        		break;
	        	case "mars":
	        		this.setTitle(R.string.mars);
	        		srcTitle.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mars, 0, 0, 0);
	    	        srcTitle.setText(R.string.mars);
	        		in_s = res.openRawResource(R.raw.mars);
	        		break;
	        	case "saturn":
	        		this.setTitle(R.string.saturn);
	        		srcTitle.setCompoundDrawablesWithIntrinsicBounds(R.drawable.saturn, 0, 0, 0);
	    	        srcTitle.setText(R.string.saturn);
	        		in_s = res.openRawResource(R.raw.saturn);
	        		break;
	        	case "jupiter":
	        		this.setTitle(R.string.jupiter);
	        		srcTitle.setCompoundDrawablesWithIntrinsicBounds(R.drawable.jupiter, 0, 0, 0);
	    	        srcTitle.setText(R.string.jupiter);
	        		in_s = res.openRawResource(R.raw.jupiter);
	        		break;
	        	case "neptune":
	        		this.setTitle(R.string.neptune);
	        		srcTitle.setCompoundDrawablesWithIntrinsicBounds(R.drawable.neptune, 0, 0, 0);
	    	        srcTitle.setText(R.string.neptune);
	        		in_s = res.openRawResource(R.raw.neptune);
	        		break;
	        	case "uranus":
	        		this.setTitle(R.string.uranus);
	        		srcTitle.setCompoundDrawablesWithIntrinsicBounds(R.drawable.uranus, 0, 0, 0);
	    	        srcTitle.setText(R.string.uranus);
	        		in_s = res.openRawResource(R.raw.uranus);
	        		break;
	        }
	        srcTitle.setCompoundDrawablePadding(10);

	        byte[] b = new byte[in_s.available()];
	        in_s.read(b);
	        result = new String(b);
	    } catch (Exception e) {
	        // e.printStackTrace();
	        result = "Error: can't show file.";
	    }
	    
	    srcTxt.setText(result);
		
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event)
	{
	    if ((keyCode == KeyEvent.KEYCODE_BACK))
	        finish();
	    
	    return super.onKeyDown(keyCode, event);
	}
	
}
