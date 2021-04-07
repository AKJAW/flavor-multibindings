package com.akjaw.flavor_multibindings.composition

import com.akjaw.football.composition.FootballModule
import dagger.Module

@Module(includes = [MatchListModule::class, FootballModule::class])
abstract class BaseModule
