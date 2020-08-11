@file:JvmMultifileClass
@file:JvmName("JfoenixLayoutsKt")
@file:OptIn(ExperimentalContracts::class)

package ktfx.jfoenix.layouts

import com.jfoenix.controls.JFXColorPicker
import javafx.scene.paint.Color
import javafx.scene.paint.Color.WHITE
import kotlin.String
import kotlin.Unit
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind.EXACTLY_ONCE
import kotlin.contracts.contract
import kotlin.jvm.JvmMultifileClass
import kotlin.jvm.JvmName
import ktfx.internal.KtfxInternals.newChild
import ktfx.layouts.LayoutDslMarker
import ktfx.layouts.NodeManager

/**
 * Add a [JFXColorPicker] to this manager.
 *
 * @return the control added.
 */
fun NodeManager.jfxColorPicker(color: Color = WHITE): JFXColorPicker = jfxColorPicker(color = color)
    { }

/**
 * Create a [JFXColorPicker] with configuration block.
 * @param configuration the configuration block.
 *
 * @return the control created.
 */
inline fun jfxColorPicker(color: Color = WHITE, configuration: (@LayoutDslMarker
    JFXColorPicker).() -> Unit): JFXColorPicker {
  contract { callsInPlace(configuration, EXACTLY_ONCE) }
  return newChild(JFXColorPicker(color), configuration = configuration)
}

/**
 * Add a [JFXColorPicker] with configuration block to this manager.
 * @param configuration the configuration block.
 *
 * @return the control added.
 */
inline fun NodeManager.jfxColorPicker(color: Color = WHITE, configuration: (@LayoutDslMarker
    JFXColorPicker).() -> Unit): JFXColorPicker {
  contract { callsInPlace(configuration, EXACTLY_ONCE) }
  return addChild(newChild(JFXColorPicker(color), configuration = configuration))
}

/**
 * Create a styled [JFXColorPicker].
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 *
 * @return the styled control created.
 */
fun styledJFXColorPicker(
  color: Color = WHITE,
  vararg styleClass: String,
  id: String? = null
): JFXColorPicker = styledJFXColorPicker(color = color, styleClass = *styleClass, id = id) { }

/**
 * Add a styled [JFXColorPicker] to this manager.
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 *
 * @return the styled control added.
 */
fun NodeManager.styledJFXColorPicker(
  color: Color = WHITE,
  vararg styleClass: String,
  id: String? = null
): JFXColorPicker = styledJFXColorPicker(color = color, styleClass = *styleClass, id = id) { }

/**
 * Create a styled [JFXColorPicker] with configuration block.
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @param configuration the configuration block.
 *
 * @return the styled control created.
 */
inline fun styledJFXColorPicker(
  color: Color = WHITE,
  vararg styleClass: String,
  id: String? = null,
  configuration: (@LayoutDslMarker JFXColorPicker).() -> Unit
): JFXColorPicker {
  contract { callsInPlace(configuration, EXACTLY_ONCE) }
  return newChild(JFXColorPicker(color), styleClass = *styleClass, id = id, configuration =
      configuration)
}

/**
 * Add a styled [JFXColorPicker] with configuration block to this manager.
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @param configuration the configuration block.
 *
 * @return the styled control added.
 */
inline fun NodeManager.styledJFXColorPicker(
  color: Color = WHITE,
  vararg styleClass: String,
  id: String? = null,
  configuration: (@LayoutDslMarker JFXColorPicker).() -> Unit
): JFXColorPicker {
  contract { callsInPlace(configuration, EXACTLY_ONCE) }
  return addChild(newChild(JFXColorPicker(color), styleClass = *styleClass, id = id, configuration =
      configuration))
}
