package com.example.as_c4_lab2_additionaltask;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StateAdapter extends RecyclerView.Adapter<StateAdapter.ViewHolder> {
    private List<State> mStates;
    // Provide a direct reference to each of the views within a data item
// Used to cache the views within the item layout for fast access
    public class ViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        public TextView nameCountry;
        public TextView population;
        public ImageView flagView;

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);
            nameCountry = (TextView) itemView.findViewById(R.id.textView_countryName);
            population = (TextView) itemView.findViewById(R.id.textView_population);
            flagView = (ImageView) itemView.findViewById(R.id.imageView_flag);
        }
    }

    @Override
    public StateAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View stateView = inflater.inflate(R.layout.recyclerview_item_layout, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(stateView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(StateAdapter.ViewHolder holder, int position)
    {
        // Get the data model based on position
        State state = mStates.get(position);
        // Set item views based on your views and data model
        TextView nameCountry = holder.nameCountry;
        nameCountry.setText(state.getName());

        TextView population = holder.population;
        population.setText(state.getPopulation());

        ImageView flagView = holder.flagView;
        flagView.setImageResource(state.getFlagResource());
        holder.itemView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(view.getContext(),"You clicked "+nameCountry.getText(),Toast.LENGTH_LONG).show();
            }
        });
    }
    public int getItemCount() {
        return mStates.size();
    }
    public StateAdapter(List<State> states) {
        mStates = states;
    }

}

