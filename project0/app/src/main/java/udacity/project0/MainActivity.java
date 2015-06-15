package udacity.project0;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void spotifyStreamer(View view) {
        String appName = "Spotify Stream";
        doToast(appName);
    }

    public void superDuo(View view) {
        String appName = "Super Duo";
        doToast(appName);
    }

    public void buildItBigger(View view) {
        String appName = "Build It Bigger";
        doToast(appName);
    }

    public void xyzReader(View view) {
        String appName = "XYZ Reader";
        doToast(appName);
    }

    public void capstone(View view) {
        String appName = "Capstone";
        doToast(appName);
    }

    /**
     * Helper method to generate and show a toast when a particular button is clicked
     * @param appName
     */
    private void doToast(String appName) {
        String message = String.format("This button will launch my %s app!", appName);
        Toast toast = createToast(message);
        toast.show();
    }

    /**
     * Helper method to instantiate a {@link Toast} instance
     * @param message
     * @return
     */
    private Toast createToast(String message) {
        Context context = getApplicationContext();
        CharSequence text = message;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        return toast;
    }
}
