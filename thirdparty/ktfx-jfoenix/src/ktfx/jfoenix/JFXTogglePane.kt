@file:Suppress("NOTHING_TO_INLINE")

package ktfx.jfoenix

import com.jfoenix.controls.JFXTogglePane
import javafx.scene.Node
import ktfx.layouts.LayoutDsl
import ktfx.layouts.LayoutManager

/** Creates a [JFXTogglePane]. */
fun jfxTogglePane(
    init: ((@LayoutDsl JFXTogglePane).() -> Unit)? = null
): JFXTogglePane = JFXTogglePane().also {
    init?.invoke(it)
}

/** Creates a [JFXTogglePane] and add it to this [LayoutManager]. */
inline fun LayoutManager<Node>.jfxTogglePane(
    noinline init: ((@LayoutDsl JFXTogglePane).() -> Unit)? = null
): JFXTogglePane = ktfx.jfoenix.jfxTogglePane(init)()