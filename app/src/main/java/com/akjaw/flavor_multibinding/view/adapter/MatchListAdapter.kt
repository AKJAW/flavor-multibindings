package com.akjaw.flavor_multibinding.view.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.akjaw.framework.view.DisplayableItem
import com.akjaw.framework.view.MatchAdapterDelegate
import com.hannesdorfmann.adapterdelegates4.AdapterDelegatesManager

class MatchListAdapter constructor(
    matchAdapterDelegates: Set<MatchAdapterDelegate>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val delegatesManager = AdapterDelegatesManager<List<DisplayableItem>>()
    private var items = listOf<DisplayableItem>()

    init {
        matchAdapterDelegates.forEach { delegate ->
            delegatesManager.addDelegate(delegate)
        }
    }

    override fun getItemViewType(position: Int): Int {
        return delegatesManager.getItemViewType(items, position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        delegatesManager.onCreateViewHolder(parent, viewType)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        delegatesManager.onBindViewHolder(items, position, holder)
    }

    override fun getItemCount(): Int = items.count()

    fun setItems(newItems: List<DisplayableItem>) {
        items = newItems
    }
}
