package company.product.dpop.de_pop.projects;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import company.product.dpop.de_pop.R;

/**
 * Created by gaurav on 19/2/18.
 */

public class ProjectDivisionAdapter  extends RecyclerView.Adapter<ProjectDivisionAdapter.ViewHolder>{

    Context context;
    ArrayList<ProjectDivsionModel> projectDivsionModels;

    public ProjectDivisionAdapter(Context context, ArrayList<ProjectDivsionModel> projectDivsionModels) {
        this.context = context;
        this.projectDivsionModels = projectDivsionModels;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
      final  View view = LayoutInflater.from(context).inflate(R.layout.project_division_item,parent,false);
      return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.mProjectDivisionTextView.setText(projectDivsionModels.get(position).getProjectType());
    }

    @Override
    public int getItemCount() {
        return projectDivsionModels.size();
    }

    protected class ViewHolder extends RecyclerView.ViewHolder{

        TextView mProjectDivisionTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            mProjectDivisionTextView = (TextView) itemView.findViewById(R.id.project_division_text);
        }
    }

}
