package org.nsh.days3login.actifity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.nsh.days3login.R;

public class LoginActifity extends AppCompatActivity {
    Button login;
    EditText username, password;


    protected void onCreate (Bundle saveInstanceState) {

        super.onCreate(saveInstanceState);

        setContentView(R.layout.login_relative);

        login=(Button) findViewById(R.id.btnlogin);
        username=(EditText) findViewById(R.id.etusername);
        password=(EditText) findViewById(R.id.etpassword);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (password.getText().toString().toUpperCase().equals("TEST1"))
                {
                    login_sukes();
                }else
                {
                    Toast.makeText(getApplicationContext(),"Salah Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void login_sukes() {
        String user_login = username.getText().toString();
        Intent i = new Intent(this, MainActivity.class);
        //kirimkan tampilan ke tampilan utama
        i.putExtra("USERNAME", user_login);
        startActivity(i);

    }
}
