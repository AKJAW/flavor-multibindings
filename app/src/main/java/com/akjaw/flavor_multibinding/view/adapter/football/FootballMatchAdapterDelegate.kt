package com.akjaw.flavor_multibinding.view.adapter.football

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.akjaw.flavor_multibinding.R
import com.akjaw.framework.view.DisplayableItem
import com.akjaw.framework.view.MatchAdapterDelegate
import javax.inject.Inject

class FootballMatchAdapterDelegate @Inject constructor() : MatchAdapterDelegate() {

    override fun isForViewType(items: List<DisplayableItem>, position: Int): Boolean =
        items[position] is FootballMatch

    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder =
        FootballMatchViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_football_match, parent, false)
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
