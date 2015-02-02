package ca.ualberta.cs;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

import android.widget.EditText;
import android.widget.Toast;

public class AddexpenseActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.addexpense);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.addexpense, menu);
		return true;
	}
	public void addexpenseaction(View v){
		Toast.makeText(this,"Expense added",Toast.LENGTH_SHORT).show();
		Expensecontroller ec = new Expensecontroller();
		EditText textview = (EditText) findViewById(R.id.categoryText1);
		EditText textview1 = (EditText) findViewById(R.id.dateText1);
		EditText textview2 = (EditText) findViewById(R.id.amountspentText);
		EditText textview3 = (EditText) findViewById(R.id.currencyText);
		EditText textview4 = (EditText) findViewById(R.id.decribeText2);
		ec.addExpense(new Expenseitem(textview.getText().toString(), textview1.getText().toString(), textview2.getText().toString(), textview3.getText().toString(), textview4.getText().toString()));
	}

}
