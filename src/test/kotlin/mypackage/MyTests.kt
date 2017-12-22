package mypackage

import kotlinx.serialization.internal.StringSerializer
import kotlinx.serialization.json.JSON
import org.junit.Test

class MyTests {

    @Test
    public fun testTiti() {
        val titi = Titi(String::class.java)
        println(JSON.stringify(Titi.serializer(StringSerializer), titi))
    }

    @Test
    public fun testToto() {
        val toto = Toto(String::class.java)
        println(JSON.stringify(Toto.serializer(StringSerializer), toto))
    }

}