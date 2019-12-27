package ktfx.layouts

import javafx.scene.layout.Pane
import ktfx.test.LayoutsTest

class PaneTest : LayoutsTest<NodeManager, Pane>() {

    override fun manager() = KtfxPane()
    override fun childCount() = manager.childCount
    override fun child1() = pane { }
    override fun NodeManager.child2() = pane()
    override fun NodeManager.child3() = pane { }
}