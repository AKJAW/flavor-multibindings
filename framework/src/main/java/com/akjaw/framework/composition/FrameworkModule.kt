package com.akjaw.framework.composition

import com.akjaw.framework.domain.DefaultIconConfig
import com.akjaw.framework.domain.IconConfig
import dagger.Module
import dagger.Provides
import dagger.multibindings.Multibinds

@Module
abstract class FrameworkModule {

    @Multibinds
    abstract fun multibindIconConfig(): Set<IconConfig>

    companion object {

        @Provides
        fun provideCustomOrDefaultIconConfig(
            default: DefaultIconConfig,
            custom: Set<@JvmSuppressWildcards IconConfig>
        ): IconConfig =
            customOrDefault(default, custom)
    }
}
