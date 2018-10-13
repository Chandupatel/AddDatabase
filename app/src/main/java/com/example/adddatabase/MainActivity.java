package com.example.adddatabase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    EditText Et1,Et2,Et3,Et4,Et5;
    Button b1,b2;
    DatabaseReference Drf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Et1 = (EditText)findViewById(R.id.Name);
        Et2 = (EditText)findViewById(R.id.Email);
        Et3 = (EditText)findViewById(R.id.Mobile);
        Et4 =  (EditText)findViewById(R.id.Address);
        Et5 = (EditText)findViewById(R.id.Pass);
        b1 = (Button)findViewById(R.id.Submit);
        b2 = (Button)findViewById(R.id.Show_Class);
        Drf = FirebaseDatabase.getInstance().getReference().child("USER_DATA").child("Parent");

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User  Usr = new User(Et1.getText().toString(),Et2.getText().toString(),
                        Et3.getText().toString(),Et4.getText().toString(),Et5.getText().toString());
                Drf.push().setValue(Usr);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ShowDDD.class));
            }
        });
    }
}
