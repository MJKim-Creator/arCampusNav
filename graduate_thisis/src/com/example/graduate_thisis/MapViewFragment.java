package com.example.graduate_thisis;

import org.mixare.MixMap;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MapViewFragment extends Fragment {
	Intent mapintent;

	public MapViewFragment() {
		// TODO Auto-generated constructor stub
	}
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		super.onCreateView(inflater, container, savedInstanceState);

		mapintent = new Intent(getActivity(), MixMap.class);
		getActivity().startActivity(mapintent);
		
		return inflater.inflate(R.layout.fragment_ar, container, false);
	}
	
}
