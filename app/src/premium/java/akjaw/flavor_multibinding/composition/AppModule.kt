package akjaw.flavor_multibinding.composition

import com.akjaw.bastketball.composition.BasketballModule
import com.akjaw.flavor_multibinding.composition.BaseModule
import dagger.Module

@Module(includes = [BaseModule::class, PremiumModule::class, BasketballModule::class])
class AppModule
