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
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Sharing.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class Sharing extends ListFragment {

    private OnFragmentInteractionListener mListener;
    private static String[] ListItems ={
           "It is so boring today, I don't care anything",
            "What? Break up with me? Get out!",
            "My mother give me a great present",
            "I kill a ET today, how brave am i.",
            "I am tired, I need to sleep",
            "Would you marry me? Yes i do."

    };

    public Sharing() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_sharing, container, false);

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>
                (getActivity(),android.R.layout.simple_list_item_1,ListItems);

        setListAdapter(adapter1);
        return inflater.inflate(R.layout.fragment_sharing, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event


    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        if (mListener != null) {

            String Cname = "nihao";
            mListener.sendPositionToFragment2(Cname);

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
        public void sendPositionToFragment2(String userName);
    }

}
