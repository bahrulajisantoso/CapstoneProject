package com.example.capstoneproject.core.ui

import androidx.recyclerview.widget.DiffUtil
import com.example.capstoneproject.core.domain.model.Team

class DiffCallback(
    private val mOldList: List<Team>,
    private val mNewList: List<Team>
) : DiffUtil.Callback() {

    override fun getOldListSize(): Int {
        return mOldList.size
    }

    override fun getNewListSize(): Int {
        return mNewList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return mOldList[oldItemPosition].id == mNewList[newItemPosition].id
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldEmployee = mOldList[oldItemPosition]
        val newEmployee = mNewList[newItemPosition]
        return oldEmployee.id == newEmployee.id
    }
}