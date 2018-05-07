package com.example.alex.myalbum;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.List;


public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageHolder> {

    @NonNull
    private final List<Image> images;

    public ImageAdapter(@NonNull List<Image> images) {
        this.images = images;
    }

    @Override
    public ImageHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return new ImageHolder(inflater.inflate(R.layout.item_image, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ImageHolder holder, int position) {
        Image image = images.get(position);
        Picasso.get().load(image.getUrl()).into(holder.image);
    }

    @Override
    public int getItemCount() {
        return images.size();
    }

    static class ImageHolder extends RecyclerView.ViewHolder {

        @NonNull
        private final ImageView image;

        ImageHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image_item);
        }
    }
}
