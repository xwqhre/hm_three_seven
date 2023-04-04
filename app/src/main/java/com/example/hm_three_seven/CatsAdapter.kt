package com.example.hm_three_seven

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hm_three_seven.databinding.ItemCatsBinding

class CatsAdapter(
    var arrayListCats: ArrayList<CatsModel>
        ): RecyclerView.Adapter<CatsAdapter.CatsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatsViewHolder {
        return CatsViewHolder(ItemCatsBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: CatsViewHolder, position: Int) {
        holder.onBind(arrayListCats[position])
    }

    override fun getItemCount(): Int {
        return arrayListCats.size
    }

     class CatsViewHolder(private val binding: ItemCatsBinding)
        :RecyclerView.ViewHolder(binding.root){

         fun onBind(catsName: CatsModel) {
        binding.textView.text = catsName.name + " " +"," + catsName.price.toString()
             binding.imageView.setImageResource(catsName.img)
         }
        }
    }
