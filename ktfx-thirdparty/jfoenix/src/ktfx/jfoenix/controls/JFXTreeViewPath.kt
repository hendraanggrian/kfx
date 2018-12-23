@file:Suppress("PackageDirectoryMismatch", "NOTHING_TO_INLINE")

package ktfx.jfoenix

import com.jfoenix.controls.JFXTreeViewPath
import javafx.scene.control.TreeView
import ktfx.layouts.NodeInvokable
import ktfx.layouts.LayoutDsl

/** Creates a [JFXTreeViewPath]. */
fun jfxTreeViewPath(
    treeView: TreeView<*>? = null,
    init: ((@LayoutDsl JFXTreeViewPath).() -> Unit)? = null
): JFXTreeViewPath = JFXTreeViewPath(treeView).also { init?.invoke(it) }

/** Creates a [JFXTreeViewPath] and add it to this manager. */
inline fun NodeInvokable.jfxTreeViewPath(
    treeView: TreeView<*>? = null,
    noinline init: ((@LayoutDsl JFXTreeViewPath).() -> Unit)? = null
): JFXTreeViewPath = ktfx.jfoenix.jfxTreeViewPath(treeView, init)()