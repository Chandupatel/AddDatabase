package com.example.adddatabase;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class ShowDDD extends AppCompatActivity {
    RecyclerView RescV;
    DataAdpter Dadpter;
    List<User> UserList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       /* setContentView(R.layout.show_ddd);
        RescV = findViewById(R.id.Show_DDDD);
        RescV.setHasFixedSize(true);
        RescV.setLayoutManager(new LinearLayoutManager(this));
        UserList = new ArrayList<>();

        DatabaseReference DataUsr = FirebaseDatabase.getInstance().getReference("USER_DATA");
       /* DataUsr.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()){
                    for (DataSnapshot User_data : dataSnapshot.getChildren()){
                        User Udat = User_data.getValue(User.class);
                        UserList.add(Udat);
                    }
                    Dadpter = new DataAdpter( ShowDDD.this,UserList);
                    RescV.setAdapter(Dadpter);
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
      ///  UserList.add(new User());




*/

    }
}
