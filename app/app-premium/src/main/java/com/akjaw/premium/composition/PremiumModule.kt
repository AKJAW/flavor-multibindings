package com.akjaw.premium.composition

import com.akjaw.framework.view.MatchAdapterDelegate
import com.akjaw.premium.view.adapter.BasketballMatchAdapterDelegate
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoSet

@Module
abstract class PremiumModule {

    @Binds
    @IntoSet
    abstract fun bindBasketballMatchAdapterDelegate(basketballMatchAdapterDelegate: BasketballMatchAdapterDelegate): MatchAdapterDelegate
}
