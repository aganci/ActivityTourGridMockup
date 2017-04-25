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
        result.add(new Breakfast("Castello Monesiglio", R.drawable.castello_monesiglio));
        result.add(new Breakfast("Castello Prunetto", R.drawable.castello_prunetto));
        result.add(new Breakfast("Castello Saliceto", R.drawable.castello_saliceto));
        result.add(new Breakfast("Piazza Molinari", R.drawable.piazza_molinari_cortemilia));
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
