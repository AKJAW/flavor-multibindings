package com.akjaw.flavor_multibinding.composition

import com.akjaw.football.composition.FootballModule
import dagger.Module

@Module(includes = [MatchListModule::class, FootballModule::class])
abstract class BaseModule
