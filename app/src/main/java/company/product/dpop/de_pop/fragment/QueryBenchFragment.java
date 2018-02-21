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
import company.product.dpop.de_pop.querybench.QueryBenchDivisionAdapter;
import company.product.dpop.de_pop.querybench.QueryBenchDivisionModel;

/**
 * Created by gaurav on 20/2/18.
 */

public class QueryBenchFragment extends Fragment {


    RecyclerView queryRecyclerView;
    ArrayList<QueryBenchDivisionModel> queryItems;
    QueryBenchDivisionAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_query_bench,container,false);
        queryRecyclerView = (RecyclerView) view.findViewById(R.id.query_bench_recycler_view);

        queryItems = new ArrayList<>();

        queryItems.add(new QueryBenchDivisionModel(R.string.TechnicalQuery));
        queryItems.add(new QueryBenchDivisionModel(R.string.SportFestQuery));
        queryItems.add(new QueryBenchDivisionModel(R.string.ProjectQuery));
        queryItems.add(new QueryBenchDivisionModel(R.string.SubjectQuery));
        queryItems.add(new QueryBenchDivisionModel(R.string.AcademicQuery));



        adapter = new QueryBenchDivisionAdapter(getActivity(),queryItems);
        queryRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        queryRecyclerView.setHasFixedSize(true);
        queryRecyclerView.setAdapter(adapter);
        return view;
    }
}
