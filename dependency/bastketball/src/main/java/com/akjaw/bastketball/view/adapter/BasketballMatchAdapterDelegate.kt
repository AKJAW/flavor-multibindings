package com.akjaw.bastketball.view.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.akjaw.bastketball.R
import com.akjaw.framework.view.DisplayableItem
import com.akjaw.framework.view.MatchAdapterDelegate
import com.akjaw.framework.view.inflateLayout
import javax.inject.Inject

internal class BasketballMatchAdapterDelegate @Inject constructor() : MatchAdapterDelegate() {

    override fun isForViewType(items: List<DisplayableItem>, position: Int): Boolean =
        items[position] is BasketballMatch

    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder =
        BasketballMatchViewHolder(
            parent.inflateLayout(R.layout.item_basketball_match)
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
