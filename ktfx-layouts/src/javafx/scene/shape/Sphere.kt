@file:JvmMultifileClass
@file:JvmName("LayoutsKt")
@file:UseExperimental(ExperimentalContracts::class)

package ktfx.layouts

import javafx.scene.shape.Sphere
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

/** Create a [Sphere] with configurationialization block. */
inline fun sphere(
    radius: Double = 1.0,
    division: Int = 64,
    configuration: (@LayoutDslMarker Sphere).() -> Unit
): Sphere {
    contract { callsInPlace(configuration, InvocationKind.EXACTLY_ONCE) }
    return Sphere(radius, division).apply(configuration)
}

/** Add a [Sphere] to this manager. */
fun NodeManager.sphere(
    radius: Double = 1.0,
    division: Int = 64
): Sphere = addChild(Sphere(radius, division))

/** Add a [Sphere] with configurationialization block to this manager. */
inline fun NodeManager.sphere(
    radius: Double = 1.0,
    division: Int = 64,
    configuration: (@LayoutDslMarker Sphere).() -> Unit
): Sphere {
    contract { callsInPlace(configuration, InvocationKind.EXACTLY_ONCE) }
    return addChild(Sphere(radius, division), configuration)
}
