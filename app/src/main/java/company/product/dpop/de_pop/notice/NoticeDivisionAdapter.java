package company.product.dpop.de_pop.notice;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import company.product.dpop.de_pop.R;

/**
 * Created by gaurav on 15/2/18.
 */

public class NoticeDivisionAdapter extends RecyclerView.Adapter<NoticeDivisionAdapter.AdapterView> {

    Context context;
    ArrayList<NoticeTypeModel> noticeTypeModels;

    public NoticeDivisionAdapter(Context context, ArrayList<NoticeTypeModel> noticeTypeModels) {
        this.context = context;
        this.noticeTypeModels = noticeTypeModels;
    }

    @Override
    public AdapterView onCreateViewHolder(ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(context).inflate(R.layout.notice_items,parent,false);
        return new AdapterView(view);
    }

    @Override
    public void onBindViewHolder(AdapterView holder, int position) {
        holder.noticeTextView.setText(noticeTypeModels.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return noticeTypeModels.size();
    }

    protected class AdapterView extends RecyclerView.ViewHolder{

        TextView noticeTextView;

       public AdapterView(View itemView) {
           super(itemView);
           noticeTextView = (TextView) itemView.findViewById(R.id.notice_text);
       }
   }
}
