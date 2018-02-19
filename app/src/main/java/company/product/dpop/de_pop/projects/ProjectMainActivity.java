package company.product.dpop.de_pop.projects;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import company.product.dpop.de_pop.R;
import company.product.dpop.de_pop.notice.NoticeDivisionAdapter;

public class ProjectMainActivity extends AppCompatActivity {

    RecyclerView mProjectDivisionRecyclerView;
    ArrayList<ProjectDivsionModel> mProjectDivsionModels;
    ProjectDivisionAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_main);

        mProjectDivisionRecyclerView = (RecyclerView) findViewById(R.id.project_division_recycler_view);
        mProjectDivsionModels = new ArrayList<>();

        mProjectDivsionModels.add(new ProjectDivsionModel(R.string.minor));
        mProjectDivsionModels.add(new ProjectDivsionModel(R.string.major));
        mProjectDivsionModels.add(new ProjectDivsionModel(R.string.miscProject));

        adapter = new ProjectDivisionAdapter(this,mProjectDivsionModels);

        mProjectDivisionRecyclerView.setHasFixedSize(true);
        mProjectDivisionRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mProjectDivisionRecyclerView.setAdapter(adapter);

    }
}
