package com.example.nivsaparov.telaviv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String FRAGMENT_EVENT_LIST_TAG = "event_list_fragment";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        getSupportFragmentManager();
        RecycleListFragment recycleListFragment;
        // add fragment to activity
        if(savedInstanceState == null){
            recycleListFragment = RecycleListFragment.newInstance(initData());

            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.main_fragment_holder, recycleListFragment,FRAGMENT_EVENT_LIST_TAG)
                    .commit();

        }
    }

    public ArrayList<EventData> initData(){
        ArrayList<EventData> events = new ArrayList<>(10);
        events.add(new EventData(R.mipmap.ic_launcher,"Best Event","CACA ,SVVA cs,csa vs,vs dvmdkncsjvc= macnsjv ,c afjnd"));
        events.add(new EventData(R.mipmap.ic_launcher,"Best Event","CACA ,SVVA cs,csa vs,vs dvmdkncsjvc= macnsjv ,c afjnd"));
        events.add(new EventData(R.mipmap.ic_launcher,"Best Event","CACA ,SVVA cs,csa vs,vs dvmdkncsjvc= macnsjv ,c afjnd"));
        events.add(new EventData(R.mipmap.ic_launcher,"Best Event","CACA ,SVVA cs,csa vs,vs dvmdkncsjvc= macnsjv ,c afjnd"));
        events.add(new EventData(R.mipmap.ic_launcher,"Best Event","CACA ,SVVA cs,csa vs,vs dvmdkncsjvc= macnsjv ,c afjnd"));
        events.add(new EventData(R.mipmap.ic_launcher,"Best Event","CACA ,SVVA cs,csa vs,vs dvmdkncsjvc= macnsjv ,c afjnd"));
        events.add(new EventData(R.mipmap.ic_launcher,"Best Event","CACA ,SVVA cs,csa vs,vs dvmdkncsjvc= macnsjv ,c afjnd"));
        events.add(new EventData(R.mipmap.ic_launcher,"Best Event","CACA ,SVVA cs,csa vs,vs dvmdkncsjvc= macnsjv ,c afjnd"));
        events.add(new EventData(R.mipmap.ic_launcher,"Best Event","CACA ,SVVA cs,csa vs,vs dvmdkncsjvc= macnsjv ,c afjnd"));
        events.add(new EventData(R.mipmap.ic_launcher,"Best Event","CACA ,SVVA cs,csa vs,vs dvmdkncsjvc= macnsjv ,c afjnd"));

        return events;
    }
}
