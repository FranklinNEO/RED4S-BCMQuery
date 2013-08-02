package com.gmail.orinchen.red4s.app;


import com.gmail.orinchen.red4s.R;

import android.app.Activity;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.widget.TextView;

public class AboutActivity extends Activity {
	private String name;
	private String verson;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);
		Bundle bundle = this.getIntent().getExtras();
		name = bundle.getString("user_name");
		TextView tvName = (TextView) findViewById(R.id.loginfo);
		tvName.setText("登录帐号：" + name);
		String pkName = this.getPackageName();
		try {
			verson = this.getPackageManager().getPackageInfo(pkName, 0).versionName;
		} catch (NameNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		TextView tvVerson = (TextView) findViewById(R.id.verson);
		tvVerson.setText("当前版本：" + verson);
	}

}
