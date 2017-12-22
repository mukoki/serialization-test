package mypackage

import kotlinx.serialization.*
import kotlinx.serialization.internal.SerialClassDescImpl

@Serializer(forClass=Class::class)
class ClassSerializer: KSerializer<Class<*>> {

    override fun save(output: KOutput, obj: Class<*>) {
        output.writeStringValue(obj.name)
    }

    override fun load(input: KInput): Class<*> {
        return Class.forName(input.readStringValue())
    }

    override val serialClassDesc: KSerialClassDesc = SerialClassDescImpl("java.lang.Class")
}