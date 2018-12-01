package com.example.valpi.cofix;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

class DataAdapter_Coffeeshops extends RecyclerView.Adapter<DataAdapter_Coffeeshops.ViewHolder> {

    private LayoutInflater inflater;
    private List<Coffeeshop> coffeeshops;

    DataAdapter_Coffeeshops(Context context, List<Coffeeshop> coffeeshops) {
        this.coffeeshops = coffeeshops;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public DataAdapter_Coffeeshops.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.coffeeshop_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter_Coffeeshops.ViewHolder holder, int position) {
        Coffeeshop coffeeshop = coffeeshops.get(position);
        holder.cityView.setText(coffeeshop.getCity());
        holder.adressView.setText(coffeeshop.getAdress());
    }

    @Override
    public int getItemCount() {
        return coffeeshops.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        final TextView cityView, adressView;
        ViewHolder(View view){
            super(view);
            cityView = (TextView) view.findViewById(R.id.city);
            adressView = (TextView) view.findViewById(R.id.adress);
        }
    }
}
