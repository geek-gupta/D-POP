package company.product.dpop.de_pop.notice.notice_activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import company.product.dpop.de_pop.R;

public class DepartmentActivity extends AppCompatActivity {

    RecyclerView mDepartmentRecyclerView;
    ArrayList<NoticeDataModel> mNoticeDataModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department);

        mDepartmentRecyclerView = (RecyclerView) findViewById(R.id.department_recycler_view);

        mNoticeDataModel = new ArrayList<>();

        mNoticeDataModel.add(new NoticeDataModel("A","You all are informed" +
                " to gather in Seminar hall of IT Department and i Hope you all will be present there ","Gaurav Kumar"));
        mNoticeDataModel.add(new NoticeDataModel("B","You all are informed" +
                " to gather in Seminar hall of IT Department and i Hope you all will be present there IT Department and i Hope you all will be present there  ","Lokesh Adhikari"));

        mNoticeDataModel.add(new NoticeDataModel("A","You all are informed" +
                " to gather in Seminar hall of IT Department and i Hope you all will be present there ","Gaurav Kumar"));
        mNoticeDataModel.add(new NoticeDataModel("B","You all are informed" +
                " to gather in Seminar hall of IT Department and i Hope you all will be present there IT Department and i Hope you all will be present there  ","Lokesh Adhikari"));

        mNoticeDataModel.add(new NoticeDataModel("A","You all are informed" +
                " to gather in Seminar hall of IT Department and i Hope you all will be present there ","Gaurav Kumar"));
        mNoticeDataModel.add(new NoticeDataModel("B","You all are informed" +
                " to gather in Seminar hall of IT Department and i Hope you all will be present there IT Department and i Hope you all will be present there  ","Lokesh Adhikari"));

        mNoticeDataModel.add(new NoticeDataModel("B","You all are informed" +
                " to gather in Seminar hall of IT Department and i Hope you all will be present there IT Department and i Hope you all will be present there  ","Lokesh Adhikari"));

        mNoticeDataModel.add(new NoticeDataModel("A","You all are informed" +
                " to gather in Seminar hall of IT Department and i Hope you all will be present there ","Gaurav Kumar"));
        mNoticeDataModel.add(new NoticeDataModel("B","You all are informed" +
                " to gather in Seminar hall of IT Department and i Hope you all will be present there IT Department and i Hope you all will be present there  ","Lokesh Adhikari"));
        mDepartmentRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mDepartmentRecyclerView.setHasFixedSize(true);
        mDepartmentRecyclerView.setAdapter(new NoticeDataAdapter(this,mNoticeDataModel));

    }
}
