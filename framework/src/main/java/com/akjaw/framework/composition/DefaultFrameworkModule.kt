package com.akjaw.framework.composition

import com.akjaw.framework.domain.IconConfig
import dagger.Module
import dagger.multibindings.Multibinds

@Module
abstract class DefaultFrameworkModule {

    @Multibinds
    abstract fun multibindIconConfig(): Set<IconConfig>
}
