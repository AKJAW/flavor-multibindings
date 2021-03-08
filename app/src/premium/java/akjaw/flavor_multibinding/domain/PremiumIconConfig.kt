package akjaw.flavor_multibinding.domain

import com.akjaw.framework.domain.IconConfig
import javax.inject.Inject

internal class PremiumIconConfig @Inject constructor() : IconConfig {

    override val isIconEnabled: Boolean = true
}
