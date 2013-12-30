package com.ardev.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.support.v4.app.ListFragment;

public class ListeFragment  extends ListFragment
{
	   public static ListeFragment newInstance()
	    {
		   ListeFragment fragment = new ListeFragment();

	        return fragment;
	    }

	    public ListeFragment()
	    {

	    }

	    @Override
	    public void onListItemClick(ListView l, View v, int position, long id)
	    {

	    }

	    @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)
	    {

	        List<Map<String, String>> data = new ArrayList<Map<String, String>>();
	        
	        for (int i=0; i< 10; i++) 
	        {
	            Map<String, String> datum = new HashMap<String, String>(2);
	            datum.put("title", "Title" + i);
	            datum.put("subtitle", "Subtitle" + i);
	            data.add(datum);
	        }

	        SimpleAdapter adapter;

	        adapter = new SimpleAdapter(this.getActivity(), data,
	                android.R.layout.simple_list_item_2,
	                new String[]{"title", "subtitle"},
	                new int[]{android.R.id.text1,
	                        android.R.id.text2});

	        this.setListAdapter(adapter);



	        return super.onCreateView(inflater, container, savedInstanceState);
	    }
}

