package akjaw.flavor_multibindings.composition

import com.akjaw.bastketball.composition.BasketballModule
import com.akjaw.flavor_multibindings.composition.BaseModule
import dagger.Module

@Module(includes = [BaseModule::class, PremiumModule::class, BasketballModule::class])
class AppModule
