package company.product.dpop.de_pop.querybench;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import company.product.dpop.de_pop.R;

/**
 * Created by gaurav on 20/2/18.
 */

public class QueryBenchDivisionAdapter extends RecyclerView.Adapter<QueryBenchDivisionAdapter.ViewHolder>{

    Context context;
    ArrayList<QueryBenchDivisionModel> queryBenchDivisionModels;

    public QueryBenchDivisionAdapter(Context context, ArrayList<QueryBenchDivisionModel> queryBenchDivisionModels) {
        this.context = context;
        this.queryBenchDivisionModels = queryBenchDivisionModels;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(context).inflate(R.layout.query_bench_division_item_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.mQueryBenchDivisionTextView.setText(queryBenchDivisionModels.get(position).getDivisionName());

    }

    @Override
    public int getItemCount() {
        return queryBenchDivisionModels.size();
    }

    protected class ViewHolder extends RecyclerView.ViewHolder{

        TextView mQueryBenchDivisionTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            mQueryBenchDivisionTextView = (TextView) itemView.findViewById(R.id.query_division_text_id);
        }
    }

}
