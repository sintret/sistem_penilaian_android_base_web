package com.alcytrite.penilaianweb;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {

	public WebView webview;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		webview = (WebView) findViewById(R.id.webView);
	    webview.setWebViewClient(new WebViewClient());          
	    webview .getSettings().setJavaScriptEnabled(true);
	    webview .getSettings().setDomStorageEnabled(true);  
		webview.loadUrl("http://mbahaleh.com/penilaian/");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}