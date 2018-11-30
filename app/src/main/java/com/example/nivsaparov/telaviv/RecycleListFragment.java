package com.example.nivsaparov.telaviv;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class RecycleListFragment extends Fragment implements OnEventClickListener {
    private static final String EVENTS_DATA = "events_data";
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<EventData> events = null;



    public RecycleListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_event_list, container, false);
        initRecycleView(view);

        return view;
    }

    private void initRecycleView(View view) {
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);

        // get the data from arguments
        events = (ArrayList<EventData>)getArguments().getSerializable(EVENTS_DATA);

        // set the adapter
        mAdapter = new CustomEventAdapter(getContext(),events);
        mRecyclerView.setAdapter(mAdapter);


    }



    public static RecycleListFragment newInstance(ArrayList<EventData> events) {

        Bundle args = new Bundle();

        args.putSerializable(EVENTS_DATA, events);
        RecycleListFragment fragment = new RecycleListFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onEventClickListener(int position) {
        EventData eventData = events.get(position);
        Toast.makeText(getContext(), eventData.getTitle(), Toast.LENGTH_SHORT).show();

    }
}
