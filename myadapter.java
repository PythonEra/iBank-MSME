package com.example.monthlybill;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class myadapter extends RecyclerView.Adapter<myadapter.myviewholder>
{
    Datum []data;
    Context context;

    public myadapter(Datum[] data, Context context)
    {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.singlerow,parent,false);
        return  new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position)
    {
         Datum datum=data[position];
         holder.tv.setText(datum.getTransferAmount());
        // Glide.with(holder.img.getContext()).load("http://10.0.2.2/android_db_pool/images/"+datum.getImage()).into(holder.img);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class myviewholder extends RecyclerView.ViewHolder
   {
        ImageView img;
        TextView tv;
       public myviewholder(@NonNull View itemView)
       {
           super(itemView);
           img=(ImageView)itemView.findViewById(R.id.imageholder);
           tv=(TextView)itemView.findViewById(R.id.theader);
       }
   }
}
