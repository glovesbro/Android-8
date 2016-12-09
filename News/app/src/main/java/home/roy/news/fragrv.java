package home.roy.news;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;


/**
 * Created by 89294 on 2016/12/9.
 */

public class fragrv extends AppCompatActivity {
    private Button bt4;
    private Button bt5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragrv);

        bt4 = (Button) findViewById(R.id.button2);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent();
                it.setClass(fragrv.this, fragtext.class);
                startActivity(it);
                fragrv.this.finish();
            }
        });
        bt5 = (Button) findViewById(R.id.button4);
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                attemptLogin();
            }
        });
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv);
        //设置LayoutManager，它决定了怎么来布局
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //设置Adapter，Adapter的构造方法一般会传ArrayList进去
        recyclerView.setAdapter(new MyAdapter(10));
    }

    private void attemptLogin() {
        return;
    }


}

