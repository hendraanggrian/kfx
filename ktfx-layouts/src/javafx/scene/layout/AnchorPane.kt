@file:JvmMultifileClass
@file:JvmName("LayoutsKt")
@file:UseExperimental(ExperimentalContracts::class)

package ktfx.layouts

import javafx.scene.Node
import javafx.scene.layout.AnchorPane
import kotlin.DeprecationLevel.ERROR
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract
import ktfx.internal.KtfxInternals

/**
 * [AnchorPane] with dynamic-layout dsl support.
 * Invoking dsl will add its children.
 */
open class KtfxAnchorPane : AnchorPane(), NodeManager, Constraintable {

    final override fun <T : Node> addNode(node: T): T =
        node.also { children += it }

    final override fun Constraints.clear(): Unit =
        clearConstraints(node)

    var Constraints.anchorAll: Double?
        @Deprecated(KtfxInternals.NO_GETTER, level = ERROR) get() = KtfxInternals.noGetter()
        set(value) {
            anchorTop = value
            anchorLeft = value
            anchorBottom = value
            anchorRight = value
        }

    infix fun Constraints.anchorAll(anchor: Double): Constraints =
        apply { anchorAll = anchor }

    var Constraints.anchorTop: Double?
        get() = getTopAnchor(node)
        set(value) = setTopAnchor(node, value)

    infix fun Constraints.anchorTop(anchor: Double): Constraints =
        apply { anchorTop = anchor }

    var Constraints.anchorLeft: Double?
        get() = getLeftAnchor(node)
        set(value) = setLeftAnchor(node, value)

    infix fun Constraints.anchorLeft(anchor: Double): Constraints =
        apply { anchorLeft = anchor }

    var Constraints.anchorBottom: Double?
        get() = getBottomAnchor(node)
        set(value) = setBottomAnchor(node, value)

    infix fun Constraints.anchorBottom(anchor: Double): Constraints =
        apply { anchorBottom = anchor }

    var Constraints.anchorRight: Double?
        get() = getRightAnchor(node)
        set(value) = setRightAnchor(node, value)

    infix fun Constraints.anchorRight(anchor: Double): Constraints =
        apply { anchorRight = anchor }
}

/** Create an [AnchorPane] with initialization block. */
inline fun anchorPane(
    init: KtfxAnchorPane.() -> Unit
): AnchorPane {
    contract { callsInPlace(init, InvocationKind.EXACTLY_ONCE) }
    return KtfxAnchorPane().apply(init)
}

/** Add an [AnchorPane] to this manager. */
fun NodeManager.anchorPane(): AnchorPane =
    addNode(KtfxAnchorPane())

/** Add an [AnchorPane] with initialization block to this manager. */
inline fun NodeManager.anchorPane(
    init: KtfxAnchorPane.() -> Unit
): AnchorPane {
    contract { callsInPlace(init, InvocationKind.EXACTLY_ONCE) }
    return addNode(KtfxAnchorPane(), init)
}
