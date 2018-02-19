package company.product.dpop.de_pop.login;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import company.product.dpop.de_pop.MainActivity;
import company.product.dpop.de_pop.R;

public class LoginActivity extends AppCompatActivity {

    Button mSignnUpActivity,mLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mSignnUpActivity = (Button) findViewById(R.id.signUpButton);
        mLoginButton = (Button) findViewById(R.id.loginButton);

        mSignnUpActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),RegisterPickerActivity.class);
                startActivity(intent);
            }
        });

        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
                finishAffinity();
            }
        });


    }

}
