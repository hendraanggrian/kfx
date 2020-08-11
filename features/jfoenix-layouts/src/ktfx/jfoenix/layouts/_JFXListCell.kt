@file:JvmMultifileClass
@file:JvmName("JfoenixLayoutsKt")
@file:OptIn(ExperimentalContracts::class)

package ktfx.jfoenix.layouts

import com.jfoenix.controls.JFXListCell
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
 * Add a [JFXListCell] to this manager.
 *
 * @return the control added.
 */
fun <T> NodeManager.jfxListCell(): JFXListCell<T> = jfxListCell() { }

/**
 * Create a [JFXListCell] with configuration block.
 *
 * @param configuration the configuration block.
 * @return the control created.
 */
inline fun <T> jfxListCell(configuration: (@LayoutDslMarker JFXListCell<T>).() -> Unit):
    JFXListCell<T> {
  contract { callsInPlace(configuration, EXACTLY_ONCE) }
  return newChild(JFXListCell<T>(), configuration = configuration)
}

/**
 * Add a [JFXListCell] with configuration block to this manager.
 *
 * @param configuration the configuration block.
 * @return the control added.
 */
inline fun <T> NodeManager.jfxListCell(configuration: (@LayoutDslMarker JFXListCell<T>).() -> Unit):
    JFXListCell<T> {
  contract { callsInPlace(configuration, EXACTLY_ONCE) }
  return addChild(newChild(JFXListCell<T>(), configuration = configuration))
}

/**
 * Create a styled [JFXListCell].
 *
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @return the styled control created.
 */
fun <T> styledJFXListCell(vararg styleClass: String, id: String? = null): JFXListCell<T> =
    styledJFXListCell(styleClass = *styleClass, id = id) { }

/**
 * Add a styled [JFXListCell] to this manager.
 *
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @return the styled control added.
 */
fun <T> NodeManager.styledJFXListCell(vararg styleClass: String, id: String? = null): JFXListCell<T>
    = styledJFXListCell(styleClass = *styleClass, id = id) { }

/**
 * Create a styled [JFXListCell] with configuration block.
 *
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @param configuration the configuration block.
 * @return the styled control created.
 */
inline fun <T> styledJFXListCell(
  vararg styleClass: String,
  id: String? = null,
  configuration: (@LayoutDslMarker JFXListCell<T>).() -> Unit
): JFXListCell<T> {
  contract { callsInPlace(configuration, EXACTLY_ONCE) }
  return newChild(JFXListCell<T>(), styleClass = *styleClass, id = id, configuration =
      configuration)
}

/**
 * Add a styled [JFXListCell] with configuration block to this manager.
 *
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @param configuration the configuration block.
 * @return the styled control added.
 */
inline fun <T> NodeManager.styledJFXListCell(
  vararg styleClass: String,
  id: String? = null,
  configuration: (@LayoutDslMarker JFXListCell<T>).() -> Unit
): JFXListCell<T> {
  contract { callsInPlace(configuration, EXACTLY_ONCE) }
  return addChild(newChild(JFXListCell<T>(), styleClass = *styleClass, id = id, configuration =
      configuration))
}
