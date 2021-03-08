package com.akjaw.flavor_multibinding.composition

import akjaw.flavor_multibinding.composition.AppModule
import com.akjaw.flavor_multibinding.view.MainActivity
import dagger.Component

@Component(modules = [AppModule::class])
interface ApplicationComponent {

    fun inject(mainActivity: MainActivity)
}
