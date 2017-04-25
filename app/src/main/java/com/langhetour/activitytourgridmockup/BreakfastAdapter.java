package com.langhetour.activitytourgridmockup;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

class BreakfastAdapter extends RecyclerView.Adapter<BreakfastAdapter.BreakfastViewHolder> {
    private final List<Breakfast> breakfasts;
    private final LayoutInflater inflater;

    public BreakfastAdapter(Context context, List<Breakfast> data)
    {
        inflater = LayoutInflater.from(context);
        this.breakfasts = data;
    }

    @Override
    public BreakfastViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.breakfast_item, parent, false);
        return new BreakfastViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BreakfastViewHolder holder, int position) {
        holder.bindTo(breakfasts.get(position));
    }

    @Override
    public int getItemCount() {
        return this.breakfasts.size();
    }

    class BreakfastViewHolder extends RecyclerView.ViewHolder {
        public BreakfastViewHolder(View itemView) {
            super(itemView);
        }

        public void bindTo(Breakfast breakfast) {

        }
    }
}
