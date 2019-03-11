package com.wang.jiaowowansuiye.bilibili;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonLoginOut;
    private Button buttonPay;
    private Button buttonRegister;
    private Button buttonLogin;
    private Button buttonGetUserInfo;
    private Button buttonCheckLogin;
    private Button buttonNotifyZone;
    private Button buttonCheckRealNameAuth;
    private Button buttonOther;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLoginOut = findViewById(R.id.buttonLoginOut);
        buttonLoginOut.setOnClickListener(this);
        buttonPay = findViewById(R.id.buttonPay);
        buttonPay.setOnClickListener(this);
        buttonRegister = findViewById(R.id.buttonRegister);
        buttonRegister.setOnClickListener(this);
        buttonLogin = findViewById(R.id.buttonLogin);
        buttonLogin.setOnClickListener(this);
        buttonGetUserInfo = findViewById(R.id.buttonGetUserInfo);
        buttonGetUserInfo.setOnClickListener(this);
        buttonCheckLogin = findViewById(R.id.buttonCheckLogin);
        buttonCheckLogin.setOnClickListener(this);
        buttonNotifyZone = findViewById(R.id.buttonNotifyZone);
        buttonNotifyZone.setOnClickListener(this);
        buttonCheckRealNameAuth = findViewById(R.id.buttonCheckRealNameAuth);
        buttonCheckRealNameAuth.setOnClickListener(this);
        buttonOther = findViewById(R.id.buttonOther);
        buttonOther.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonLoginOut:
                Toast.makeText(this,"buttonLoginOut",Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonPay:
                Toast.makeText(this,"buttonPay",Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonRegister:
                Toast.makeText(this,"buttonRegister",Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonLogin:
                Toast.makeText(this,"buttonLogin",Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonGetUserInfo:
                Toast.makeText(this,"buttonGetUserInfo",Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonCheckLogin:
                Toast.makeText(this,"buttonCheckLogin",Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonNotifyZone:
                Toast.makeText(this,"buttonNotifyZone",Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonCheckRealNameAuth:
                Toast.makeText(this,"buttonCheckRealNameAuth",Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonOther:
                Toast.makeText(this,"buttonOther",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
