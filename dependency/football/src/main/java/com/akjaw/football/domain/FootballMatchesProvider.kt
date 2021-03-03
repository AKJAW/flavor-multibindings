package com.akjaw.football.domain

import com.akjaw.football.view.adapter.football.FootballMatch
import com.akjaw.framework.domain.MatchesProvider
import com.akjaw.framework.view.DisplayableItem
import javax.inject.Inject

class FootballMatchesProvider @Inject constructor() : MatchesProvider {

    override fun get(): List<DisplayableItem> {
        return listOf(
            FootballMatch("Burnley", "Leicester"),
            FootballMatch("Leipzig", "Wolfsburg"),
            FootballMatch("Chelsea", "Atlético Madrid"),
        )
    }
}
