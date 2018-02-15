package company.product.dpop.de_pop.notice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;


import company.product.dpop.de_pop.R;

import static company.product.dpop.de_pop.R.string.Department_Notice;

public class NoticeDivision extends AppCompatActivity {

    RecyclerView mNoticeRecylcerView;
    ArrayList<NoticeTypeModel> mNoticeTypeModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice_division);

        instantiateView();

        mNoticeTypeModels = new ArrayList<>();
        mNoticeTypeModels.add(new NoticeTypeModel(R.string.Department_Notice));
        mNoticeTypeModels.add(new NoticeTypeModel(R.string.hod_notice));
        mNoticeTypeModels.add(new NoticeTypeModel(R.string.Fest_notice));
        mNoticeTypeModels.add(new NoticeTypeModel(R.string.Exam_notice));
        mNoticeTypeModels.add(new NoticeTypeModel(R.string.Project_notice));
        mNoticeTypeModels.add(new NoticeTypeModel(R.string.Assignment_notice));


        mNoticeRecylcerView.setLayoutManager(new LinearLayoutManager(this));

        mNoticeRecylcerView.setHasFixedSize(true);


        mNoticeRecylcerView.setAdapter(new NoticeDivisionAdapter(this,mNoticeTypeModels));
    }


    private  void instantiateView(){
        mNoticeRecylcerView = (RecyclerView) findViewById(R.id.notice_division_recycler_view);
    }


}
