package ktfx.layouts.scene.control

import javafx.scene.control.TreeTableView
import ktfx.layouts.KtfxPane
import ktfx.layouts.NodeManager
import ktfx.layouts.treeTableView
import ktfx.test.BaseLayoutTest
import kotlin.test.assertNull

class TreeTableViewTest : BaseLayoutTest<NodeManager, TreeTableView<String>>() {

    override fun manager() = KtfxPane()
    override fun childCount() = manager.childCount
    override fun child1() = treeTableView<String> { }
    override fun NodeManager.child2() = treeTableView<String>()
    override fun NodeManager.child3() = treeTableView<String> { }

    override fun TreeTableView<String>.testDefaultValues() {
        assertNull(root)
    }
}