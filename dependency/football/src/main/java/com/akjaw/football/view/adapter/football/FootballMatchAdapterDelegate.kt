package com.akjaw.football.view.adapter.football

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.akjaw.football.R
import com.akjaw.framework.view.DisplayableItem
import com.akjaw.framework.view.MatchAdapterDelegate
import com.akjaw.framework.view.inflateLayout
import javax.inject.Inject

internal class FootballMatchAdapterDelegate @Inject constructor() : MatchAdapterDelegate() {

    override fun isForViewType(items: List<DisplayableItem>, position: Int): Boolean =
        items[position] is FootballMatch

    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder =
        FootballMatchViewHolder(
            parent.inflateLayout(R.layout.item_football_match)
        )

    override fun onBindViewHolder(
        items: List<DisplayableItem>,
        position: Int,
        holder: RecyclerView.ViewHolder,
        payloads: MutableList<Any>
    ) {
        val match = items[position] as FootballMatch
        (holder as FootballMatchViewHolder).bind(match)
    }
}
