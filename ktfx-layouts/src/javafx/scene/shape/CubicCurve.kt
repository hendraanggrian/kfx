@file:JvmMultifileClass
@file:JvmName("LayoutsKt")
@file:UseExperimental(ExperimentalContracts::class)

package ktfx.layouts

import javafx.scene.shape.CubicCurve
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

/** Create a [CubicCurve] with configurationialization block. */
inline fun cubicCurve(
    startX: Double = 0.0,
    startY: Double = 0.0,
    controlX1: Double = 0.0,
    controlY1: Double = 0.0,
    controlX2: Double = 0.0,
    controlY2: Double = 0.0,
    endX: Double = 0.0,
    endY: Double = 0.0,
    configuration: (@LayoutDslMarker CubicCurve).() -> Unit
): CubicCurve {
    contract { callsInPlace(configuration, InvocationKind.EXACTLY_ONCE) }
    return CubicCurve(startX, startY, controlX1, controlY1, controlX2, controlY2, endX, endY).apply(configuration)
}

/** Add a [CubicCurve] to this manager. */
fun NodeManager.cubicCurve(
    startX: Double = 0.0,
    startY: Double = 0.0,
    controlX1: Double = 0.0,
    controlY1: Double = 0.0,
    controlX2: Double = 0.0,
    controlY2: Double = 0.0,
    endX: Double = 0.0,
    endY: Double = 0.0
): CubicCurve = addChild(CubicCurve(startX, startY, controlX1, controlY1, controlX2, controlY2, endX, endY))

/** Add a [CubicCurve] with configurationialization block to this manager. */
inline fun NodeManager.cubicCurve(
    startX: Double = 0.0,
    startY: Double = 0.0,
    controlX1: Double = 0.0,
    controlY1: Double = 0.0,
    controlX2: Double = 0.0,
    controlY2: Double = 0.0,
    endX: Double = 0.0,
    endY: Double = 0.0,
    configuration: (@LayoutDslMarker CubicCurve).() -> Unit
): CubicCurve {
    contract { callsInPlace(configuration, InvocationKind.EXACTLY_ONCE) }
    return addChild(CubicCurve(startX, startY, controlX1, controlY1, controlX2, controlY2, endX, endY), configuration)
}
