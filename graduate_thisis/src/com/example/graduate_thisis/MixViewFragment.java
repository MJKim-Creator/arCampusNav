package com.example.graduate_thisis;

import org.mixare.MainActivity;
import org.mixare.MixView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MixViewFragment extends Fragment {
	Context ctx = getActivity();
	Intent mapintent;
	MainActivity act = new MainActivity();
	public void act.onCreate(Bundle Saved){
		
	}

	public MixViewFragment() {
		// TODO Auto-generated constructor stub
	}
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		super.onCreateView(inflater, container, savedInstanceState);

		mapintent = new Intent(getActivity(), MixView.class);
		getActivity().startActivity(mapintent);
		
		return inflater.inflate(R.layout.fragment_ar, container, false);
	}

}
