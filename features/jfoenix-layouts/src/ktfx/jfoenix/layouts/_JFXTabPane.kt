@file:JvmMultifileClass
@file:JvmName("JfoenixLayoutsKt")
@file:OptIn(ExperimentalContracts::class)

package ktfx.jfoenix.layouts

import com.jfoenix.controls.JFXTabPane
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
 * Add a [JFXTabPane] to this manager.
 *
 * @return the control added.
 */
fun NodeManager.jfxTabPane(): JFXTabPane = jfxTabPane() { }

/**
 * Create a [JFXTabPane] with configuration block.
 *
 * @param configuration the configuration block.
 * @return the control created.
 */
inline fun jfxTabPane(configuration: (@LayoutDslMarker KtfxJFXTabPane).() -> Unit): JFXTabPane {
  contract { callsInPlace(configuration, EXACTLY_ONCE) }
  return newChild(KtfxJFXTabPane(), configuration = configuration)
}

/**
 * Add a [JFXTabPane] with configuration block to this manager.
 *
 * @param configuration the configuration block.
 * @return the control added.
 */
inline fun NodeManager.jfxTabPane(configuration: (@LayoutDslMarker KtfxJFXTabPane).() -> Unit):
    JFXTabPane {
  contract { callsInPlace(configuration, EXACTLY_ONCE) }
  return addChild(newChild(KtfxJFXTabPane(), configuration = configuration))
}

/**
 * Create a styled [JFXTabPane].
 *
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @return the styled control created.
 */
fun styledJFXTabPane(vararg styleClass: String, id: String? = null): JFXTabPane =
    styledJFXTabPane(styleClass = *styleClass, id = id) { }

/**
 * Add a styled [JFXTabPane] to this manager.
 *
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @return the styled control added.
 */
fun NodeManager.styledJFXTabPane(vararg styleClass: String, id: String? = null): JFXTabPane =
    styledJFXTabPane(styleClass = *styleClass, id = id) { }

/**
 * Create a styled [JFXTabPane] with configuration block.
 *
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @param configuration the configuration block.
 * @return the styled control created.
 */
inline fun styledJFXTabPane(
  vararg styleClass: String,
  id: String? = null,
  configuration: (@LayoutDslMarker KtfxJFXTabPane).() -> Unit
): JFXTabPane {
  contract { callsInPlace(configuration, EXACTLY_ONCE) }
  return newChild(KtfxJFXTabPane(), styleClass = *styleClass, id = id, configuration =
      configuration)
}

/**
 * Add a styled [JFXTabPane] with configuration block to this manager.
 *
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @param configuration the configuration block.
 * @return the styled control added.
 */
inline fun NodeManager.styledJFXTabPane(
  vararg styleClass: String,
  id: String? = null,
  configuration: (@LayoutDslMarker KtfxJFXTabPane).() -> Unit
): JFXTabPane {
  contract { callsInPlace(configuration, EXACTLY_ONCE) }
  return addChild(newChild(KtfxJFXTabPane(), styleClass = *styleClass, id = id, configuration =
      configuration))
}
