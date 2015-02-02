package ca.ualberta.cs;

import android.os.Bundle;
import android.view.Menu;

import android.view.View;

import android.app.Activity;
import android.content.Intent;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void goaddexpense(View v){
		Intent intent= new Intent(MainActivity.this, AddexpenseActivity.class);
		startActivity(intent);
	}
	public void goaddclaim(View v){
		Intent intent= new Intent(MainActivity.this, ClaimExpenseActivity.class);
		startActivity(intent);
	}
	public void goexpense(View v){
		Intent intent= new Intent(MainActivity.this, ExpenselistActivity.class);
		startActivity(intent);
	}
	public void goclaim(View v){
		Intent intent= new Intent(MainActivity.this, ClaimlistActivity.class);
		startActivity(intent);
	}
	
}
