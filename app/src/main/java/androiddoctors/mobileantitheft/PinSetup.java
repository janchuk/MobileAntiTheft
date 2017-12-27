package androiddoctors.mobileantitheft;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PinSetup extends AppCompatActivity {

    Button registerPin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin_setup);
        setTitle("PIN Setup");

        registerPin = (Button) findViewById(R.id.registerPin);

        registerPin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PinSetup.this, PinRegistration.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
