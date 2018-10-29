@file:Suppress("PackageDirectoryMismatch", "NOTHING_TO_INLINE", "ClassName")

package ktfx.layouts

import javafx.scene.Node
import javafx.scene.control.ScrollPane
import ktfx.NodeManager
import ktfx.annotations.LayoutDsl

open class _ScrollPane(content: Node?) : ScrollPane(content), NodeManager by NodeManager.invokableOnly() {

    override operator fun <T : Node> T.invoke(): T = also { content = it }
}

/** Creates a [ScrollPane]. */
fun scrollPane(
    content: Node? = null,
    init: ((@LayoutDsl _ScrollPane).() -> Unit)? = null
): ScrollPane = _ScrollPane(content).also { init?.invoke(it) }

/** Creates a [ScrollPane] and add it to this manager. */
inline fun NodeManager.scrollPane(
    content: Node? = null,
    noinline init: ((@LayoutDsl _ScrollPane).() -> Unit)? = null
): ScrollPane = ktfx.layouts.scrollPane(content, init)()