package com.example.capstoneproject.core.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.capstoneproject.core.R
import com.example.capstoneproject.core.databinding.ItemListTeamBinding
import com.example.capstoneproject.core.domain.model.Team

class TeamAdapter : RecyclerView.Adapter<TeamAdapter.ListViewHolder>() {

    private var listData = ArrayList<Team>()
    var onItemClick: ((Team) -> Unit)? = null

    fun setData(newListData: List<Team>?) {
        if (newListData == null) return
        val diffCallback = DiffCallback(this.listData, newListData)
        val diffResult = DiffUtil.calculateDiff(diffCallback)
        listData.clear()
        listData.addAll(newListData)
        diffResult.dispatchUpdatesTo(this)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ListViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_list_team, parent, false)
        )

    override fun getItemCount() = listData.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val data = listData[position]
        holder.bind(data)
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemListTeamBinding.bind(itemView)
        fun bind(data: Team) {
            with(binding) {
                Glide.with(itemView.context)
                    .load(data.badge)
                    .into(ivItemImage)
                tvItemTitle.text = data.team
                tvItemSubtitle.text = data.stadium
            }
        }

        init {
            binding.root.setOnClickListener {
                onItemClick?.invoke(listData[adapterPosition])
            }
        }
    }
}