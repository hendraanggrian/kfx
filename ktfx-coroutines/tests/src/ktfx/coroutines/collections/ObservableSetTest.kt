package ktfx.coroutines.collections

import javafx.collections.FXCollections
import javafx.collections.ObservableSet
import ktfx.coroutines.listener
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class ObservableSetTest {

    private val observable: ObservableSet<String> = FXCollections.observableSet()

    @Test fun listener() = observable.run {
        val s = "Hello"
        val listener = listener<String> {
            assertTrue(it.wasAdded())
            assertEquals(it.elementAdded, s)
        }
        add(s)
        removeListener(listener)
    }
}