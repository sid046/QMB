package com.animation.qmb;


import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.os.Bundle;

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


public class QuestionPaper extends AppCompatActivity {



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
        setContentView(R.layout.activity_question_paper);

        listView = findViewById(R.id.listview1);
        progressDialog=new ProgressDialog(this);
        progressDialog.setMessage("Please Wait Loading....");

        Bundle b = getIntent().getExtras();
        subject_Name = b.getString("subjectName");

        SharedPreferences sharedPreferences = getSharedPreferences("Class",MODE_PRIVATE);
        final String Class =sharedPreferences.getString("Class","");
//        final String Branch =sharedPreferences.getString("Branch","");

        firebaseDatabase= FirebaseDatabase.getInstance();
//        if (Class.equals("class11") || Class.equals("class12")){
//            databaseReference=firebaseDatabase.getReference(Class).child(Branch).child(subject_Name);
////            databaseReference = firebaseDatabase.getReference(Class).child("Management").child(subject_Name);
//        }
//
//        else {
            databaseReference = firebaseDatabase.getReference(Class).child(subject_Name);
//        }
        filelinks = new ArrayList<>();
        QuestionModel = new QuestionModel(QuestionPaper.this,filelinks);
        progressDialog.show();
        listView.setLayoutManager(new LinearLayoutManager(QuestionPaper.this));
        listView.setAdapter(QuestionModel);

        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {


               // Toast.makeText(QuestionPaper.this,"Count is:"+dataSnapshot.getChildrenCount(), Toast.LENGTH_SHORT).show();

                for (DataSnapshot ds: dataSnapshot.getChildren()){
                    Filelink filelink = ds.getValue(Filelink.class);
                   // Toast.makeText(QuestionPaper.this, "key is :"+filelink.getDownloadurl(), Toast.LENGTH_SHORT).show();

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
