package com.example.practice_test;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.Toast;

public class MapCommunity extends Activity{

	private ImageView imageView1 = null;
	private ImageView imageView2 = null;
	private ImageView imageView3 = null;
	private ImageView imageView4 = null;
	private ImageView imageView5 = null;
	private ImageView imageView6 = null;
	
	protected void onCreate(Bundle savedInstanceState) {
		 super.onCreate(savedInstanceState);
		 
		 setContentView(R.layout.test);
		 
		 imageView1 = (ImageView) findViewById(R.id.imageView1);
			imageView2 = (ImageView) findViewById(R.id.imageView2);
			imageView3 = (ImageView) findViewById(R.id.imageView3);
			imageView4 = (ImageView) findViewById(R.id.imageView4);
			imageView5 = (ImageView) findViewById(R.id.imageView5);
			imageView6 = (ImageView) findViewById(R.id.imageView6);

			//ButtonOnTouchListener listener = new ButtonOnTouchListener();
			ImageViewOnDoubleClickListener1 listener1 = new ImageViewOnDoubleClickListener1();
			ImageViewOnDoubleClickListener2 listener2 = new ImageViewOnDoubleClickListener2();
			ImageViewOnDoubleClickListener3 listener3 = new ImageViewOnDoubleClickListener3();
			ImageViewOnDoubleClickListener4 listener4 = new ImageViewOnDoubleClickListener4();
			ImageViewOnDoubleClickListener5 listener5 = new ImageViewOnDoubleClickListener5();
			ImageViewOnDoubleClickListener6 listener6 = new ImageViewOnDoubleClickListener6();
			
			imageView1.setOnClickListener(listener1);
			imageView2.setOnClickListener(listener2);
			imageView3.setOnClickListener(listener3);
			imageView4.setOnClickListener(listener4);
			imageView5.setOnClickListener(listener5);
			imageView6.setOnClickListener(listener6);
			
			imageView1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO �Զ����ɵķ������
					Toast.makeText(getApplicationContext(), "Ĭ��Toast��ʽ",Toast.LENGTH_SHORT).show();
				}
			});
			
			imageView1.setOnTouchListener(new OnTouchListener() {
				@Override
				public boolean onTouch(View v, MotionEvent event) {
					// TODO �Զ����ɵķ������
					if(event.getAction() == MotionEvent.ACTION_DOWN){       
		               //�������ð���ʱ�ı���ͼƬ  
						((ImageView)v).setImageDrawable(getResources().getDrawable(R.drawable.fours));                            
		            }else if(event.getAction() == MotionEvent.ACTION_UP){       
		                //���޸�Ϊ̧��ʱ������ͼƬ  
		            	((ImageView)v).setImageDrawable(getResources().getDrawable(R.drawable.ones));  
		            } 
					return true;
				}
			});

			imageView2.setOnTouchListener(new OnTouchListener() {
				@Override
				public boolean onTouch(View v, MotionEvent event) {
					// TODO �Զ����ɵķ������
					if(event.getAction() == MotionEvent.ACTION_DOWN){       
		               //�������ð���ʱ�ı���ͼƬ  
						((ImageView)v).setImageDrawable(getResources().getDrawable(R.drawable.fours));                            
		            }else if(event.getAction() == MotionEvent.ACTION_UP){       
		                //���޸�Ϊ̧��ʱ������ͼƬ  
		            	((ImageView)v).setImageDrawable(getResources().getDrawable(R.drawable.tens));  
		            } 
					return false;
				}
			});
			
			imageView3.setOnTouchListener(new OnTouchListener() {
				@Override
				public boolean onTouch(View v, MotionEvent event) {
					// TODO �Զ����ɵķ������
					if(event.getAction() == MotionEvent.ACTION_DOWN){       
		               //�������ð���ʱ�ı���ͼƬ  
						((ImageView)v).setImageDrawable(getResources().getDrawable(R.drawable.fours));                            
		            }else if(event.getAction() == MotionEvent.ACTION_UP){       
		                //���޸�Ϊ̧��ʱ������ͼƬ  
		            	((ImageView)v).setImageDrawable(getResources().getDrawable(R.drawable.sixs));  
		            } 
					return false;
				}
			});

			imageView4.setOnTouchListener(new OnTouchListener() {
				@Override
				public boolean onTouch(View v, MotionEvent event) {
					// TODO �Զ����ɵķ������
					if(event.getAction() == MotionEvent.ACTION_DOWN){       
		               //�������ð���ʱ�ı���ͼƬ  
						((ImageView)v).setImageDrawable(getResources().getDrawable(R.drawable.fours));                            
		            }else if(event.getAction() == MotionEvent.ACTION_UP){       
		                //���޸�Ϊ̧��ʱ������ͼƬ  
		            	((ImageView)v).setImageDrawable(getResources().getDrawable(R.drawable.sevens));  
		            } 
					return false;
				}
			});
			
			imageView5.setOnTouchListener(new OnTouchListener() {
				@Override
				public boolean onTouch(View v, MotionEvent event) {
					// TODO �Զ����ɵķ������
					if(event.getAction() == MotionEvent.ACTION_DOWN){       
		               //�������ð���ʱ�ı���ͼƬ  
						((ImageView)v).setImageDrawable(getResources().getDrawable(R.drawable.fours));                            
		            }else if(event.getAction() == MotionEvent.ACTION_UP){       
		                //���޸�Ϊ̧��ʱ������ͼƬ  
		            	((ImageView)v).setImageDrawable(getResources().getDrawable(R.drawable.twos));  
		            } 
					return false;
				}
			});
			
			imageView6.setOnTouchListener(new OnTouchListener() {
				@Override
				public boolean onTouch(View v, MotionEvent event) {
					// TODO �Զ����ɵķ������
					if(event.getAction() == MotionEvent.ACTION_DOWN){       
		               //�������ð���ʱ�ı���ͼƬ  
						((ImageView)v).setImageDrawable(getResources().getDrawable(R.drawable.fours));                            
		            }else if(event.getAction() == MotionEvent.ACTION_UP){       
		                //���޸�Ϊ̧��ʱ������ͼƬ  
		            	((ImageView)v).setImageDrawable(getResources().getDrawable(R.drawable.eights));  
		            } 
					return false;
				}
			});
	}
	
	/**
	 * �˵������ؼ���Ӧ
	 */
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			exitBy2Click(); // ����˫���˳�����
		}
		return false;
	}

	/**
	 * ˫���˳�����
	 */
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
	}
	
	private class ImageViewOnDoubleClickListener1 implements OnClickListener{

		// �������Ĵ���
		private int count1 = 0;
		// ��һ�ε����ʱ�� long��
		private long firstClick1 = 0;
		// ���һ�ε����ʱ��
		private long lastClick1 = 0;
		
		@Override
		public void onClick(View v) {
			// TODO �Զ����ɵķ������
			if (firstClick1 != 0 && System.currentTimeMillis() - firstClick1 > 500)
			{
				count1 = 0;
			}
			count1++;
			if (count1 == 1)
			{
				firstClick1 = System.currentTimeMillis();
			} 
			else if (count1 == 2)
			{
				lastClick1 = System.currentTimeMillis();
				// ���ε��С��500ms Ҳ�����������
				if (lastClick1 - firstClick1 < 500)
				{
					//((ImageView)v).setImageDrawable(getResources().getDrawable(R.drawable.sixs));
					Intent intent = new Intent();
					intent.setClass(MapCommunity.this, Test.class);
					startActivity(intent);
					Toast.makeText(getApplicationContext(), "Ĭ��Toast��ʽ",Toast.LENGTH_SHORT).show();
				}
				clear();
				
			}
		}
		private void clear()
		{
			count1 = 0;
			firstClick1 = 0;
			lastClick1 = 0;
		}
		
	}
	
	private class ImageViewOnDoubleClickListener2 implements OnClickListener{

		// �������Ĵ���
		private int count1 = 0;
		// ��һ�ε����ʱ�� long��
		private long firstClick1 = 0;
		// ���һ�ε����ʱ��
		private long lastClick1 = 0;
		
		@Override
		public void onClick(View v) {
			// TODO �Զ����ɵķ������
			if (firstClick1 != 0 && System.currentTimeMillis() - firstClick1 > 500)
			{
				count1 = 0;
			}
			count1++;
			if (count1 == 1)
			{
				firstClick1 = System.currentTimeMillis();
			} 
			else if (count1 == 2)
			{
				lastClick1 = System.currentTimeMillis();
				// ���ε��С��500ms Ҳ�����������
				if (lastClick1 - firstClick1 < 500)
				{
					//((ImageView)v).setImageDrawable(getResources().getDrawable(R.drawable.sixs));
					Intent intent = new Intent();
					intent.setClass(MapCommunity.this, Test.class);
					startActivity(intent);
					Toast.makeText(getApplicationContext(), "Ĭ��Toast��ʽ",Toast.LENGTH_SHORT).show();
				}
				clear();
				
			}
		}
		private void clear()
		{
			count1 = 0;
			firstClick1 = 0;
			lastClick1 = 0;
		}
		
	}
	
	private class ImageViewOnDoubleClickListener3 implements OnClickListener{

		// �������Ĵ���
		private int count1 = 0;
		// ��һ�ε����ʱ�� long��
		private long firstClick1 = 0;
		// ���һ�ε����ʱ��
		private long lastClick1 = 0;
		
		@Override
		public void onClick(View v) {
			// TODO �Զ����ɵķ������
			if (firstClick1 != 0 && System.currentTimeMillis() - firstClick1 > 500)
			{
				count1 = 0;
			}
			count1++;
			if (count1 == 1)
			{
				firstClick1 = System.currentTimeMillis();
			} 
			else if (count1 == 2)
			{
				lastClick1 = System.currentTimeMillis();
				// ���ε��С��500ms Ҳ�����������
				if (lastClick1 - firstClick1 < 500)
				{
					//((ImageView)v).setImageDrawable(getResources().getDrawable(R.drawable.sixs)); 
					Intent intent = new Intent();
					intent.setClass(MapCommunity.this, Test.class);
					startActivity(intent);
					Toast.makeText(getApplicationContext(), "Ĭ��Toast��ʽ",Toast.LENGTH_SHORT).show();
				}
				clear();
				
			}
		}
		private void clear()
		{
			count1 = 0;
			firstClick1 = 0;
			lastClick1 = 0;
		}
		
	}
	
	private class ImageViewOnDoubleClickListener4 implements OnClickListener{

		// �������Ĵ���
		private int count1 = 0;
		// ��һ�ε����ʱ�� long��
		private long firstClick1 = 0;
		// ���һ�ε����ʱ��
		private long lastClick1 = 0;
		
		@Override
		public void onClick(View v) {
			// TODO �Զ����ɵķ������
			if (firstClick1 != 0 && System.currentTimeMillis() - firstClick1 > 500)
			{
				count1 = 0;
			}
			count1++;
			if (count1 == 1)
			{
				firstClick1 = System.currentTimeMillis();
			} 
			else if (count1 == 2)
			{
				lastClick1 = System.currentTimeMillis();
				// ���ε��С��500ms Ҳ�����������
				if (lastClick1 - firstClick1 < 500)
				{
					//((ImageView)v).setImageDrawable(getResources().getDrawable(R.drawable.sixs));
					Intent intent = new Intent();
					intent.setClass(MapCommunity.this, Test.class);
					startActivity(intent);
					Toast.makeText(getApplicationContext(), "Ĭ��Toast��ʽ",Toast.LENGTH_SHORT).show();
				}
				clear();
				
			}
		}
		private void clear()
		{
			count1 = 0;
			firstClick1 = 0;
			lastClick1 = 0;
		}
		
	}
	
	private class ImageViewOnDoubleClickListener5 implements OnClickListener{

		// �������Ĵ���
		private int count1 = 0;
		// ��һ�ε����ʱ�� long��
		private long firstClick1 = 0;
		// ���һ�ε����ʱ��
		private long lastClick1 = 0;
		
		@Override
		public void onClick(View v) {
			// TODO �Զ����ɵķ������
			if (firstClick1 != 0 && System.currentTimeMillis() - firstClick1 > 500)
			{
				count1 = 0;
			}
			count1++;
			if (count1 == 1)
			{
				firstClick1 = System.currentTimeMillis();
			} 
			else if (count1 == 2)
			{
				lastClick1 = System.currentTimeMillis();
				// ���ε��С��500ms Ҳ�����������
				if (lastClick1 - firstClick1 < 500)
				{
					//((ImageView)v).setImageDrawable(getResources().getDrawable(R.drawable.sixs));
					Intent intent = new Intent();
					intent.setClass(MapCommunity.this, Test.class);
					startActivity(intent);
					Toast.makeText(getApplicationContext(), "Ĭ��Toast��ʽ",Toast.LENGTH_SHORT).show();
				}
				clear();
				
			}
		}
		private void clear()
		{
			count1 = 0;
			firstClick1 = 0;
			lastClick1 = 0;
		}
		
	}
	
	private class ImageViewOnDoubleClickListener6 implements OnClickListener{

		// �������Ĵ���
		private int count1 = 0;
		// ��һ�ε����ʱ�� long��
		private long firstClick1 = 0;
		// ���һ�ε����ʱ��
		private long lastClick1 = 0;
		
		@Override
		public void onClick(View v) {
			// TODO �Զ����ɵķ������
			if (firstClick1 != 0 && System.currentTimeMillis() - firstClick1 > 500)
			{
				count1 = 0;
			}
			count1++;
			if (count1 == 1)
			{
				firstClick1 = System.currentTimeMillis();
			} 
			else if (count1 == 2)
			{
				lastClick1 = System.currentTimeMillis();
				// ���ε��С��500ms Ҳ�����������
				if (lastClick1 - firstClick1 < 500)
				{
					//((ImageView)v).setImageDrawable(getResources().getDrawable(R.drawable.sixs));
					Intent intent = new Intent();
					intent.setClass(MapCommunity.this, Test.class);
					startActivity(intent);
					Toast.makeText(getApplicationContext(), "Ĭ��Toast��ʽ",Toast.LENGTH_SHORT).show();
				}
				clear();
			}
		}
		private void clear()
		{
			count1 = 0;
			firstClick1 = 0;
			lastClick1 = 0;
		}
		
	}

}
