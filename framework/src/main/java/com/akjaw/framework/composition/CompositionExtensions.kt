package com.akjaw.framework.composition

fun <Type> customOrDefault(defaultImplementation: Type, customImplementationsSet: Set<Type>): Type {
    require(customImplementationsSet.size <= 1) {
        "Multiple (${customImplementationsSet.size}) custom implementations bound in $customImplementationsSet"
    }
    return customImplementationsSet.firstOrNull() ?: defaultImplementation
}
