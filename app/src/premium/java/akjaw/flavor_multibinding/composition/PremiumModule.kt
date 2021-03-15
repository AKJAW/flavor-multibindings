package akjaw.flavor_multibinding.composition

import akjaw.flavor_multibinding.domain.ConcatenatedMatchesProvider
import com.akjaw.framework.domain.MatchesProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoSet

@Module
internal abstract class PremiumModule {

    @Binds
    @IntoSet
    abstract fun bindMatchesProvider(concatenatedMatchesProvider: ConcatenatedMatchesProvider): MatchesProvider
}
