package com.example.matthustahli.testr;


import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create toolbar object
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar); //binds my object with the layout. Cast the view to toolbar
        setSupportActionBar(myToolbar); //lets toolbar be supported by all android versions

        getSupportActionBar().setTitle(R.string.my_tb_titel); //R=resources... das ding findet man unter values
        //getSupportActionBar().setIcon(R.drawable.my_tb_icon);
        getSupportActionBar().setSubtitle(R.string.my_tb_subtitle);
    }

    // adds the menue bar to the toolbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    // does something, when option is selected in menu bar..
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {       //what does this do?
            case R.id.menu_1:
                Toast.makeText(MainActivity.this, "option one selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_2:
                Toast.makeText(MainActivity.this, "Option 2 selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_3:
                Toast.makeText(MainActivity.this, "Dr hansi isch da", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
