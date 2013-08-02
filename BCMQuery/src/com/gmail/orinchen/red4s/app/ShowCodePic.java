package com.gmail.orinchen.red4s.app;

import com.gmail.orinchen.red4s.R;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;


public class ShowCodePic extends Activity {
	private String pic_path = null;
	private ImageView pic_im = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.show_pic);
		Bundle bundle = this.getIntent().getExtras();
		if (bundle != null) {
			pic_path = bundle.getString("code_pic");
		}
		pic_im = (ImageView) findViewById(R.id.show_code);
		if (pic_path != null) {
			pic_im.setImageBitmap(BitmapFactory.decodeFile(pic_path));
		} else {
			pic_im.setImageResource(R.drawable.input_by_hand);
		}
	}

}
