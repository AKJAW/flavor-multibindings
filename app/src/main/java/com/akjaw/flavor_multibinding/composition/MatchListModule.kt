package com.akjaw.flavor_multibinding.composition

import com.akjaw.bastketball.composition.BasketballModule
import com.akjaw.flavor_multibinding.domain.ConcatenatedMatchesProvider
import com.akjaw.football.composition.FootballModule
import com.akjaw.framework.domain.MatchesProvider
import com.akjaw.framework.view.MatchAdapterDelegate
import dagger.Binds
import dagger.Module
import dagger.multibindings.Multibinds

@Module(includes = [FootballModule::class, BasketballModule::class])
abstract class MatchListModule {

    @Multibinds
    abstract fun multibindMatchAdapterDelegate(): Set<MatchAdapterDelegate>

    @Multibinds
    abstract fun multibindMatchesProvider(): Set<MatchesProvider>

    @Binds
    abstract fun bindMatchesProvider(concatenatedMatchesProvider: ConcatenatedMatchesProvider): MatchesProvider
}
