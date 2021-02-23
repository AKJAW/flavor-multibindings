package com.akjaw.flavor_multibinding.composition

import com.akjaw.flavor_multibinding.view.adapter.MatchListAdapterFactory
import com.akjaw.premium.composition.PremiumModule
import dagger.Component

@Component(modules = [MatchListModule::class, PremiumModule::class])
interface ApplicationComponent {

    fun matchListAdapterFactory(): MatchListAdapterFactory
}
