package com.akjaw.framework.domain

import com.akjaw.framework.view.DisplayableItem

interface MatchesProvider {

    fun get(): List<DisplayableItem>
}
