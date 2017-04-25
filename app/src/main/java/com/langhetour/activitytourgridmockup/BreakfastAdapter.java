package com.langhetour.activitytourgridmockup;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

class BreakfastAdapter extends RecyclerView.Adapter<BreakfastAdapter.BreakfastViewHolder> {
    private final List<ListItem> breakfasts;
    private final LayoutInflater inflater;

    public BreakfastAdapter(Context context, List<ListItem> data)
    {
        inflater = LayoutInflater.from(context);
        this.breakfasts = data;
    }

    @Override
    public BreakfastViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;

        switch(viewType) {
            case ListItem.PLACE:
                view = inflater.inflate(R.layout.breakfast_item, parent, false);
                return new BreakfastViewHolder(view);
            case ListItem.CATEGORY:
                view = inflater.inflate(R.layout.breakfast_title, parent, false);
                return new BreakfastViewHolder(view);
            default:
                throw new IllegalArgumentException("Invalid viewType" + viewType);
        }
    }

    @Override
    public void onBindViewHolder(BreakfastViewHolder holder, int position) {
        holder.bindTo(breakfasts.get(position));
    }

    @Override
    public int getItemCount() {
        return this.breakfasts.size();
    }

    @Override
    public int getItemViewType(int position) {
        return this.breakfasts.get(position).getItemType();
    }

    class BreakfastViewHolder extends RecyclerView.ViewHolder {
        public BreakfastViewHolder(View itemView) {
            super(itemView);
        }

        public void bindTo(ListItem item) {
            item.bindTo(itemView);
        }
    }
}
