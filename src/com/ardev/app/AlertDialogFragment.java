package com.ardev.app;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public class AlertDialogFragment extends DialogFragment 
{
	    @Override
	    public Dialog onCreateDialog(Bundle savedInstanceState) 
	    {

	        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
	        
	        builder.setMessage("message")
	               .setPositiveButton("fire", new DialogInterface.OnClickListener() 
	               {
	                   public void onClick(DialogInterface dialog, int id) 
	                   {

	                   }
	               })
	               .setNegativeButton("cancel", new DialogInterface.OnClickListener() 
	               {
	                   public void onClick(DialogInterface dialog, int id) 
	                   {

	                   }
	               });

	        return builder.create();
	    }
}
