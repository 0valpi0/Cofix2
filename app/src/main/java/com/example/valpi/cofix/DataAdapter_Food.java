package com.example.valpi.cofix;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

class DataAdapter_Food extends RecyclerView.Adapter<DataAdapter_Food.ViewHolder> {
    private LayoutInflater inflater;
    private List<Food> food_list;

    DataAdapter_Food(Context context, List<Food> food) {
        this.food_list = food;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public DataAdapter_Food.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.food_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter_Food.ViewHolder holder, int position) {
        Food food = food_list.get(position);
        holder.nameView.setText(food.getName());
    }

    @Override
    public int getItemCount() {
        return food_list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        final TextView nameView;
        ViewHolder(View view){
            super(view);
            nameView = (TextView) view.findViewById(R.id.name);
        }
    }

}
