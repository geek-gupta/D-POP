package company.product.dpop.de_pop.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import company.product.dpop.de_pop.R;
import company.product.dpop.de_pop.notice.NoticeDivisionAdapter;
import company.product.dpop.de_pop.notice.NoticeTypeModel;

/**
 * Created by gaurav on 20/2/18.
 */

public class NoticeFragment extends Fragment {
    RecyclerView noticeRecyclerView;
    ArrayList<NoticeTypeModel> notices;
    NoticeDivisionAdapter adapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_notice_division,container,false);

        noticeRecyclerView = (RecyclerView) view.findViewById(R.id.notice_division_recycler_view);

        notices = new ArrayList<>();

        notices.add(new NoticeTypeModel(R.string.Department_Notice));
        notices.add(new NoticeTypeModel(R.string.Project_notice));
        notices.add(new NoticeTypeModel(R.string.hod_notice));
        notices.add(new NoticeTypeModel(R.string.Fest_notice));
        notices.add(new NoticeTypeModel(R.string.Exam_notice));
        notices.add(new NoticeTypeModel(R.string.Assignment_notice));

        adapter = new NoticeDivisionAdapter(getActivity(),notices);
        noticeRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));
        noticeRecyclerView.setHasFixedSize(true);
        noticeRecyclerView.setAdapter(adapter);
        return view;
    }
}
