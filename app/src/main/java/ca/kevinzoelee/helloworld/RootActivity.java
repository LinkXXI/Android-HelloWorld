package ca.kevinzoelee.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class RootActivity extends Activity {

    private int tapCount = 0;
    private TextView countLabel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.root);
        this.countLabel = (TextView)findViewById(R.id.lbl_count);
        this.countLabel.setText("Tapped " + tapCount + " times!");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_root, menu);
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

    public void btnTapMePressed(View sender){
        this.tapCount ++;
        this.countLabel.setText("Tapped " + tapCount + " times!");
    }

    public void btnDontTapMePressed(View sender){
        this.tapCount -=10;
        this.countLabel.setText("I told you not to touch that!\n Tapped " + tapCount + " times!");
    }
}
