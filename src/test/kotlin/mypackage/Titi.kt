package mypackage

import kotlinx.serialization.Serializable

@Serializable
data class Titi<T>(
        @Serializable(with=ClassSerializer::class) val type:Class<T>
)