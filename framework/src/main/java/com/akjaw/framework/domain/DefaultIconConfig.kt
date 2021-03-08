package com.akjaw.framework.domain

import javax.inject.Inject

class DefaultIconConfig @Inject constructor(): IconConfig {

    override val isIconEnabled: Boolean = false
}
