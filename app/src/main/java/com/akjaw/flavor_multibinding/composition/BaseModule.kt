package com.akjaw.flavor_multibinding.composition

import com.akjaw.football.composition.FootballModule
import com.akjaw.framework.composition.DefaultFrameworkModule
import dagger.Module

@Module(includes = [MatchListModule::class, DefaultFrameworkModule::class, FootballModule::class])
abstract class BaseModule
