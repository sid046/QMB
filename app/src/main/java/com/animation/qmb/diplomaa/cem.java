package com.animation.qmb.diplomaa;



import android.app.ProgressDialog;
import android.os.Bundle;

import com.animation.qmb.Filelink1;
import com.animation.qmb.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import adapter.subjectAdapter;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

//import androidx.annotation.NonNull;



public class cem extends AppCompatActivity {

    private ProgressDialog progressDialog;
    RecyclerView listView;
    DatabaseReference databaseReference;
    FirebaseDatabase firebaseDatabase;
    private List<Filelink1> filelinks;
    adapter.subjectAdapter subjectAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cem);

        listView = findViewById(R.id.listview);
        progressDialog=new ProgressDialog(this);
        progressDialog.setMessage("Please Wait Loading....");


        firebaseDatabase  = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("class8");
        filelinks = new ArrayList<>();
        subjectAdapter = new subjectAdapter(cem.this,filelinks);
        progressDialog.show();
        listView.setLayoutManager(new LinearLayoutManager(cem.this));
        listView.setAdapter(subjectAdapter);
        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                //Toast.makeText(cs8.this,"Count is:"+dataSnapshot.getChildrenCount(), Toast.LENGTH_SHORT).show();
                for (DataSnapshot ds: dataSnapshot.getChildren()){
                    //  Toast.makeText(cs8.this, "key is :"+ds.getKey(), Toast.LENGTH_SHORT).show();
                    filelinks.add(new Filelink1(ds.getKey()));
                    subjectAdapter.notifyDataSetChanged();
                }
                progressDialog.dismiss();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });




    }



}
