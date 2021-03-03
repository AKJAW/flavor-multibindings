package com.akjaw.football.composition

import com.akjaw.football.domain.FootballMatchesProvider
import com.akjaw.football.view.adapter.football.FootballMatchAdapterDelegate
import com.akjaw.framework.domain.MatchesProvider
import com.akjaw.framework.view.MatchAdapterDelegate
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoSet

@Module
abstract class FootballModule {

    @Binds
    @IntoSet
    abstract fun bindFootballMatchAdapterDelegate(footballMatchAdapterDelegate: FootballMatchAdapterDelegate): MatchAdapterDelegate

    @Binds
    @IntoSet
    abstract fun bindFootballMatchesProvider(basketballMatchesProvider: FootballMatchesProvider): MatchesProvider
}
