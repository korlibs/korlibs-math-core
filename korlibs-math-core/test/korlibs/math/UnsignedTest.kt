package korlibs.math

import kotlin.test.*

class UnsignedTest {
    @Test
    fun test() {
        val ba = byteArrayOf(-1)
        assertEquals(-1, ba[0])
        assertEquals(255, ba[0].unsigned)
        assertEquals(0xFFFFFFFFL, (-1).unsigned)
    }
}
