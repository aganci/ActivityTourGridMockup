package com.langhetour.activitytourgridmockup;

import android.view.View;
import android.widget.TextView;

public class CategoryItem extends ListItem {
    private String categoryName;

    public CategoryItem(String categoryName) {
        super(ListItem.CATEGORY);
        this.categoryName = categoryName;
    }

    @Override
    public void bindTo(View itemView) {
        TextView title = (TextView) itemView.findViewById(R.id.category_name);
        title.setText(this.categoryName);
    }
}
