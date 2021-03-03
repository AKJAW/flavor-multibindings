package akjaw.flavor_multibinding

import com.akjaw.flavor_multibinding.composition.MatchListModule
import com.akjaw.football.composition.FootballModule
import dagger.Module

@Module(includes = [MatchListModule::class, FootballModule::class])
class AppModule
