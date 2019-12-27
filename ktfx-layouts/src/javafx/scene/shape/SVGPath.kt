@file:JvmMultifileClass
@file:JvmName("LayoutsKt")
@file:UseExperimental(ExperimentalContracts::class)

package ktfx.layouts

import javafx.scene.shape.SVGPath
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

/** Create a [SVGPath] with initialization block. */
inline fun svgPath(
    configuration: (@LayoutsDslMarker SVGPath).() -> Unit
): SVGPath {
    contract { callsInPlace(configuration, InvocationKind.EXACTLY_ONCE) }
    return SVGPath().apply(configuration)
}

/** Add a [SVGPath] to this manager. */
fun NodeManager.svgPath(): SVGPath = addChild(SVGPath())

/** Add a [SVGPath] with initialization block to this manager. */
inline fun NodeManager.svgPath(
    configuration: (@LayoutsDslMarker SVGPath).() -> Unit
): SVGPath {
    contract { callsInPlace(configuration, InvocationKind.EXACTLY_ONCE) }
    return addChild(SVGPath(), configuration)
}
