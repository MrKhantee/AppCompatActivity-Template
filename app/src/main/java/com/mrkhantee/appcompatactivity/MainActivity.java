package com.mrkhantee.appcompatactivity;

import android.app.*;
import android.os.*;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Toast;
import android.view.Menu;
import android.view.MenuItem;
import android.content.*;
import android.net.*;
import android.graphics.*;
import android.support.v4.content.*;
import android.*;

//import android.net.Uri;
//import android.support.customtabs.CustomTabsIntent;
//import android.*;

// How to draw a circle in Android (onDraw method in View)
// https://alvinalexander.com/android/how-to-draw-circle-in-android-view-ondraw-canvas
public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView(R.layout.main);

		setTitle( "AppCompatActivity - Template" );

    }

	@Override
    public boolean onCreateOptionsMenu( Menu menu )
	{
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater( ).inflate( R.menu.menu_main, menu );
        return true;
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item )
	{
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId( );

        //noinspection SimplifiableIfStatement
        if ( id == R.id.action_settings )
		{
			Toast.makeText(getApplicationContext(), getString(R.string.action_settings), Toast.LENGTH_LONG).show();
            return true;
        }

        return super.onOptionsItemSelected( item );
    }
}
