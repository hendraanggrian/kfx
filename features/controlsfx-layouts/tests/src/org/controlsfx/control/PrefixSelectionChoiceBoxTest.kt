package ktfx.controlsfx.layouts

import ktfx.layouts.KtfxPane
import ktfx.layouts.NodeManager
import ktfx.test.LayoutsTest
import org.controlsfx.control.PrefixSelectionChoiceBox

class PrefixSelectionChoiceBoxTest : LayoutsTest<NodeManager, PrefixSelectionChoiceBox<String>>() {

    override fun manager() = KtfxPane()
    override fun childCount() = manager.childCount
    override fun child1() = prefixSelectionChoiceBox<String> { }
    override fun NodeManager.child2() = prefixSelectionChoiceBox<String>()
    override fun NodeManager.child3() = prefixSelectionChoiceBox<String> { }
}