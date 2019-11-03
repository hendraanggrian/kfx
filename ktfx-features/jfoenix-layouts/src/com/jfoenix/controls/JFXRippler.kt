@file:JvmMultifileClass
@file:JvmName("JfoenixLayoutsKt")

package ktfx.jfoenix.layouts

import com.jfoenix.controls.JFXRippler
import javafx.scene.Node
import ktfx.layouts.LayoutDslMarker
import ktfx.layouts.NodeManager
import ktfx.layouts.addNode

// TODO: should include mask & pos in constructor?
open class KtfxJFXRippler : JFXRippler(), NodeManager {

    final override fun <T : Node> addNode(node: T): T =
        node.also { control = it }
}

/** Create a [JFXRippler] with initialization block. */
inline fun jfxRippler(
    init: (@LayoutDslMarker KtfxJFXRippler).() -> Unit
): JFXRippler = KtfxJFXRippler().apply(init)

/** Add a [JFXRippler] to this manager. */
fun NodeManager.jfxRippler(): JFXRippler =
    addNode(KtfxJFXRippler())

/** Add a [JFXRippler] with initialization block to this manager. */
inline fun NodeManager.jfxRippler(
    init: (@LayoutDslMarker KtfxJFXRippler).() -> Unit
): JFXRippler = addNode(KtfxJFXRippler(), init)