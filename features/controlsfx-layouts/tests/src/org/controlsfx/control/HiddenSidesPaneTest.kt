package ktfx.controlsfx.layouts

import ktfx.layouts.KtfxPane
import ktfx.layouts.NodeManager
import ktfx.test.LayoutTest
import org.controlsfx.control.HiddenSidesPane

class HiddenSidesPaneTest : LayoutTest<NodeManager, HiddenSidesPane>() {

    override fun manager() = KtfxPane()
    override fun childCount() = manager.childCount
    override fun child1() = hiddenSidesPane { }
    override fun NodeManager.child2() = hiddenSidesPane()
    override fun NodeManager.child3() = hiddenSidesPane { }
}