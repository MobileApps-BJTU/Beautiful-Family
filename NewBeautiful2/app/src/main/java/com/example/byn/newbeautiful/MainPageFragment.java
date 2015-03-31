package com.example.byn.newbeautiful;

import android.app.Activity;
import android.app.ListFragment;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link MainPageFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class MainPageFragment extends ListFragment {

    private OnFragmentInteractionListener mListener;
    private static String[] list_item={ "yaya","fdf","fadsfs","adsfsad"};

    public MainPageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_main_page2, container, false);
     Spinner spinner = (Spinner)v.findViewById(R.id.specific);
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


    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        if(mListener!=null)
        {
            mListener.sendPositionToDetail(position);
        }

    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(int position) {
        if (mListener != null) {
            mListener.sendPositionToDetail(position);
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
        public void sendPositionToDetail(int position);
    }

}
