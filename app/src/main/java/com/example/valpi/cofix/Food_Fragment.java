package com.example.valpi.cofix;

import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public class Food_Fragment extends Fragment {

    List<Food> food_list = new ArrayList<>();

    public Food_Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        setInitialData();
        RecyclerView recyclerView = null;
        recyclerView = (RecyclerView) recyclerView.findViewById(R.id.food_list);

        // создаем адаптер
        DataAdapter_Food adapter = new DataAdapter_Food(this, food_list);

        // устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);

        return inflater.inflate(R.layout.fragment_food_, container, false);
    }

    public void setInitialData(){
        food_list.add(new Food("Эспрессо"));
        food_list.add(new Food("Двойной эспрессо"));
        food_list.add(new Food("Американо"));
        food_list.add(new Food("Капучино"));
        food_list.add(new Food("Латте"));
        food_list.add(new Food("Раф"));
        food_list.add(new Food("Какао"));
        food_list.add(new Food("Фреш"));
        food_list.add(new Food("Чай садовая мята"));
    }
}
