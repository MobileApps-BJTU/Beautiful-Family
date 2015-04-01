package com.example.zero.family;

import android.app.Activity;
import android.app.ListFragment;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Spinner;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link MainPage.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class MainPage extends ListFragment {

    private OnFragmentInteractionListener mListener;
    private static String[] list_item={ "Spring matters needing attention",
            "Acute gastroenteritis symptoms",
            "Prevention of influenza",
            "Drink how much water a day right?",
            "Is that OK drink milk on an empty stomach",
            "Don't play your mobile phone"};

    public MainPage() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_main_page, container, false);
        Spinner spinner = (Spinner)v.findViewById(R.id.specific);


        ImageButton share =(ImageButton)v.findViewById(R.id.Share);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mListener != null) {
                    mListener.JumptoSharing("haha");
                }
            }
        });
        //     listView = (ListView)findViewById(R.id.list);
        final String item_specific[] = new String[]{
                "Medical",
                "Tomibaby",
                "Health",
                "Cook",
                "Fitment",
                "Sales",
                "Second-hand" };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_spinner_item,item_specific);
        spinner.setAdapter(adapter);

        ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,list_item);
        setListAdapter(listAdapter);


        return v;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(String info) {
        if (mListener != null) {
            mListener.sendPositionToDetail(info);
        }
    }


    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        if(mListener!=null)
        {
            String Cname = "nihao";
            mListener.sendPositionToDetail(Cname);
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
        public void sendPositionToDetail(String name);
       public void JumptoSharing(String info);
    }


}
