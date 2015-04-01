package com.example.zero.family;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link MapCommunity.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class MapCommunity extends Fragment {

    private OnFragmentInteractionListener mListener;
    private ImageView imageView1 = null;

    public MapCommunity() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_map_community, container, false);

        imageView1 = (ImageView) v.findViewById(R.id.imageView1);

        ImageViewOnDoubleClickListener1 listener1 = new ImageViewOnDoubleClickListener1();

        imageView1.setOnClickListener(listener1);

        imageView1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO �Զ����ɵķ������
                if (mListener != null) {

                    String Cname = "nihao";
                    mListener.ToNews(Cname);
                }
                Toast.makeText(getActivity().getApplicationContext(), "Ĭ��Toast��ʽ", Toast.LENGTH_SHORT).show();
            }
        });

        imageView1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                // TODO �Զ����ɵķ������
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    //�������ð���ʱ�ı���ͼƬ
                    if (mListener != null) {

                        String Cname = "nihao";
                        mListener.ToNews(Cname);
                    }
                    ((ImageView)v).setImageDrawable(getResources().getDrawable(R.drawable.fours));
                }else if(event.getAction() == MotionEvent.ACTION_UP){
                    //���޸�Ϊ̧��ʱ������ͼƬ
                    if (mListener != null) {

                        String Cname = "nihao";
                        mListener.ToNews(Cname);
                    }
                    ((ImageView)v).setImageDrawable(getResources().getDrawable(R.drawable.ones));
                }
                return true;
            }
        });
        return v;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(String news) {
        if (mListener != null) {
            mListener.ToNews(news);
        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnFragmentInteractionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void ToNews(String news);
    }




    private class ImageViewOnDoubleClickListener1 implements View.OnClickListener {

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
                    if (mListener != null) {

                        String Cname = "nihao";
                        mListener.ToNews(Cname);
                    }
                   /* Intent intent = new Intent();
                    intent.setClass(MapCommunity.this, MapCommunity.class);
                    startActivity(intent);*/
                    Toast.makeText(getActivity().getApplicationContext(), "Ĭ��Toast��ʽ",Toast.LENGTH_SHORT).show();
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
