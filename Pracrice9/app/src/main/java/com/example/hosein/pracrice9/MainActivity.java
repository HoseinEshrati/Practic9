package com.example.hosein.pracrice9;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
boolean loginstudent,loginteacher;
    EditText usert,passt;
    Button log;
    String s1,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
intion();
       log.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Student s1 = new Student(getuser(),getpass());
               Teacher t1 = new Teacher(getuser(),getpass());
               Controler c =new Controler();
               loginstudent = c.controlstudent(s1);
               loginteacher=c.controlteacher(t1);

               if (loginstudent){

                   Intent intent = new Intent(MainActivity.this,Sactivity.class);
                   startActivity(intent);

               }

               else if (loginteacher){

                   Intent intent = new Intent(MainActivity.this,Tactivity.class);
                   startActivity(intent);

               }

               else
                   Toast.makeText(MainActivity.this,"username or password is rong",Toast.LENGTH_SHORT).show();
           }
       });
    }

    public String getuser(){
        s1= usert.getText().toString();
        return s1;


    }


    public String getpass(){
        s2= passt.getText().toString();
        return s2;


    }
    public  void intion (){

        usert= (EditText) findViewById(R.id.user);
        passt= (EditText) findViewById(R.id.pass);
        log= (Button) findViewById(R.id.login);


    }


}
