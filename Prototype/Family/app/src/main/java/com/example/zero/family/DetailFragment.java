package com.example.zero.family;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DetailFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DetailFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";


    // TODO: Rename and change types of parameters
    private int position;



    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *


     * @return A new instance of fragment DetailFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DetailFragment newInstance(int position) {
        DetailFragment fragment = new DetailFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PARAM1, position);
        fragment.setArguments(args);
        return fragment;
    }

    public DetailFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            position = getArguments().getInt(ARG_PARAM1);

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String detail=null;
        View v =inflater.inflate(R.layout.fragment_detail, container, false);
        TextView textView = (TextView)v.findViewById(R.id.detailText);
        detail="1.Get up at 6:30 after a night of sleep, first drink 250 ml water\n" +
                "2.At 8:30 in the morning get up to the office of the process, so give yourself a cup of at least 250 ml of water. \n" +
                "3.11 after a period of time in the office work, give yourself a day of 3 cups of water\n" +
                "4.Finished lunch after half an hour, drink some water\n" +
                "5.15:00 refreshing drink a cup of healthy mineral water. \n" +
                "6.22:00 1 and half an hour before sleeping to drink a glass of water";
        textView.setText(detail);
        return v;

    }


}
