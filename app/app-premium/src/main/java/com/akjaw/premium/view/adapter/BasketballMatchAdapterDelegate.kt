package com.akjaw.premium.view.adapter

import android.widget.TextView
import com.akjaw.framework.view.DisplayableItem
import com.akjaw.premium.R
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
