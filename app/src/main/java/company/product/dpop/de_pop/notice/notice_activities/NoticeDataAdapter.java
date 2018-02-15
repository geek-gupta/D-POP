package company.product.dpop.de_pop.notice.notice_activities;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import company.product.dpop.de_pop.R;

/**
 * Created by gaurav on 15/2/18.
 */

public class NoticeDataAdapter extends RecyclerView.Adapter<NoticeDataAdapter.ViewAdapter> {

    Context context;
    ArrayList<NoticeDataModel> noticeDataModels;

    public NoticeDataAdapter(Context context, ArrayList<NoticeDataModel> noticeDataModels) {
        this.context = context;
        this.noticeDataModels = noticeDataModels;
    }

    @Override
    public ViewAdapter onCreateViewHolder(ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(context).inflate(R.layout.notice_data_item,parent,false);
        return new ViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(ViewAdapter holder, int position) {
        holder.noticeSenderTextView.setText(noticeDataModels.get(position).getNoticeSender());
        holder.noticeSectionTextView.setText(noticeDataModels.get(position).getSectionName());
        holder.noticeSectionTextView.setText(noticeDataModels.get(position).getNoticeData());
    }

    @Override
    public int getItemCount() {
        return noticeDataModels.size();
    }

    protected class ViewAdapter extends RecyclerView.ViewHolder{

        TextView noticeSenderTextView,noticeDataTextView,noticeSectionTextView;

        public ViewAdapter(View itemView) {
            super(itemView);
            noticeDataTextView = (TextView) itemView.findViewById(R.id.notice_sender_id);
            noticeSectionTextView = (TextView) itemView.findViewById(R.id.notice_section_id);
            noticeSenderTextView = (TextView) itemView.findViewById(R.id.notice_sender_id);
        }
    }

}
