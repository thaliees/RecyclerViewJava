package com.thaliees.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.thaliees.recyclerview.Model.TechnologyModel;

import java.util.List;

public class TechnologyAdapter extends RecyclerView.Adapter<TechnologyAdapter.ViewHolder> {
    private Context context;
    private List<TechnologyModel> technologyList;

    public TechnologyAdapter(List<TechnologyModel> technologyList) {
        this.technologyList = technologyList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        // Save the context (Only if you need to use it in other methods of this class)
        context = viewGroup.getContext();
        // Create a new view with the layout indicated
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.technology_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        // Replace the contents of a view for each position
        // Search the image to show
        int id = context.getResources().getIdentifier(technologyList.get(position).image, "drawable", context.getPackageName());
        // Set data
        viewHolder.getImageTechnology().setImageResource(id);
        viewHolder.getNameTechnology().setText(technologyList.get(position).name);
        viewHolder.getDescriptionTechnology().setText(technologyList.get(position).description);
    }

    @Override
    public int getItemCount() {
        return technologyList.size();
    }

    // Creation of class that provide a reference to the type of views that you are using
    public static class ViewHolder extends RecyclerView.ViewHolder{
        private final ImageView imageTechnology;
        private final TextView nameTechnology;
        private final TextView descriptionTechnology;

        // Define the elements and the events (if exist) of the ViewHolder's View
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageTechnology = itemView.findViewById(R.id.imageTechnology);
            nameTechnology = itemView.findViewById(R.id.nameTechnology);
            descriptionTechnology = itemView.findViewById(R.id.descriptionTechnology);
        }

        // Define get for each element
        public ImageView getImageTechnology() {
            return imageTechnology;
        }

        public TextView getNameTechnology() {
            return nameTechnology;
        }

        public TextView getDescriptionTechnology() {
            return descriptionTechnology;
        }
    }
}
