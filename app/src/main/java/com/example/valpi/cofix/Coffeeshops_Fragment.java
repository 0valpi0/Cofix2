package com.example.valpi.cofix;


import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public class Coffeeshops_Fragment extends Fragment {

    List<Coffeeshop> coffeeshops = new ArrayList<>();


    public Coffeeshops_Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        setInitialData();
        RecyclerView recyclerView = null;
        recyclerView = (RecyclerView) recyclerView.findViewById(R.id.coffeshops_list);

        // создаем адаптер
        DataAdapter_Coffeeshops adapter = new DataAdapter_Coffeeshops(this, coffeeshops);

        // устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);

        return inflater.inflate(R.layout.fragment_coffeeshops_, container, false);
    }

    public void setInitialData(){
        coffeeshops.add(new Coffeeshop("Москва", "Планерная улица, 7"));
        coffeeshops.add(new Coffeeshop("Москва", "МКАД, 24-й километр, 1"));
        coffeeshops.add(new Coffeeshop("Москва", "Московская область, Мытищи, Шараповский проезд, вл2с3"));
        coffeeshops.add(new Coffeeshop("Москва", "Московская область, Котельники, 1-й Покровский проезд, 5"));
        coffeeshops.add(new Coffeeshop("Москва", "Ходынский бульвар, 4"));
        coffeeshops.add(new Coffeeshop("Москва", "Сходненская улица, 56"));
        coffeeshops.add(new Coffeeshop("Москва", "МКАД, 66-й километр, вл1"));
        coffeeshops.add(new Coffeeshop("Москва", "Бауманская улица, 33/2с1"));
        coffeeshops.add(new Coffeeshop("Москва", "Тверская улица, 27с2"));
        coffeeshops.add(new Coffeeshop("Москва", "Манежная площадь, 1с2"));
    }

}
