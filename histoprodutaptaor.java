package com.example.monthlybill;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class histoprodutaptaor extends RecyclerView.Adapter<histoprodutaptaor.ProductViewHolder> {


    private Context mCtx;
    private List<historyproduct> productList;

    public histoprodutaptaor(Context mCtx, List<historyproduct> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }

    @Override
    public histoprodutaptaor.ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.product_list, null);
        return new histoprodutaptaor.ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(histoprodutaptaor.ProductViewHolder holder, int position) {
        historyproduct historyproduct = productList.get(position);

        //loading the image
        Glide.with(mCtx)
                .load(historyproduct.getImage())
                .into(holder.imageView);

        holder.textViewTitle.setText(historyproduct.getfrom_account());
        holder.textViewShortDesc.setText(historyproduct.getto_account());
        holder.textViewRating.setText(String.valueOf(historyproduct.gettransfer_amount()));
        holder.textViewPrice.setText(String.valueOf(historyproduct.getdate()));
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView textViewTitle, textViewShortDesc, textViewRating, textViewPrice;
        ImageView imageView;

        public ProductViewHolder(View itemView) {
            super(itemView);

            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewShortDesc = itemView.findViewById(R.id.textViewShortDesc);
            textViewRating = itemView.findViewById(R.id.textViewRating);
            textViewPrice = itemView.findViewById(R.id.textViewPrice);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }


}
