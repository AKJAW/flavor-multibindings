package com.akjaw.flavor_multibinding.view.adapter.basketball

import android.widget.TextView
import com.akjaw.flavor_multibinding.R
import com.akjaw.flavor_multibinding.view.adapter.DisplayableItem
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegate

fun basketballMatchesAdapterDelegate() =
    adapterDelegate<BasketballMatch, DisplayableItem>(R.layout.item_basketball_match) {
        val homeTeamTextView: TextView = findViewById(R.id.basketball_team_home)
        val awayTeamTextView: TextView = findViewById(R.id.basketball_team_away)

        bind {
            homeTeamTextView.text = item.homeTeamName
            awayTeamTextView.text = item.awayTeamName
        }
    }
