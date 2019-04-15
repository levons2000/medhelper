package com.example.levon.medhelper.Adapters;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.levon.medhelper.Activities.NumbersActivity;
import com.example.levon.medhelper.Models.ModelOfMarz;
import com.example.levon.medhelper.R;

import java.util.List;

public class MarzRecyclerViewAdapter extends RecyclerView.Adapter<MarzRecyclerViewAdapter.MarzViewHolder> {

    private Context context;
    private static List<ModelOfMarz> listOfMarz;

    public MarzRecyclerViewAdapter(Context context, List<ModelOfMarz> listOfMarz) {
        this.context = context;
        MarzRecyclerViewAdapter.listOfMarz = listOfMarz;
    }

    @Override
    public MarzRecyclerViewAdapter.MarzViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(context).inflate(R.layout.marzer_recycler_item_style, parent, false);
        return new MarzViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MarzRecyclerViewAdapter.MarzViewHolder holder, int position) {
        holder.idOfMarz.setText(String.valueOf(position + 1));
        holder.nameOfMarz.setText(listOfMarz.get(position).getMarzName());
    }

    @Override
    public int getItemCount() {
        return listOfMarz.size();
    }

    static class MarzViewHolder extends  RecyclerView.ViewHolder {

        private TextView idOfMarz;
        private TextView nameOfMarz;

        public MarzViewHolder(final View itemView) {
            super(itemView);
            idOfMarz = itemView.findViewById(R.id.id_of_marz);
            nameOfMarz = itemView.findViewById(R.id.name_of_marz);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(itemView.getContext(), NumbersActivity.class);
                    intent.putExtra("name_of_marz", MarzRecyclerViewAdapter.listOfMarz.
                            get(getAdapterPosition()).getMarzName());
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
