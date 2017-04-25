package com.langhetour.activitytourgridmockup;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Breakfast extends ListItem {
    private String title;
    private int imageId;

    public Breakfast(String title, int imageId) {
        super(ListItem.PLACE);

        this.title = title;
        this.imageId = imageId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    @Override
    public void bindTo(View itemView) {
        ImageView image = (ImageView) itemView.findViewById(R.id.place_image);
        image.setImageDrawable(itemView.getResources().getDrawable(getImageId()));
        TextView title = (TextView) itemView.findViewById(R.id.place_title);
        title.setText(getTitle());
    }
}
