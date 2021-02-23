package com.akjaw.flavor_multibinding.view.adapter.football

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.akjaw.flavor_multibinding.R

class FootballMatchViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    private val homeTeamTextView: TextView = itemView.findViewById(R.id.football_team_home)
    private val awayTeamTextView: TextView = itemView.findViewById(R.id.football_team_away)

    fun bind(match: FootballMatch) {
        homeTeamTextView.text = match.homeTeamName
        awayTeamTextView.text = match.awayTeamName
    }
}
