package com.example.c35d_crud.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.c35d_crud.R
import com.example.c35d_crud.model.ProductModel

class ProductAdapter(var context: Context,
                     var data : ArrayList<ProductModel>)
    : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    class ProductViewHolder(itemView: View)
        : RecyclerView.ViewHolder(itemView){
            var productName : TextView = itemView.findViewById(R.id.displayName)
            var productPrice : TextView = itemView.findViewById(R.id.displayPrice)
            var productDesc : TextView = itemView.findViewById(R.id.displayDesc)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}