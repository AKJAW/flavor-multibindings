package com.akjaw.bastketball.view.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.akjaw.bastketball.R
import com.akjaw.framework.domain.IconConfig

internal class BasketballMatchViewHolder(
    itemView: View,
    private val iconConfig: IconConfig,
): RecyclerView.ViewHolder(itemView) {
    private val iconImageView: ImageView = itemView.findViewById(R.id.basketball_icon)
    private val homeTeamTextView: TextView = itemView.findViewById(R.id.basketball_team_home)
    private val awayTeamTextView: TextView = itemView.findViewById(R.id.basketball_team_away)

    fun bind(match: BasketballMatch) {
        if (iconConfig.isIconEnabled) {
            iconImageView.visibility = View.VISIBLE
        }
        homeTeamTextView.text = match.homeTeamName
        awayTeamTextView.text = match.awayTeamName
    }
}
