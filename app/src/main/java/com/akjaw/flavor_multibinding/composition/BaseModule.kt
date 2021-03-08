package com.akjaw.flavor_multibinding.composition

import com.akjaw.football.composition.FootballModule
import com.akjaw.framework.composition.FrameworkModule
import dagger.Module

@Module(includes = [MatchListModule::class, FrameworkModule::class, FootballModule::class])
abstract class BaseModule
