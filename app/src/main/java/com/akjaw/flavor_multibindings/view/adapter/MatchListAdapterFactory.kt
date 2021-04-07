package com.akjaw.flavor_multibindings.view.adapter

import com.akjaw.framework.view.MatchAdapterDelegate
import javax.inject.Inject

class MatchListAdapterFactory @Inject constructor(
    private val matchAdapterDelegates: Set<@JvmSuppressWildcards MatchAdapterDelegate>
)  {

    fun create(): MatchListAdapter = MatchListAdapter(matchAdapterDelegates)
}
