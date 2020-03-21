package com.animation.qmb.bsc;


import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.Toast;

import com.animation.qmb.Filelink;
import com.animation.qmb.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import adapter.QuestionModel;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class agp extends AppCompatActivity {

    private ProgressDialog progressDialog;
    RecyclerView listView;
    DatabaseReference databaseReference;
    FirebaseDatabase firebaseDatabase;

    private List<Filelink> filelinks;
    adapter.QuestionModel QuestionModel;
    String subject_Name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.management);

        progressDialog=new ProgressDialog(this);
        progressDialog.setMessage("Please Wait Loading...");
        listView = findViewById(R.id.listview1);

        Bundle b = getIntent().getExtras();
        subject_Name = b.getString("subjectName");

        firebaseDatabase=firebaseDatabase.getInstance();
        databaseReference=firebaseDatabase.getReference("Quantum_Model_Book").child("BSC-Agri").child(subject_Name);

        filelinks = new ArrayList<>();
        progressDialog.show();
        QuestionModel = new QuestionModel(agp.this,filelinks);
        listView.setLayoutManager(new LinearLayoutManager(agp.this));
        listView.setAdapter(QuestionModel);

        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Toast.makeText(agp.this,"Count is:"+dataSnapshot.getChildrenCount(), Toast.LENGTH_SHORT).show();

                for (DataSnapshot ds: dataSnapshot.getChildren()){
                    Filelink filelink = ds.getValue(Filelink.class);
                    //Toast.makeText(agp.this, "key is :"+filelink.getDownloadurl(), Toast.LENGTH_SHORT).show();

                    filelinks.add(new Filelink(filelink.getDownloadurl(),filelink.getName()));
                    QuestionModel.notifyDataSetChanged();
                }
                progressDialog.dismiss();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
