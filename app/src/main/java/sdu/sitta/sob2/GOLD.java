package sdu.sitta.sob2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class GOLD extends AppCompatActivity {

    String Name;
    TextView HeadTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gold);
        HeadTextView = (TextView) findViewById(R.id.HeadSOB);

        Name = getIntent().getStringExtra("Name");
        HeadTextView.setText("ยินดีตอนรับ "+Name+" เข้าสู้ระบบ");





    }
}
