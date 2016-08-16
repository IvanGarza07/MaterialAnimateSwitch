package com.ivan.materialanimatedswitch;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.ivan.materialanimatedswitchlibrary.MaterialAnimatedSwitch;
import com.ivan.materialanimatedswitchlibrary.MaterialAnimatedSwitchState;

public class MainActivity extends AppCompatActivity {

    MaterialAnimatedSwitch materialAnimatedSwitch;
    MaterialAnimatedSwitch materialAnimatedSwitch2;
    MaterialAnimatedSwitch materialAnimatedSwitch3;
    MaterialAnimatedSwitch materialAnimatedSwitch4;
    MaterialAnimatedSwitch masterSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        materialAnimatedSwitch = (MaterialAnimatedSwitch) findViewById(R.id.pin);
        materialAnimatedSwitch2 = (MaterialAnimatedSwitch) findViewById(R.id.pin2);
        materialAnimatedSwitch3 = (MaterialAnimatedSwitch) findViewById(R.id.pin3);
        materialAnimatedSwitch4 = (MaterialAnimatedSwitch) findViewById(R.id.pin4);
        masterSwitch = (MaterialAnimatedSwitch) findViewById(R.id.masterSwitch);

        materialAnimatedSwitch.setOnCheckedChangeListener(
                new MaterialAnimatedSwitch.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(boolean isChecked) {
                        Toast.makeText(MainActivity.this, materialAnimatedSwitch.isChecked() + "",
                                Toast.LENGTH_SHORT).show();
                        materialAnimatedSwitch2.toggle();
                    }
                });

        materialAnimatedSwitch2.post(new Runnable() {
            @Override
            public void run() {
                materialAnimatedSwitch2.setState(MaterialAnimatedSwitchState.PRESS);
            }
        });
    }
}
