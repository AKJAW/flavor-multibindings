package akjaw.flavor_multibinding

import com.akjaw.football.composition.FootballModule
import com.akjaw.bastketball.composition.BasketballModule
import com.akjaw.flavor_multibinding.composition.MatchListModule
import dagger.Module

@Module(includes = [MatchListModule::class, FootballModule::class, BasketballModule::class])
class AppModule
