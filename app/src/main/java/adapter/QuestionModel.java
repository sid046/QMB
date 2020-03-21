package adapter;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.animation.qmb.Filelink;
import com.animation.qmb.R;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class QuestionModel extends RecyclerView.Adapter<QuestionModel.MyViewHolder> {


    private Context context;
    private List<Filelink> filelinks;


    public QuestionModel(Context context, List<Filelink> filelinks) {
        this.context = context;
        this.filelinks = filelinks;
    }


    @NonNull
    @Override
    public QuestionModel.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.question_card, parent, false);
        QuestionModel.MyViewHolder viewHolder = new QuestionModel.MyViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {

        holder.downloadlink.setText(filelinks.get(position).getName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                downloadFile(context,  filelinks.get(position).getName(),".pdf","PDF",filelinks.get(position).getDownloadurl());
                Toast.makeText(context, "Downloading...", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return filelinks.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView downloadlink;
        private String url;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            downloadlink = itemView.findViewById(R.id.downloadQuestion);
        }
    }
    public long downloadFile(Context context, String fileName, String fileExtension, String destinationDirectory, String url) {


        DownloadManager downloadmanager = (DownloadManager) context.
                getSystemService(Context.DOWNLOAD_SERVICE);
        Uri uri = Uri.parse(url);
        DownloadManager.Request request = new DownloadManager.Request(uri);

        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalFilesDir(context, destinationDirectory, fileName + fileExtension);

        return downloadmanager.enqueue(request);
    }
}
