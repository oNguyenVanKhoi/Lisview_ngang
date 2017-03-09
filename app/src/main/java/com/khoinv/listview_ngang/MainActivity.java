package com.khoinv.listview_ngang;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {

    String[] array_data =new String[]{"asdfasdf","kfjdkf","irutirtu","asdfasdf","kfjdkf","irutirtu","asdfasdf","kfjdkf","irutirtu"};
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FrameLayout container = (FrameLayout) findViewById(R.id.activity_main);
        HorizalListView listView = new HorizalListView(this); 
        container.addView(listView.getView(),new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));  
        
        listView.ShowData(array_data);
    }
}
