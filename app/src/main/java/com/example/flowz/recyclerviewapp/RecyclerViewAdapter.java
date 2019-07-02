package com.example.flowz.recyclerviewapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ClubViewHolder> {

    List<Club>myClubs;

    RecyclerViewAdapter(List<Club> clubs){
          myClubs = clubs;

    }

    @NonNull
    @Override
    public ClubViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom2, parent, false);
        ClubViewHolder myCVH = new ClubViewHolder(view);
        return myCVH;
    }

    @Override
    public void onBindViewHolder(@NonNull ClubViewHolder holder, int position) {
        holder.myWrittenText.setText(myClubs.get(position).name);
        holder.myPics.setImageResource(myClubs.get(position).pics);

    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public int getItemCount() {
        return myClubs.size();
    }

    public class ClubViewHolder extends RecyclerView.ViewHolder {
        CardView myCardView;
        TextView myWrittenText;
        ImageView myPics;

        public ClubViewHolder(View itemView) {
            super(itemView);
            myCardView = (CardView)itemView.findViewById(R.id.card_view);
            myWrittenText =(TextView)itemView.findViewById(R.id.textView);
            myPics =(ImageView)itemView.findViewById(R.id.imageView);
        }
    }
}
