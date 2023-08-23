package com.example.roomlib_i;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.zip.Inflater;
public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private Context context;
    private List<Entity> data;

    public Adapter(Context context, List<Entity> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.data_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Entity entity = data.get(position);
        holder.id.setText(String.valueOf(entity.getId()));
        holder.name.setText(entity.getName());
        holder.author.setText(entity.getAuthor());
        holder.pages.setText(entity.getNumber());

        holder.overFlow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle overflow icon click here
                // For example, show a popup menu with options
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView id, name, author, pages;
        ImageView overFlow;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            id = itemView.findViewById(R.id.tvID);
            name = itemView.findViewById(R.id.tvName);
            author = itemView.findViewById(R.id.tvAuthor);
            pages = itemView.findViewById(R.id.tvPages);
            overFlow = itemView.findViewById(R.id.imgOverFlow);
        }
    }

    public void setData(List<Entity> newData) {
        data.clear();
        data.addAll(newData);
        notifyDataSetChanged();
    }
}
