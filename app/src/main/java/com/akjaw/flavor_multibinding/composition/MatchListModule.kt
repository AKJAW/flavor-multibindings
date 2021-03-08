package com.akjaw.flavor_multibinding.composition

import com.akjaw.flavor_multibinding.domain.ConcatenatedMatchesProvider
import com.akjaw.framework.composition.customOrDefault
import com.akjaw.framework.domain.DefaultIconConfig
import com.akjaw.framework.domain.IconConfig
import com.akjaw.framework.domain.MatchesProvider
import com.akjaw.framework.view.MatchAdapterDelegate
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.multibindings.Multibinds

@Module
abstract class MatchListModule {

    @Multibinds
    abstract fun multibindMatchAdapterDelegate(): Set<MatchAdapterDelegate>

    @Multibinds
    abstract fun multibindMatchesProvider(): Set<MatchesProvider>

    @Binds
    abstract fun bindMatchesProvider(concatenatedMatchesProvider: ConcatenatedMatchesProvider): MatchesProvider

    companion object {

        @Provides
        fun provideCustomOrDefaultIconConfig(
            default: DefaultIconConfig,
            custom: Set<@JvmSuppressWildcards IconConfig>
        ): IconConfig =
            customOrDefault(default, custom)
    }
}
