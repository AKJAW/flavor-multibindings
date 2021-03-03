package com.akjaw.bastketball.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.akjaw.bastketball.R
import com.akjaw.framework.view.DisplayableItem
import com.akjaw.framework.view.MatchAdapterDelegate
import javax.inject.Inject

class BasketballMatchAdapterDelegate @Inject constructor() : MatchAdapterDelegate() {

    override fun isForViewType(items: List<DisplayableItem>, position: Int): Boolean =
        items[position] is BasketballMatch

    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder =
        BasketballMatchViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_basketball_match, parent, false)
        )

    override fun onBindViewHolder(
        items: List<DisplayableItem>,
        position: Int,
        holder: RecyclerView.ViewHolder,
        payloads: MutableList<Any>
    ) {
        val match = items[position] as BasketballMatch
        (holder as BasketballMatchViewHolder).bind(match)
    }
}
