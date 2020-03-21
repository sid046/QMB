package adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.animation.qmb.Filelink1;
import com.animation.qmb.QuestionPaper;
import com.animation.qmb.R;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class subjectAdapter extends RecyclerView.Adapter<subjectAdapter.MyViewHolder> {


    private Context context;
    private List<Filelink1> filelinks;


    public subjectAdapter(Context context, List<Filelink1> filelinks) {
        this.context = context;
        this.filelinks = filelinks;
    }

    @NonNull
    @Override
    public subjectAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.subject_card,parent,false);
        subjectAdapter.MyViewHolder viewHolder = new subjectAdapter.MyViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {
        holder.downloadlink.setText(filelinks.get(position).getDownloadurl());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent i = new Intent(context, QuestionPaper.class);
                    Bundle b = new Bundle();
                    b.putString("subjectName", filelinks.get(position).getDownloadurl());
                    i.putExtras(b);
                    context.startActivity(i);
                }catch (Exception e) {
                    Log.d("ANSOFT",e.getMessage());
                }

//                    Intent j = new Intent(context, ScQuestion.class);
//                    Bundle c = new Bundle();
//                    c.putString("subjectXI",filelinks.get(position).getDownloadurl());
//                    j.putExtras(c);
//                    context.startActivity(j);
//
//                    Intent k = new Intent(context, Sc2Question.class);
//                    Bundle d = new Bundle();
//                    d.putString("subjectXII",filelinks.get(position).getDownloadurl());
//                    k.putExtras(d);
//                    context.startActivity(k);

            }
        });


    }






    @Override
    public int getItemCount() {
        return filelinks.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView downloadlink;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            downloadlink = itemView.findViewById(R.id.downloadLink);
        }


    }
}
