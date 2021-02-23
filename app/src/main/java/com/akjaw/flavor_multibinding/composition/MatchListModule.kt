package com.akjaw.flavor_multibinding.composition

import com.akjaw.flavor_multibinding.view.adapter.football.FootballMatchAdapterDelegate
import com.akjaw.framework.view.MatchAdapterDelegate
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoSet
import dagger.multibindings.Multibinds

@Module
abstract class MatchListModule {

    @Multibinds
    abstract fun multibindMatchAdapterDelegate(): Set<MatchAdapterDelegate>

    @Binds
    @IntoSet
    abstract fun bindFootballMatchAdapterDelegate(footballMatchAdapterDelegate: FootballMatchAdapterDelegate): MatchAdapterDelegate
}
