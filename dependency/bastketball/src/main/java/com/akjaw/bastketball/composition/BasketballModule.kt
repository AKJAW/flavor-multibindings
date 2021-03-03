package com.akjaw.bastketball.composition

import com.akjaw.bastketball.view.adapter.BasketballMatchAdapterDelegate
import com.akjaw.framework.view.MatchAdapterDelegate
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoSet

@Module
abstract class BasketballModule {

    @Binds
    @IntoSet
    abstract fun bindBasketballMatchAdapterDelegate(basketballMatchAdapterDelegate: BasketballMatchAdapterDelegate): MatchAdapterDelegate
}
