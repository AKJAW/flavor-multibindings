package com.akjaw.football.composition

import com.akjaw.football.view.adapter.football.FootballMatchAdapterDelegate
import com.akjaw.framework.view.MatchAdapterDelegate
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoSet

@Module
abstract class FootballModule {

    @Binds
    @IntoSet
    internal abstract fun bindFootballMatchAdapterDelegate(footballMatchAdapterDelegate: FootballMatchAdapterDelegate): MatchAdapterDelegate
}
