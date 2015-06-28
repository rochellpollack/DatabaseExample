package com.example.rachel.databaseexample;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    DBAdapter dbAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        dbAdapter = new DBAdapter(this);

        //generate a few employee objects
        Employee joe = new Employee("Joe Mile","joemile@example.com");
        Employee mike = new Employee("Mike Muster","mikemuster@example.com");
        Employee john = new Employee("John Conner","johnconner@example.com");

        //insert new employee record to databases
        dbAdapter.open();
        dbAdapter.insert(joe);
        dbAdapter.insert(mike);
        dbAdapter.insert(john);
        dbAdapter.close();




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
