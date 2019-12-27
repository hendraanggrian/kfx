package ktfx.layouts

import javafx.geometry.Orientation
import javafx.scene.control.Separator
import ktfx.test.LayoutsTest
import kotlin.test.Test
import kotlin.test.assertEquals

class SeparatorTest : LayoutsTest<NodeManager, Separator>() {

    override fun manager() = KtfxPane()
    override fun childCount() = manager.childCount
    override fun child1() = separator { }
    override fun NodeManager.child2() = separator()
    override fun NodeManager.child3() = separator { }

    @Test fun verticalSeparator() {
        verticalSeparator {
            assertEquals(Orientation.VERTICAL, orientation)
        }
    }
}