package com.unisannio.gdevanno.uitogglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ToggleButton;

public class ToggleButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);

        //Get a reference to a background container
        final LinearLayout bg = (LinearLayout) findViewById(R.id.linearlayout);
        bg.setBackgroundColor(0xFF000000);

        //Get a reference to the ToggleButton
        final ToggleButton tbutton = (ToggleButton) findViewById(R.id.togglebutton);

        //Set onClickListener on the ToggleButton

        tbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Toggle the Background color between a light and dark color
                if(tbutton.isChecked()){
                    bg.setBackgroundColor(0xFFF3F3F3);
                }else{
                    bg.setBackgroundColor(0xFF000000);
                }
            }
        });

    }
}