package com.fataelislami.latihan2_fataelislami;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class AlmostThere extends AppCompatActivity implements View.OnClickListener {
    Button btnVerify;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost_there);
        btnVerify=findViewById(R.id.btnVerify);
        btnVerify.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
            if(v.getId()==R.id.btnVerify){
                Intent i=new Intent(this,VerifyAccount.class);
                startActivity(i);
            }
    }
}
