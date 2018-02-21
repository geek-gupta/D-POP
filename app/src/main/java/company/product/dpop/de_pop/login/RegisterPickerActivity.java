package company.product.dpop.de_pop.login;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import company.product.dpop.de_pop.R;
import company.product.dpop.de_pop.register.StudentRegisterActivity;
import company.product.dpop.de_pop.register.TeacherRegisterActivity;

public class RegisterPickerActivity extends AppCompatActivity {

    private Button mTeacherRegister,mStudentRegister;
    private Intent intent;
    private ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_picker);

        actionBar = getSupportActionBar();
        actionBar.hide();

        mStudentRegister = (Button) findViewById(R.id.studentregister);
        mTeacherRegister = (Button) findViewById(R.id.teacherregister);

        mStudentRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(RegisterPickerActivity.this, StudentRegisterActivity.class);
                startActivity(intent);
            }
        });

        mTeacherRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(RegisterPickerActivity.this, TeacherRegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}
