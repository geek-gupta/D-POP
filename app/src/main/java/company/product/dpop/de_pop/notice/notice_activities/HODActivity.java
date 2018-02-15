package company.product.dpop.de_pop.notice.notice_activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import company.product.dpop.de_pop.R;

public class HODActivity extends AppCompatActivity {

    RecyclerView mHODRecyclerView;
    ArrayList<NoticeDataModel> mNoticeDataModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hod);

        mHODRecyclerView = (RecyclerView) findViewById(R.id.hod_recycler_view);

        mNoticeDataModel = new ArrayList<>();

        mNoticeDataModel.add(new NoticeDataModel("A","You all are informed" +
                " to gather in Seminar hall of IT Department and i Hope you all will be present there ","Gaurav Kumar"));
        mNoticeDataModel.add(new NoticeDataModel("B","You all are informed" +
                " to gather in Seminar hall of IT Department and i Hope you all will be present there IT Department and i Hope you all will be present there  ","Lokesh Adhikari"));

        mNoticeDataModel.add(new NoticeDataModel("A","You all are informed" +
                " to gather in Seminar hall of IT Department and i Hope you alhall of IT Department and i Hope you alhall of IT Department and i Hope you all will be present there ","Gaurav Kumar"));
        mNoticeDataModel.add(new NoticeDataModel("B","You all are informed" +
                " to gather in Seminar hall of IT Department and i Hope you all will be present there IT Department and i Hope you all will be present there  ","Lokesh Adhikari"));

        mNoticeDataModel.add(new NoticeDataModel("B","You all are informed" +
                " to gather in Seminar hall of IT Department and i Hope you all will be present there ","Gaurav Kumar"));
        mNoticeDataModel.add(new NoticeDataModel("B","You all are informed" +
                " to gather in Seminar hall of IThall of IT Department and i Hope you alhall of IT Department and i Hope you al Department and i Hope you all will be present there IT Department and i Hope you all will be present there  ","Lokesh Adhikari"));

        mHODRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mHODRecyclerView.setHasFixedSize(true);
        mHODRecyclerView.setAdapter(new NoticeDataAdapter(this,mNoticeDataModel));
    }
}
