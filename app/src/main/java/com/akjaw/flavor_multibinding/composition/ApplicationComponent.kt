package com.akjaw.flavor_multibinding.composition

import com.akjaw.football.view.adapter.MatchListAdapterFactory
import dagger.Component

@Component(modules = [MatchListModule::class])
interface ApplicationComponent {

    fun matchListAdapterFactory(): MatchListAdapterFactory
}
