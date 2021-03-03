package com.akjaw.bastketball.view.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.akjaw.bastketball.R

class BasketballMatchViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    private val homeTeamTextView: TextView = itemView.findViewById(R.id.basketball_team_home)
    private val awayTeamTextView: TextView = itemView.findViewById(R.id.basketball_team_away)

    fun bind(match: BasketballMatch) {
        homeTeamTextView.text = match.homeTeamName
        awayTeamTextView.text = match.awayTeamName
    }
}
