package com.wjq.fragmenttest;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NewsContent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_content);
    }

    public static void actionStart(Context context, String title, String body) {
        Intent intent = new Intent(context,NewsContent.class);
        intent.putExtra("Title", title);
        intent.putExtra("Body", body);
        context.startActivity(intent);
    }
}
