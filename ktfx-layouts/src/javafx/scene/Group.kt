@file:JvmMultifileClass
@file:JvmName("LayoutsKt")
@file:UseExperimental(ExperimentalContracts::class)

package ktfx.layouts

import javafx.scene.Group
import javafx.scene.Node
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

open class KtfxGroup : Group(), NodeManager {

    final override fun <T : Node> addNode(node: T): T =
        node.also { children += it }
}

/** Create a [Group] with initialization block. */
inline fun group(
    init: (@LayoutDslMarker KtfxGroup).() -> Unit
): Group {
    contract {
        callsInPlace(init, InvocationKind.EXACTLY_ONCE)
    }
    return KtfxGroup().apply(init)
}
/** Add a [Group] to this manager. */
fun NodeManager.group(): Group =
    addNode(KtfxGroup())

/** Add a [Group] with initialization block to this manager. */
inline fun NodeManager.group(
    init: (@LayoutDslMarker KtfxGroup).() -> Unit
): Group {
    contract {
        callsInPlace(init, InvocationKind.EXACTLY_ONCE)
    }
    return addNode(KtfxGroup(), init)
}
