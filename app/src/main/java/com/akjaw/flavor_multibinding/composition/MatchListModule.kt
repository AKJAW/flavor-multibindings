package com.akjaw.flavor_multibinding.composition

import com.akjaw.bastketball.composition.BasketballModule
import com.akjaw.football.composition.FootballModule
import com.akjaw.football.view.adapter.football.FootballMatchAdapterDelegate
import com.akjaw.framework.view.MatchAdapterDelegate
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoSet
import dagger.multibindings.Multibinds

@Module(includes = [FootballModule::class, BasketballModule::class])
abstract class MatchListModule {

    @Multibinds
    abstract fun multibindMatchAdapterDelegate(): Set<MatchAdapterDelegate>

    @Binds
    @IntoSet
    abstract fun bindFootballMatchAdapterDelegate(footballMatchAdapterDelegate: FootballMatchAdapterDelegate): MatchAdapterDelegate
}
