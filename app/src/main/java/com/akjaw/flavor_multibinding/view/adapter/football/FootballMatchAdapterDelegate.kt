package com.akjaw.flavor_multibinding.view.adapter.football

import android.widget.TextView
import com.akjaw.flavor_multibinding.R
import com.akjaw.flavor_multibinding.view.adapter.DisplayableItem
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegate

fun footballMatchesAdapterDelegate() =
    adapterDelegate<FootballMatch, DisplayableItem>(R.layout.item_football_match) {
        val homeTeamTextView: TextView = findViewById(R.id.football_team_home)
        val awayTeamTextView: TextView = findViewById(R.id.football_team_away)

        bind {
            homeTeamTextView.text = item.homeTeamName
            awayTeamTextView.text = item.awayTeamName
        }
    }
