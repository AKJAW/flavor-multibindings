package com.akjaw.flavor_multibindings.view

import android.app.Application
import com.akjaw.flavor_multibindings.composition.ApplicationComponent
import com.akjaw.flavor_multibindings.composition.DaggerApplicationComponent

class FlavorMultibindingApp : Application() {

    val applicationComponent: ApplicationComponent by lazy {
        DaggerApplicationComponent.builder().build()
    }
}
