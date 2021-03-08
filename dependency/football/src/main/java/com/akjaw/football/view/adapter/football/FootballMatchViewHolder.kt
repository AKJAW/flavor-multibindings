package com.akjaw.football.view.adapter.football

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.akjaw.football.R
import com.akjaw.framework.domain.IconConfig

internal class FootballMatchViewHolder(
    itemView: View,
    private val iconConfig: IconConfig
): RecyclerView.ViewHolder(itemView) {
    private val iconImageView: ImageView = itemView.findViewById(R.id.football_icon)
    private val homeTeamTextView: TextView = itemView.findViewById(R.id.football_team_home)
    private val awayTeamTextView: TextView = itemView.findViewById(R.id.football_team_away)

    fun bind(match: FootballMatch) {
        if (iconConfig.isIconEnabled) {
            iconImageView.visibility = View.VISIBLE
        }
        homeTeamTextView.text = match.homeTeamName
        awayTeamTextView.text = match.awayTeamName
    }
}
