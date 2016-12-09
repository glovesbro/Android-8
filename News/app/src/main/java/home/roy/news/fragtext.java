package home.roy.news;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by 89294 on 2016/12/9.
 */

public class fragtext extends AppCompatActivity {
    private Button bt2;
    private Button bt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragtext);

        bt2=(Button)findViewById(R.id.button7);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent();
                it.setClass(fragtext.this, NewsActivity.class);
                startActivity(it);
                fragtext.this.finish();
            }
        });
        bt3=(Button)findViewById(R.id.button5);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent();
                it.setClass(fragtext.this, fragrv.class);
                startActivity(it);
                fragtext.this.finish();
            }
        });
    }
}
