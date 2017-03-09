package com.khoinv.listview_ngang;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by khoinv4 on 3/9/17.
 */

public class HorizalListView {
    
    Context m_context;
    LinearLayout m_container_layout ;
    HorizontalScrollView m_scrollview;
    LayoutInflater layoutInflater;
    public HorizalListView(Context ct){
        m_context = ct;
        layoutInflater = (LayoutInflater) m_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        m_scrollview = (HorizontalScrollView) layoutInflater.inflate(R.layout.listview_layout,null);
        m_container_layout= (LinearLayout) m_scrollview.findViewById(R.id.ll_container);
    }
    
    public View getView(){
        return m_scrollview;
    }
    
    public void ShowData(String[] strings){
        for (String s: strings) {
            View item = layoutInflater.inflate(R.layout.item_layout,null);
            ((TextView)item.findViewById(R.id.tv_text)).setText(s);
            
            m_container_layout.addView(item,new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));
        }
    }
}
