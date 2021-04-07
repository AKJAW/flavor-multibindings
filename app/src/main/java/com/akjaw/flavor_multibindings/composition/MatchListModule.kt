package com.akjaw.flavor_multibindings.composition

import com.akjaw.football.domain.FootballMatchesProvider
import com.akjaw.framework.composition.customOrDefault
import com.akjaw.framework.domain.MatchesProvider
import com.akjaw.framework.view.MatchAdapterDelegate
import dagger.Module
import dagger.Provides
import dagger.multibindings.Multibinds

@Module
abstract class MatchListModule {

    @Multibinds
    abstract fun multibindMatchAdapterDelegate(): Set<MatchAdapterDelegate>

    @Multibinds
    abstract fun multibindMatchesProvider(): Set<MatchesProvider>

    companion object {
        // Analytics, default goes to debug, premium is logged in a "framework"

        @Provides
        fun provideDefaultOrCustomMatchesProvider(
            default: FootballMatchesProvider,
            custom: Set<@JvmSuppressWildcards MatchesProvider>
        ): MatchesProvider =
            customOrDefault(default, custom)
    }
}
