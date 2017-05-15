package sdu.sitta.sob2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText Ename;
    EditText Eusername;
    EditText Epassword;

    String strName;
    String strUsername;
    String strPassword;

    String UserName_SOB = "admin";
    String Password_SOB = "1234";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void btnLOGIN(View view){

        Ename = (EditText) findViewById(R.id.E_name);
        Eusername = (EditText) findViewById(R.id.E_username);
        Epassword = (EditText) findViewById(R.id.E_password);

        strName = Ename.getText().toString();
        strUsername = Eusername.getText().toString();
        strPassword = Epassword.getText().toString();

        if(strName.equals("") || strUsername.equals("") || strPassword.equals("")){
            Toast.makeText(this, "กรอกข้อมูลให้ครบ", Toast.LENGTH_SHORT).show();
        }
        else if(!strUsername.equals(UserName_SOB) || !strPassword.equals(Password_SOB)){
            Toast.makeText(this, "Username และ Password ผิดพลาาด \n                    Login False", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Login.this,GOLD.class);
            intent.putExtra("Name",strName);
            startActivity(intent);
        }
    }
}
