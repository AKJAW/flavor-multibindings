package com.akjaw.flavor_multibinding.view

import android.app.Application
import com.akjaw.flavor_multibinding.composition.ApplicationComponent
import com.akjaw.flavor_multibinding.composition.DaggerApplicationComponent

class FlavorMultibindingApp : Application() {

    val applicationComponent: ApplicationComponent by lazy {
        DaggerApplicationComponent.builder().build()
    }
}
