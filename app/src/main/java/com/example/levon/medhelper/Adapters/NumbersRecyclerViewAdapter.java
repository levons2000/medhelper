package com.example.levon.medhelper.Adapters;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.levon.medhelper.Models.NumbersModel;
import com.example.levon.medhelper.R;

import java.util.List;

public class NumbersRecyclerViewAdapter extends RecyclerView.Adapter<NumbersRecyclerViewAdapter.NumberViewHolder> {

    private Context context;
    private List<NumbersModel> listOfNumbers;

    public NumbersRecyclerViewAdapter(Context context, List<NumbersModel> listOfNumbers) {
        this.context = context;
        this.listOfNumbers = listOfNumbers;
    }

    @Override
    public NumbersRecyclerViewAdapter.NumberViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.number_recycler_item_style, parent, false);
        return new NumberViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NumbersRecyclerViewAdapter.NumberViewHolder holder, int position) {
        holder.nameOfHospital.setText(listOfNumbers.get(position).getNameOfHospital());
        holder.hasceOfHospital.setText(listOfNumbers.get(position).getHasceOfHospital());
        holder.numberOfHospital.setText(listOfNumbers.get(position).getNumberOfHospital());
    }

    @Override
    public int getItemCount() {
        return listOfNumbers.size();
    }

    public class NumberViewHolder extends RecyclerView.ViewHolder {

        private TextView nameOfHospital;
        private TextView hasceOfHospital;
        private TextView numberOfHospital;
        private ImageButton callButton;

        public NumberViewHolder(View itemView) {
            super(itemView);
            nameOfHospital = itemView.findViewById(R.id.name_of_hospital);
            hasceOfHospital = itemView.findViewById(R.id.hasce_of_hospital);
            numberOfHospital = itemView.findViewById(R.id.number_of_hospital);
            callButton = itemView.findViewById(R.id.call_to_hospital);
            setActionToCallButton(itemView);
        }

        private void setActionToCallButton(final View itemView) {
            callButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse("tel:" + listOfNumbers.get(getAdapterPosition()).getNumberOfHospital()));
                    if (ActivityCompat.checkSelfPermission(itemView.getContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        return;
                    }
                    itemView.getContext().startActivity(callIntent);
                }
            });
        }
    }
}
