package akjaw.flavor_multibinding.composition

import akjaw.flavor_multibinding.domain.PremiumIconConfig
import com.akjaw.framework.domain.IconConfig
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoSet

@Module
internal abstract class PremiumModule {

    @Binds
    @IntoSet
    abstract fun bindPremiumIconConfig(premiumIconConfig: PremiumIconConfig): IconConfig
}
