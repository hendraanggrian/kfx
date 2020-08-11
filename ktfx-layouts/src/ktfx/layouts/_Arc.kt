@file:JvmMultifileClass
@file:JvmName("LayoutsKt")
@file:OptIn(ExperimentalContracts::class)

package ktfx.layouts

import javafx.scene.shape.Arc
import kotlin.Double
import kotlin.String
import kotlin.Unit
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind.EXACTLY_ONCE
import kotlin.contracts.contract
import kotlin.jvm.JvmMultifileClass
import kotlin.jvm.JvmName
import ktfx.internal.KtfxInternals.newChild

/**
 * Add an [Arc] to this manager.
 *
 * @return the control added.
 */
fun NodeManager.arc(
  centerX: Double = 0.0,
  centerY: Double = 0.0,
  radiusX: Double = 0.0,
  radiusY: Double = 0.0,
  startAngle: Double = 0.0,
  length: Double = 0.0
): Arc = arc(centerX = centerX, centerY = centerY, radiusX = radiusX, radiusY = radiusY, startAngle
    = startAngle, length = length) { }

/**
 * Create an [Arc] with configuration block.
 * @param configuration the configuration block.
 *
 * @return the control created.
 */
inline fun arc(
  centerX: Double = 0.0,
  centerY: Double = 0.0,
  radiusX: Double = 0.0,
  radiusY: Double = 0.0,
  startAngle: Double = 0.0,
  length: Double = 0.0,
  configuration: (@LayoutDslMarker Arc).() -> Unit
): Arc {
  contract { callsInPlace(configuration, EXACTLY_ONCE) }
  return newChild(Arc(centerX, centerY, radiusX, radiusY, startAngle, length), configuration =
      configuration)
}

/**
 * Add an [Arc] with configuration block to this manager.
 * @param configuration the configuration block.
 *
 * @return the control added.
 */
inline fun NodeManager.arc(
  centerX: Double = 0.0,
  centerY: Double = 0.0,
  radiusX: Double = 0.0,
  radiusY: Double = 0.0,
  startAngle: Double = 0.0,
  length: Double = 0.0,
  configuration: (@LayoutDslMarker Arc).() -> Unit
): Arc {
  contract { callsInPlace(configuration, EXACTLY_ONCE) }
  return addChild(newChild(Arc(centerX, centerY, radiusX, radiusY, startAngle, length),
      configuration = configuration))
}

/**
 * Create a styled [Arc].
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 *
 * @return the styled control created.
 */
fun styledArc(
  centerX: Double = 0.0,
  centerY: Double = 0.0,
  radiusX: Double = 0.0,
  radiusY: Double = 0.0,
  startAngle: Double = 0.0,
  length: Double = 0.0,
  vararg styleClass: String,
  id: String? = null
): Arc = styledArc(centerX = centerX, centerY = centerY, radiusX = radiusX, radiusY = radiusY,
    startAngle = startAngle, length = length, styleClass = *styleClass, id = id) { }

/**
 * Add a styled [Arc] to this manager.
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 *
 * @return the styled control added.
 */
fun NodeManager.styledArc(
  centerX: Double = 0.0,
  centerY: Double = 0.0,
  radiusX: Double = 0.0,
  radiusY: Double = 0.0,
  startAngle: Double = 0.0,
  length: Double = 0.0,
  vararg styleClass: String,
  id: String? = null
): Arc = styledArc(centerX = centerX, centerY = centerY, radiusX = radiusX, radiusY = radiusY,
    startAngle = startAngle, length = length, styleClass = *styleClass, id = id) { }

/**
 * Create a styled [Arc] with configuration block.
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @param configuration the configuration block.
 *
 * @return the styled control created.
 */
inline fun styledArc(
  centerX: Double = 0.0,
  centerY: Double = 0.0,
  radiusX: Double = 0.0,
  radiusY: Double = 0.0,
  startAngle: Double = 0.0,
  length: Double = 0.0,
  vararg styleClass: String,
  id: String? = null,
  configuration: (@LayoutDslMarker Arc).() -> Unit
): Arc {
  contract { callsInPlace(configuration, EXACTLY_ONCE) }
  return newChild(Arc(centerX, centerY, radiusX, radiusY, startAngle, length), styleClass =
      *styleClass, id = id, configuration = configuration)
}

/**
 * Add a styled [Arc] with configuration block to this manager.
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @param configuration the configuration block.
 *
 * @return the styled control added.
 */
inline fun NodeManager.styledArc(
  centerX: Double = 0.0,
  centerY: Double = 0.0,
  radiusX: Double = 0.0,
  radiusY: Double = 0.0,
  startAngle: Double = 0.0,
  length: Double = 0.0,
  vararg styleClass: String,
  id: String? = null,
  configuration: (@LayoutDslMarker Arc).() -> Unit
): Arc {
  contract { callsInPlace(configuration, EXACTLY_ONCE) }
  return addChild(newChild(Arc(centerX, centerY, radiusX, radiusY, startAngle, length), styleClass =
      *styleClass, id = id, configuration = configuration))
}
