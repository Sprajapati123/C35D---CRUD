package com.example.c35d_crud.adapter

import android.content.Context
import android.view.LayoutInflater
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
        val itemView : View = LayoutInflater.from(context).inflate(
            R.layout.sample_products,
            parent,false)
        return ProductViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
       holder.productName.text = data[position].productName
       holder.productPrice.text = data[position].price.toString()
       holder.productDesc.text = data[position].productDesc
    }

    fun updateData(products: List<ProductModel>){
        data.clear()
        data.addAll(products)
        notifyDataSetChanged()
    }


}