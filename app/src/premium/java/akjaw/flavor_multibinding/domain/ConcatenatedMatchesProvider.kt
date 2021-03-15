package akjaw.flavor_multibinding.domain

import com.akjaw.bastketball.domain.BasketballMatchesProvider
import com.akjaw.football.domain.FootballMatchesProvider
import com.akjaw.framework.domain.MatchesProvider
import com.akjaw.framework.view.DisplayableItem
import javax.inject.Inject

class ConcatenatedMatchesProvider @Inject constructor(
    private val footballMatchesProvider: FootballMatchesProvider,
    private val basketballMatchesProvider: BasketballMatchesProvider,
): MatchesProvider {

    override fun get(): List<DisplayableItem> {
        return footballMatchesProvider.get()
            .zip(basketballMatchesProvider.get()) { a, b ->
                listOf(a, b)
        }.flatten()
    }
}
