package ktfx.layouts

import javafx.scene.control.SeparatorMenuItem
import ktfx.test.LayoutTest

class SeparatorMenuItemTest : LayoutTest<MenuItemManager, SeparatorMenuItem>() {

    override fun manager() = KtfxMenu("", null)
    override fun childCount() = manager.childCount
    override fun child1() = separatorMenuItem { }
    override fun MenuItemManager.child2() = separatorMenuItem()
    override fun MenuItemManager.child3() = separatorMenuItem { }
}