package soft1614080902336.androidlabs.hzuapps.edu.wuziqi;
	import android.os.Bundle;
		  import android.support.design.widget.FloatingActionButton;
		 import android.support.design.widget.Snackbar;
		 import android.support.v7.app.AppCompatActivity;
		 import android.support.v7.widget.Toolbar;
		 import android.view.View;

		 public class wuziqisr extends AppCompatActivity {

		     @Override
		     protected void onCreate(Bundle savedInstanceState) {
		         super.onCreate(savedInstanceState);
		         setContentView(R.layout.activity_wuziqisr);
	         Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
		         setSupportActionBar(toolbar);

		         FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
		         fab.setOnClickListener(new View.OnClickListener() {
		             @Override
		             public void onClick(View view) {
		                 Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
		                         .setAction("Action", null).show();
