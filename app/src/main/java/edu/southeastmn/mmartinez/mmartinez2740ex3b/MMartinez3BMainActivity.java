package edu.southeastmn.mmartinez.mmartinez2740ex3b;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

//Imports for Button and EditText;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MMartinez3BMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mmartinez3_bmain);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        // ---------- loop1Button event handler ----------
        Button loop1Button = (Button) findViewById(R.id.loop1Button);
        loop1Button.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                do_loop1Button_onClick(v);
            }
        });

        // ---------- loop2Button event handler ----------
        Button loop2Button = (Button) findViewById(R.id.loop2Button);
        loop2Button.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                do_loop2Button_onClick(v);
            }
        });
        // ---------- loop3Button event handler ----------
        Button loop3Button = (Button) findViewById(R.id.loop3Button);
        loop3Button.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                do_loop3Button_onClick(v);
            }
        });
        // ---------- loop4Button event handler ----------
        Button loop4Button = (Button) findViewById(R.id.loop4Button);
        loop4Button.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                do_loop4Button_onClick(v);
            }
        });
    }

    protected void do_loop1Button_onClick(View v) {
        // Get references to EditText boxes
        EditText inputNumberseditText = (EditText) findViewById(R.id.inputNumberseditText);
        TextView outputTextView = (TextView) findViewById(R.id.outputTextView);

        // Get user's input
        Loops loops = new Loops(inputNumberseditText.getText().toString());

        //Display result
        outputTextView.setText(loops.loop1());
    }
    protected void do_loop2Button_onClick(View v) {
        // Get references to EditText boxes
        EditText inputNumberseditText = (EditText) findViewById(R.id.inputNumberseditText);
        TextView outputTextView = (TextView) findViewById(R.id.outputTextView);

        // Get user's input
        Loops loops = new Loops(inputNumberseditText.getText().toString());

        //Display result
        outputTextView.setText(loops.loop2());
    }
    protected void do_loop3Button_onClick(View v) {
        // Get references to EditText boxes
        EditText inputNumberseditText = (EditText) findViewById(R.id.inputNumberseditText);
        TextView outputTextView = (TextView) findViewById(R.id.outputTextView);

        // Get user's input
        Loops loops = new Loops(inputNumberseditText.getText().toString());

        //Display result
        outputTextView.setText(loops.loop3());
    }
    protected void do_loop4Button_onClick(View v) {
        // Get references to EditText boxes
        EditText inputNumberseditText = (EditText) findViewById(R.id.inputNumberseditText);
        TextView outputTextView = (TextView) findViewById(R.id.outputTextView);

        // Get user's input
        Loops loops = new Loops(inputNumberseditText.getText().toString());

        //Display result
        outputTextView.setText(loops.loop4());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_mmartinez3_bmain, menu);
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
