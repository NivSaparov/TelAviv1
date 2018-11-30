package com.example.nivsaparov.telaviv;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomEventAdapter extends RecyclerView.Adapter<CustomEventAdapter.EventViewHolder> {

    LayoutInflater mInflater;
    final ArrayList<EventData> mEventsData;

    private OnEventClickListener mOnEventClickListener;


    public CustomEventAdapter(Context context, ArrayList<EventData> items ){
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mEventsData = items;

    }

    @Override
    public EventViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        // Inflater out View
        View view = mInflater.inflate(R.layout.event_row, parent, false);

        return new EventViewHolder(view);

    }

    @Override
    public void onBindViewHolder(EventViewHolder holder, int position) {
        holder.onBindViewHolder(mEventsData.get(position));

    }

    @Override
    public int getItemCount() {
        return mEventsData.size();
    }


    /**
     * View Holder class of Event
     */
    public class EventViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public final ImageView ivImage;
        public final TextView tvTitle;
        public final TextView tvDescription;

        public EventViewHolder(View itemView) {
            super(itemView);
            ivImage = (ImageView) itemView.findViewById(R.id.event_image_view);
            tvTitle = (TextView) itemView.findViewById(R.id.event_title_text_view);
            tvDescription = (TextView) itemView.findViewById(R.id.event_description_text_view);

        }

        public void onBindViewHolder(EventData event){
            // set values to views
            ivImage.setImageResource(event.getImageResourceId());
            tvTitle.setText(event.getTitle());
            tvDescription.setText(event.getDescription());
        }

        @Override
        public void onClick(View v) {
            Log.v("cscas","U clicked me ");

        }
    }
}
