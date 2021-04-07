package com.akjaw.flavor_multibindings.composition

import akjaw.flavor_multibindings.composition.AppModule
import com.akjaw.flavor_multibindings.view.MainActivity
import dagger.Component

@Component(modules = [AppModule::class])
interface ApplicationComponent {

    fun inject(mainActivity: MainActivity)
}
