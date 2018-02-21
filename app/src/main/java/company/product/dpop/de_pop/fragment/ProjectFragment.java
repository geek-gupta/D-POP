package company.product.dpop.de_pop.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import company.product.dpop.de_pop.R;
import company.product.dpop.de_pop.notice.NoticeDivisionAdapter;
import company.product.dpop.de_pop.notice.NoticeTypeModel;
import company.product.dpop.de_pop.projects.ProjectDivisionAdapter;
import company.product.dpop.de_pop.projects.ProjectDivsionModel;

/**
 * Created by gaurav on 20/2/18.
 */

public class ProjectFragment extends Fragment {
    RecyclerView projectRecyclerView;
    ArrayList<ProjectDivsionModel> projectItems;
    ProjectDivisionAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_project_main,container,false);
        projectRecyclerView = (RecyclerView) view.findViewById(R.id.project_division_recycler_view);

        projectItems = new ArrayList<>();

        projectItems.add(new ProjectDivsionModel(R.string.major));
        projectItems.add(new ProjectDivsionModel(R.string.minor));
        projectItems.add(new ProjectDivsionModel(R.string.miscProject));

        adapter = new ProjectDivisionAdapter(getActivity(),projectItems);
        projectRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        projectRecyclerView.setHasFixedSize(true);
        projectRecyclerView.setAdapter(adapter);
        return view;

    }
}
