package ca.ualberta.cs;



import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class ExpenselistActivity extends Activity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.expenselist);
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.expenselist, menu);
		return true;
	}
	public void editExpense(MenuItem menu){
		Toast.makeText(this, "Editing Expense", Toast.LENGTH_SHORT).show();
	}
	public void deleteExpense(MenuItem menu){
		Toast.makeText(this, "Expense Deleted", Toast.LENGTH_SHORT).show();
	}


}
