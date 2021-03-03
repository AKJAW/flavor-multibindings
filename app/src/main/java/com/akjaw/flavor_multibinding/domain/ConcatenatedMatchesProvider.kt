package com.akjaw.flavor_multibinding.domain

import com.akjaw.framework.domain.MatchesProvider
import com.akjaw.framework.view.DisplayableItem
import javax.inject.Inject

class ConcatenatedMatchesProvider @Inject constructor(
    private val matchesProvider: Set<@JvmSuppressWildcards MatchesProvider>
): MatchesProvider {

    override fun get(): List<DisplayableItem> {
        return matchesProvider.map {
            it.get()
        }.flatten()
    }
}
