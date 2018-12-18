package com.example.cooper0728.androidfirebasedbrealtimenew;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class MyRecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    TextView txt_title, txt_comment;


    IItemClickListener iItemClickListener;

    public void setiItemClickListener(IItemClickListener iItemClickListener) {
        this.iItemClickListener = iItemClickListener;
    }

    public MyRecyclerViewHolder(@NonNull View itemView){
        super(itemView);

        txt_comment = (TextView) itemView.findViewById(R.id.txt_content);
        txt_title = (TextView)itemView.findViewById(R.id.txt_title);

        itemView.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        iItemClickListener.onClick(view, getAdapterPosition());

    }
}
