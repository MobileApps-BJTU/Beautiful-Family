package com.example.practice_test;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class Test extends Activity{
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
	}
	
	/**
	 * �˵������ؼ���Ӧ
	 *//*
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		if(keyCode == KeyEvent.KEYCODE_BACK)
        {  
            exitBy2Click();		//����˫���˳�����
        }
		return false;
	}
	*//**
	 * ˫���˳�����
	 *//*
	private static Boolean isExit = false;

	private void exitBy2Click() {
		Timer tExit = null;
		if (isExit == false) {
			isExit = true; // ׼���˳�
			Toast.makeText(this, "�ٰ�һ���˳�����", Toast.LENGTH_SHORT).show();
			tExit = new Timer();
			tExit.schedule(new TimerTask() {
				@Override
				public void run() {
					isExit = false; // ȡ���˳�
				}
			}, 2000); // ���2������û�а��·��ؼ�����������ʱ��ȡ�����ղ�ִ�е�����

		} else {
			finish();
			System.exit(0);
		}
	}*/

}
