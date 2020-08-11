@file:JvmMultifileClass
@file:JvmName("JfoenixLayoutsKt")
@file:OptIn(ExperimentalContracts::class)

package ktfx.jfoenix.layouts

import com.jfoenix.controls.JFXNodesList
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
 * Add a [JFXNodesList] to this manager.
 *
 * @return the control added.
 */
fun NodeManager.jfxNodesList(): JFXNodesList = jfxNodesList() { }

/**
 * Create a [JFXNodesList] with configuration block.
 *
 * @param configuration the configuration block.
 * @return the control created.
 */
inline fun jfxNodesList(configuration: (@LayoutDslMarker KtfxJFXNodesList).() -> Unit):
    JFXNodesList {
  contract { callsInPlace(configuration, EXACTLY_ONCE) }
  return newChild(KtfxJFXNodesList(), configuration = configuration)
}

/**
 * Add a [JFXNodesList] with configuration block to this manager.
 *
 * @param configuration the configuration block.
 * @return the control added.
 */
inline fun NodeManager.jfxNodesList(configuration: (@LayoutDslMarker KtfxJFXNodesList).() -> Unit):
    JFXNodesList {
  contract { callsInPlace(configuration, EXACTLY_ONCE) }
  return addChild(newChild(KtfxJFXNodesList(), configuration = configuration))
}

/**
 * Create a styled [JFXNodesList].
 *
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @return the styled control created.
 */
fun styledJFXNodesList(vararg styleClass: String, id: String? = null): JFXNodesList =
    styledJFXNodesList(styleClass = *styleClass, id = id) { }

/**
 * Add a styled [JFXNodesList] to this manager.
 *
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @return the styled control added.
 */
fun NodeManager.styledJFXNodesList(vararg styleClass: String, id: String? = null): JFXNodesList =
    styledJFXNodesList(styleClass = *styleClass, id = id) { }

/**
 * Create a styled [JFXNodesList] with configuration block.
 *
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @param configuration the configuration block.
 * @return the styled control created.
 */
inline fun styledJFXNodesList(
  vararg styleClass: String,
  id: String? = null,
  configuration: (@LayoutDslMarker KtfxJFXNodesList).() -> Unit
): JFXNodesList {
  contract { callsInPlace(configuration, EXACTLY_ONCE) }
  return newChild(KtfxJFXNodesList(), styleClass = *styleClass, id = id, configuration =
      configuration)
}

/**
 * Add a styled [JFXNodesList] with configuration block to this manager.
 *
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @param configuration the configuration block.
 * @return the styled control added.
 */
inline fun NodeManager.styledJFXNodesList(
  vararg styleClass: String,
  id: String? = null,
  configuration: (@LayoutDslMarker KtfxJFXNodesList).() -> Unit
): JFXNodesList {
  contract { callsInPlace(configuration, EXACTLY_ONCE) }
  return addChild(newChild(KtfxJFXNodesList(), styleClass = *styleClass, id = id, configuration =
      configuration))
}
