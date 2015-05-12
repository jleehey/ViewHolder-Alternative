package com.johnleehey.android.viewholder_alternative;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {

    private ListView mListView;
    private UserAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.main_listview);

        mAdapter = new UserAdapter();
        mAdapter.users = MockData.DATA;

        mListView.setAdapter(mAdapter);
    }

}
