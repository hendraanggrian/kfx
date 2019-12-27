package ktfx.layouts

import javafx.scene.layout.VBox
import ktfx.test.LayoutsTest
import kotlin.test.assertEquals

class VBoxTest : LayoutsTest<NodeManager, VBox>() {

    override fun manager() = KtfxPane()
    override fun childCount() = manager.childCount
    override fun child1() = vbox { }
    override fun NodeManager.child2() = vbox()
    override fun NodeManager.child3() = vbox { }

    override fun VBox.testDefaultValues() {
        assertEquals(0.0, spacing)
    }
}