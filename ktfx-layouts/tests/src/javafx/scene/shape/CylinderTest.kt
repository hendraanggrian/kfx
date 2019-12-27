package ktfx.layouts

import javafx.scene.shape.Cylinder
import ktfx.test.LayoutsTest
import kotlin.test.assertEquals

class CylinderTest : LayoutsTest<NodeManager, Cylinder>() {

    override fun manager() = KtfxPane()
    override fun childCount() = manager.childCount
    override fun child1() = cylinder { }
    override fun NodeManager.child2() = cylinder()
    override fun NodeManager.child3() = cylinder { }

    override fun Cylinder.testDefaultValues() {
        assertEquals(1.0, radius)
        assertEquals(2.0, height)
        assertEquals(64, divisions)
    }
}