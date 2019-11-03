@file:JvmMultifileClass
@file:JvmName("JfoenixLayoutsKt")
@file:Suppress("PackageDirectoryMismatch", "SpellCheckingInspection")

package ktfx.thirdparty.jfoenix.layouts

import com.jfoenix.controls.JFXToggleNode
import javafx.scene.Node
import ktfx.layouts.LayoutDslMarker
import ktfx.layouts.NodeManager
import ktfx.layouts.addNode

/** Create a [JFXToggleNode] with initialization block. */
inline fun jfxToggleNode(
    graphic: Node? = null,
    init: (@LayoutDslMarker JFXToggleNode).() -> Unit
): JFXToggleNode = JFXToggleNode(graphic).apply(init)

/** Add a [JFXToggleNode] to this manager. */
fun NodeManager.jfxToggleNode(
    graphic: Node? = null
): JFXToggleNode = addNode(JFXToggleNode(graphic))

/** Add a [JFXToggleNode] with initialization block to this manager. */
inline fun NodeManager.jfxToggleNode(
    graphic: Node? = null,
    init: (@LayoutDslMarker JFXToggleNode).() -> Unit
): JFXToggleNode = addNode(JFXToggleNode(graphic), init)
