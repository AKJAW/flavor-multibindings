package com.akjaw.flavor_multibinding.composition

import com.akjaw.flavor_multibinding.view.MainActivity
import dagger.Component

@Component(modules = [MatchListModule::class])
interface ApplicationComponent {

    fun inject(mainActivity: MainActivity)
}
