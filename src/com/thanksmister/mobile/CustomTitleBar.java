package com.thanksmister.mobile;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ListView;
import android.widget.TextView;

public class CustomTitleBar extends Activity 
{
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
       
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);	
        
		setContentView(R.layout.main);
		
		getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.title);		

		((TextView) findViewById(R.id.title)).setText("Favorite Fruit");
		
		String[] names = new String[] { "Apples", "Oranges", "Grapes", "Strawberries", "Mulberries", "Peaches", "Blueberries", "Dates", "Rasberries", "Bananas" };
		
		ListView listView = (ListView) findViewById(R.id.content);

		listView.setAdapter(new CustomListAdapter(this, names));
    }
}