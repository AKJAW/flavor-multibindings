package akjaw.flavor_multibindings.composition

import akjaw.flavor_multibindings.domain.ConcatenatedMatchesProvider
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
