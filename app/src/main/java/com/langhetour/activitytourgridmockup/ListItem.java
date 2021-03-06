package com.langhetour.activitytourgridmockup;

import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class ListItem {
    static List<ListItem> getData() {
        ArrayList<ListItem> result = new ArrayList<>();
        result.add(new CategoryItem("Colazione"));
        result.add(new Breakfast("Pasticceria Cerrato", R.drawable.pasticceria_cerrato));
        result.add(new Breakfast("Corte di Canobbio", R.drawable.pasticceria_la_corte_di_canobbio));
        result.add(new Breakfast("Dolce Langa", R.drawable.pasticceria_la_dolce_langa));
        result.add(new CategoryItem("Visitare"));
        result.add(new Breakfast("Cascina Barroero", R.drawable.cascina_barroero));
        result.add(new Breakfast("Pieve di S. Maria", R.drawable.pieve_di_santa_maria_cortemilia));
        result.add(new Breakfast("Piazza Molinari", R.drawable.piazza_molinari_cortemilia));
        result.add(new Breakfast("Centro del Mondo", R.drawable.monumento_centro_del_mondo_cortemilia));
        result.add(new Breakfast("Bergolo", R.drawable.bergolo));
        result.add(new Breakfast("Castello Prunetto", R.drawable.castello_prunetto));
        result.add(new CategoryItem("Mangiare"));
        result.add(new Breakfast("Osteria Langhet", R.drawable.langhet));
        result.add(new Breakfast("Pizzeria La Torre", R.drawable.pizzeria_la_torre_cortemilia));
        result.add(new CategoryItem("Dormire"));
        result.add(new Breakfast("Orchidea Selvatica", R.drawable.b_b_orchidea_selvatica));
        result.add(new Breakfast("Le Coccinelle", R.drawable.b_b_coccinelle));
        return result;
    }


    public static final int CATEGORY = 1;
    public static final int PLACE = 2;

    private int viewType;

    public ListItem(int viewType) {
        this.viewType = viewType;
    }

    public int getItemType() {
        return viewType;
    }

    public void bindTo(View itemView) {
    }
}
