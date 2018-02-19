package company.product.dpop.de_pop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import company.product.dpop.de_pop.notice.NoticeDivision;
import company.product.dpop.de_pop.projects.ProjectMainActivity;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void noticeShow(View view) {
         intent = new Intent(this, NoticeDivision.class);
        startActivity(intent);
    }

    public void projectShow(View view) {
        intent = new Intent(this, ProjectMainActivity.class);
        startActivity(intent);
    }
}
