package ktfx.layouts.scene.control

import javafx.scene.control.ListView
import ktfx.layouts.KtfxPane
import ktfx.layouts.NodeManager
import ktfx.layouts.listView
import ktfx.test.BaseLayoutTest
import ktfx.test.assertEmpty

class ListViewTest : BaseLayoutTest<NodeManager, ListView<String>>() {

    override fun manager() = KtfxPane()
    override fun childCount() = manager.childCount
    override fun child1() = listView<String> { }
    override fun NodeManager.child2() = listView<String>()
    override fun NodeManager.child3() = listView<String> { }

    override fun ListView<String>.testDefaultValues() {
        assertEmpty(items)
    }
}