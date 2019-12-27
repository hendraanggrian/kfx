package ktfx.layouts

import javafx.scene.control.RadioMenuItem
import ktfx.test.LayoutsTest
import kotlin.test.assertNull

class RadioMenuItemTest : LayoutsTest<MenuItemManager, RadioMenuItem>() {

    override fun manager() = KtfxMenu("", null)
    override fun childCount() = manager.childCount
    override fun child1() = radioMenuItem { }
    override fun MenuItemManager.child2() = radioMenuItem()
    override fun MenuItemManager.child3() = radioMenuItem { }

    override fun RadioMenuItem.testDefaultValues() {
        assertNull(text)
        assertNull(graphic)
    }
}