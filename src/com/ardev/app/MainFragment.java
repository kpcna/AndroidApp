package com.ardev.app;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class MainFragment extends Fragment implements OnClickListener
{
	private View rootView;
	
	public MainFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) 
	{
		rootView = inflater.inflate(R.layout.main_fragment,container, false);
		
	    Button b = (Button) rootView.findViewById(R.id.button1);
	    b.setOnClickListener(this);
		
		return rootView;
	}

    @Override
    public void onClick(View v) 
    {
        switch (v.getId()) 
        {
        	case R.id.button1:
        		Button b = (Button) rootView.findViewById(R.id.button1);
        		b.setText("lol it works");
        		openDialog();

            break;
        }
    }
    
    private void openDialog()
    {
    	// 1. Instantiate an AlertDialog.Builder with its constructor
    	AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

    	// 2. Chain together various setter methods to set the dialog characteristics
    	builder.setMessage("Message")
    	       .setTitle("Dialog Title");

    	// 3. Get the AlertDialog from create()
    	AlertDialog dialog = builder.create();
    }
}
