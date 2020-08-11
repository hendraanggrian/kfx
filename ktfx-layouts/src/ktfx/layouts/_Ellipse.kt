@file:JvmMultifileClass
@file:JvmName("LayoutsKt")
@file:OptIn(ExperimentalContracts::class)

package ktfx.layouts

import javafx.scene.shape.Ellipse
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
 * Add an [Ellipse] to this manager.
 *
 * @return the control added.
 */
fun NodeManager.ellipse(
  centerX: Double = 0.0,
  centerY: Double = 0.0,
  radiusX: Double = 0.0,
  radiusY: Double = 0.0
): Ellipse = ellipse(centerX = centerX, centerY = centerY, radiusX = radiusX, radiusY = radiusY) { }

/**
 * Create an [Ellipse] with configuration block.
 * @param configuration the configuration block.
 *
 * @return the control created.
 */
inline fun ellipse(
  centerX: Double = 0.0,
  centerY: Double = 0.0,
  radiusX: Double = 0.0,
  radiusY: Double = 0.0,
  configuration: (@LayoutDslMarker Ellipse).() -> Unit
): Ellipse {
  contract { callsInPlace(configuration, EXACTLY_ONCE) }
  return newChild(Ellipse(centerX, centerY, radiusX, radiusY), configuration = configuration)
}

/**
 * Add an [Ellipse] with configuration block to this manager.
 * @param configuration the configuration block.
 *
 * @return the control added.
 */
inline fun NodeManager.ellipse(
  centerX: Double = 0.0,
  centerY: Double = 0.0,
  radiusX: Double = 0.0,
  radiusY: Double = 0.0,
  configuration: (@LayoutDslMarker Ellipse).() -> Unit
): Ellipse {
  contract { callsInPlace(configuration, EXACTLY_ONCE) }
  return addChild(newChild(Ellipse(centerX, centerY, radiusX, radiusY), configuration =
      configuration))
}

/**
 * Create a styled [Ellipse].
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 *
 * @return the styled control created.
 */
fun styledEllipse(
  centerX: Double = 0.0,
  centerY: Double = 0.0,
  radiusX: Double = 0.0,
  radiusY: Double = 0.0,
  vararg styleClass: String,
  id: String? = null
): Ellipse = styledEllipse(centerX = centerX, centerY = centerY, radiusX = radiusX, radiusY =
    radiusY, styleClass = *styleClass, id = id) { }

/**
 * Add a styled [Ellipse] to this manager.
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 *
 * @return the styled control added.
 */
fun NodeManager.styledEllipse(
  centerX: Double = 0.0,
  centerY: Double = 0.0,
  radiusX: Double = 0.0,
  radiusY: Double = 0.0,
  vararg styleClass: String,
  id: String? = null
): Ellipse = styledEllipse(centerX = centerX, centerY = centerY, radiusX = radiusX, radiusY =
    radiusY, styleClass = *styleClass, id = id) { }

/**
 * Create a styled [Ellipse] with configuration block.
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @param configuration the configuration block.
 *
 * @return the styled control created.
 */
inline fun styledEllipse(
  centerX: Double = 0.0,
  centerY: Double = 0.0,
  radiusX: Double = 0.0,
  radiusY: Double = 0.0,
  vararg styleClass: String,
  id: String? = null,
  configuration: (@LayoutDslMarker Ellipse).() -> Unit
): Ellipse {
  contract { callsInPlace(configuration, EXACTLY_ONCE) }
  return newChild(Ellipse(centerX, centerY, radiusX, radiusY), styleClass = *styleClass, id = id,
      configuration = configuration)
}

/**
 * Add a styled [Ellipse] with configuration block to this manager.
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @param configuration the configuration block.
 *
 * @return the styled control added.
 */
inline fun NodeManager.styledEllipse(
  centerX: Double = 0.0,
  centerY: Double = 0.0,
  radiusX: Double = 0.0,
  radiusY: Double = 0.0,
  vararg styleClass: String,
  id: String? = null,
  configuration: (@LayoutDslMarker Ellipse).() -> Unit
): Ellipse {
  contract { callsInPlace(configuration, EXACTLY_ONCE) }
  return addChild(newChild(Ellipse(centerX, centerY, radiusX, radiusY), styleClass = *styleClass, id
      = id, configuration = configuration))
}
