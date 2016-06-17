package acmeacres.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class hello_world extends AppCompatActivity {

    private TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);

        //Get View reference
        mText = (TextView)findViewById(R.id.text);
    }

    public void sayHi(View view) {
        mText.setText(getString(R.string.hello_output));
    }
}
