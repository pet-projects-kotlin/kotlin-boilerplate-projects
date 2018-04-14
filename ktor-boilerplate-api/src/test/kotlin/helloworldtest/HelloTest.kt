package helloworldtest

import org.junit.Test
import kotlin.test.assertEquals

class HelloTest {
    @Test fun testAssert() {
        assertEquals("hello", hello())
    }
}