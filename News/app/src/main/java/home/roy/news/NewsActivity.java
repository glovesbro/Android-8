package home.roy.news;

import android.content.Intent;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class NewsActivity extends AppCompatActivity {
    private RelativeLayout ft;
    private FrameLayout fv;
    private RelativeLayout news;
    private Button bt1;
    LinearLayout mLinearLayout;
    ScrollView mScrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        mLinearLayout = (LinearLayout) findViewById(R.id.linear_layout);
        mScrollView = (ScrollView) findViewById(R.id.activity_scroll);
        addViews(R.layout.item, 10, mLinearLayout);


        ft=(RelativeLayout)findViewById(R.id.activity_fragtext);
        fv=(FrameLayout)findViewById(R.id.activity_fragrv);
        news=(RelativeLayout)findViewById(R.id.activity_news);

        bt1=(Button)findViewById(R.id.button3);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent();
                it.setClass(NewsActivity.this, fragtext.class);
                startActivity(it);
                NewsActivity.this.finish();
            }
        });
    }

    private void addViews(@LayoutRes int res, int count, ViewGroup parent) {
        for (int i = 0; i < count; i++) {
            View view = View.inflate(this, res, null);
            //ViewHolder的由来: 重复findViewById()，造成性能的损失，怎么办？
            TextView textView = (TextView) view.findViewById(R.id.tv);
            textView.setText(String.valueOf(i));
            parent.addView(view);
        }
    }
}
