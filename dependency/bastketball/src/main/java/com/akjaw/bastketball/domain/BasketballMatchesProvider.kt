package com.akjaw.bastketball.domain

import com.akjaw.bastketball.view.adapter.BasketballMatch
import com.akjaw.framework.domain.MatchesProvider
import com.akjaw.framework.view.DisplayableItem
import javax.inject.Inject

class BasketballMatchesProvider @Inject constructor() : MatchesProvider {

    override fun get(): List<DisplayableItem> {
        return listOf(
            BasketballMatch("Denver Nuggets", "Boston Celtics"),
            BasketballMatch("Atlanta Hawks", "Charlotte Hornets"),
            BasketballMatch("Orlando Magic", "Washington Wizards"),
        )
    }
}
