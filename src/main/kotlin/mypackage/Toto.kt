package mypackage

import kotlinx.serialization.*

@Serializable
data class Toto<T>(
        @Serializable(with= ClassSerializer::class) val type:Class<T>
)