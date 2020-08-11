@file:JvmMultifileClass
@file:JvmName("ControlsFxLayoutsKt")
@file:OptIn(ExperimentalContracts::class)

package ktfx.controlsfx.layouts

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
import org.controlsfx.control.MaskerPane

/**
 * Add a [MaskerPane] to this manager.
 *
 * @return the control added.
 */
fun NodeManager.maskerPane(): MaskerPane = maskerPane() { }

/**
 * Create a [MaskerPane] with configuration block.
 *
 * @param configuration the configuration block.
 * @return the control created.
 */
inline fun maskerPane(configuration: (@LayoutDslMarker MaskerPane).() -> Unit): MaskerPane {
  contract { callsInPlace(configuration, EXACTLY_ONCE) }
  return newChild(MaskerPane(), configuration = configuration)
}

/**
 * Add a [MaskerPane] with configuration block to this manager.
 *
 * @param configuration the configuration block.
 * @return the control added.
 */
inline fun NodeManager.maskerPane(configuration: (@LayoutDslMarker MaskerPane).() -> Unit):
    MaskerPane {
  contract { callsInPlace(configuration, EXACTLY_ONCE) }
  return addChild(newChild(MaskerPane(), configuration = configuration))
}

/**
 * Create a styled [MaskerPane].
 *
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @return the styled control created.
 */
fun styledMaskerPane(vararg styleClass: String, id: String? = null): MaskerPane =
    styledMaskerPane(styleClass = *styleClass, id = id) { }

/**
 * Add a styled [MaskerPane] to this manager.
 *
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @return the styled control added.
 */
fun NodeManager.styledMaskerPane(vararg styleClass: String, id: String? = null): MaskerPane =
    styledMaskerPane(styleClass = *styleClass, id = id) { }

/**
 * Create a styled [MaskerPane] with configuration block.
 *
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @param configuration the configuration block.
 * @return the styled control created.
 */
inline fun styledMaskerPane(
  vararg styleClass: String,
  id: String? = null,
  configuration: (@LayoutDslMarker MaskerPane).() -> Unit
): MaskerPane {
  contract { callsInPlace(configuration, EXACTLY_ONCE) }
  return newChild(MaskerPane(), styleClass = *styleClass, id = id, configuration = configuration)
}

/**
 * Add a styled [MaskerPane] with configuration block to this manager.
 *
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @param configuration the configuration block.
 * @return the styled control added.
 */
inline fun NodeManager.styledMaskerPane(
  vararg styleClass: String,
  id: String? = null,
  configuration: (@LayoutDslMarker MaskerPane).() -> Unit
): MaskerPane {
  contract { callsInPlace(configuration, EXACTLY_ONCE) }
  return addChild(newChild(MaskerPane(), styleClass = *styleClass, id = id, configuration =
      configuration))
}
