package ktfx.layouts

import javafx.scene.layout.AnchorPane
import ktfx.test.LayoutTest
import kotlin.test.Test
import kotlin.test.assertEquals

class AnchorPaneTest : LayoutTest<NodeManager, AnchorPane>() {

    override fun manager() = KtfxPane()
    override fun childCount() = manager.childCount
    override fun child1() = anchorPane { }
    override fun NodeManager.child2() = anchorPane()
    override fun NodeManager.child3() = anchorPane { }

    @Test fun anchors() {
        anchorPane {
            val region1 = region() anchorAll 0.0
            assertEquals(0.0, region1.anchorTop)
            assertEquals(0.0, region1.anchorLeft)
            assertEquals(0.0, region1.anchorBottom)
            assertEquals(0.0, region1.anchorRight)
            val region2 = region() anchorTop 10.0 anchorLeft 20.0 anchorBottom 30.0 anchorRight 40.0
            assertEquals(10.0, region2.anchorTop)
            assertEquals(20.0, region2.anchorLeft)
            assertEquals(30.0, region2.anchorBottom)
            assertEquals(40.0, region2.anchorRight)

            region1.clearConstraints()
            assertEquals(region1.anchorTop, null)
            assertEquals(region1.anchorLeft, null)
            assertEquals(region1.anchorBottom, null)
            assertEquals(region1.anchorRight, null)
            region2.clearConstraints()
            assertEquals(region2.anchorTop, null)
            assertEquals(region2.anchorLeft, null)
            assertEquals(region2.anchorBottom, null)
            assertEquals(region2.anchorRight, null)

            assertEquals(children.size, 2)
        }
    }
}