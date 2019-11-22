package com.example.graduate_thisis;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class WebViewFragment extends Fragment {
	private WebView khuweb;
	private View rootView;
	
	public WebViewFragment(){
		
	}
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
		rootView = inflater.inflate(R.layout.fragment_about, container, false);
		khuweb = (WebView)rootView.findViewById(R.id.khuWebView);
		WebSettings set = khuweb.getSettings();
		set.setJavaScriptEnabled(true);
		set.setBuiltInZoomControls(true);
		khuweb.loadUrl("http://khu.ac.kr/university/khumind/ui.do");
		
		return rootView;
	}
	
	

}
