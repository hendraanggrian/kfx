@file:JvmMultifileClass
@file:JvmName("LayoutsKt")
@file:UseExperimental(ExperimentalContracts::class)

package ktfx.layouts

import javafx.scene.Node
import javafx.scene.text.Text
import javafx.scene.text.TextFlow
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

/**
 * [TextFlow] with dynamic-layout dsl support.
 * Invoking dsl will add its children.
 */
open class KtfxTextFlow : TextFlow(), NodeManager {

    final override fun <C : Node> addChild(child: C): C = child.also { children += it }

    final override val childCount: Int get() = childrenUnmodifiable.size

    /** Call [NodeManager.text] by string invocation. */
    inline operator fun String.invoke(
        init: (@LayoutsDslMarker Text).() -> Unit
    ): Text = text(this, init)
}

/** Create a [TextFlow] with initialization block. */
inline fun textFlow(
    init: (@LayoutsDslMarker KtfxTextFlow).() -> Unit
): TextFlow {
    contract { callsInPlace(init, InvocationKind.EXACTLY_ONCE) }
    return KtfxTextFlow().apply(init)
}

/** Add a [TextFlow] to this manager. */
fun NodeManager.textFlow(): TextFlow = addChild(KtfxTextFlow())

/** Add a [TextFlow] with initialization block to this manager. */
inline fun NodeManager.textFlow(
    init: (@LayoutsDslMarker KtfxTextFlow).() -> Unit
): TextFlow {
    contract { callsInPlace(init, InvocationKind.EXACTLY_ONCE) }
    return addChild(KtfxTextFlow(), init)
}