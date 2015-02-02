package ca.ualberta.cs;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class ClaimlistActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.claimlist);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.claimlist, menu);
		return true;
	}
	public void editClaim(MenuItem menu){
		Toast.makeText(this, "Editing Claim", Toast.LENGTH_SHORT).show();
	}
	public void deleteClaim(MenuItem menu){
		Toast.makeText(this, "Claim Deleted", Toast.LENGTH_SHORT).show();
	}
	public void emailClaim(MenuItem menu){
		Toast.makeText(this, "sending Claim", Toast.LENGTH_SHORT).show();
	}
}
