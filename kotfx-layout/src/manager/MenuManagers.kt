package kotfx.layout

import javafx.collections.ObservableList
import javafx.scene.control.Menu
import javafx.scene.control.MenuBar

interface MenuManager {

    fun getMenus(): ObservableList<Menu>

    fun <T : Menu> T.add(): T = apply { getMenus().add(this) }
}

class _MenuBar(vararg menus: Menu) : MenuBar(*menus), MenuManager