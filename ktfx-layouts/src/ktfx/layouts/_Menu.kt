@file:JvmMultifileClass
@file:JvmName("LayoutsKt")
@file:OptIn(ExperimentalContracts::class)

package ktfx.layouts

import javafx.scene.Node
import javafx.scene.control.Menu
import kotlin.String
import kotlin.Unit
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind.EXACTLY_ONCE
import kotlin.contracts.contract
import kotlin.jvm.JvmMultifileClass
import kotlin.jvm.JvmName
import ktfx.internal.KtfxInternals.newChild

/**
 * Add a [Menu] to this manager.
 *
 * @return the control added.
 */
fun MenuItemManager.menu(text: String = "", graphic: Node? = null): Menu = menu(text = text, graphic
    = graphic) { }

/**
 * Add a [Menu] to this manager.
 *
 * @return the control added.
 */
fun MenuManager.menu(text: String = "", graphic: Node? = null): Menu = menu(text = text, graphic =
    graphic) { }

/**
 * Create a [Menu] with configuration block.
 * @param configuration the configuration block.
 *
 * @return the control created.
 */
inline fun menu(
  text: String = "",
  graphic: Node? = null,
  configuration: (@LayoutDslMarker KtfxMenu).() -> Unit
): Menu {
  contract { callsInPlace(configuration, EXACTLY_ONCE) }
  return newChild(KtfxMenu(text, graphic), configuration = configuration)
}

/**
 * Add a [Menu] with configuration block to this manager.
 * @param configuration the configuration block.
 *
 * @return the control added.
 */
inline fun MenuItemManager.menu(
  text: String = "",
  graphic: Node? = null,
  configuration: (@LayoutDslMarker KtfxMenu).() -> Unit
): Menu {
  contract { callsInPlace(configuration, EXACTLY_ONCE) }
  return addChild(newChild(KtfxMenu(text, graphic), configuration = configuration))
}

/**
 * Add a [Menu] with configuration block to this manager.
 * @param configuration the configuration block.
 *
 * @return the control added.
 */
inline fun MenuManager.menu(
  text: String = "",
  graphic: Node? = null,
  configuration: (@LayoutDslMarker KtfxMenu).() -> Unit
): Menu {
  contract { callsInPlace(configuration, EXACTLY_ONCE) }
  return addChild(newChild(KtfxMenu(text, graphic), configuration = configuration))
}

/**
 * Create a styled [Menu].
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 *
 * @return the styled control created.
 */
fun styledMenu(
  text: String = "",
  graphic: Node? = null,
  vararg styleClass: String,
  id: String? = null
): Menu = styledMenu(text = text, graphic = graphic, styleClass = *styleClass, id = id) { }

/**
 * Add a styled [Menu] to this manager.
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 *
 * @return the styled control added.
 */
fun MenuItemManager.styledMenu(
  text: String = "",
  graphic: Node? = null,
  vararg styleClass: String,
  id: String? = null
): Menu = styledMenu(text = text, graphic = graphic, styleClass = *styleClass, id = id) { }

/**
 * Add a styled [Menu] to this manager.
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 *
 * @return the styled control added.
 */
fun MenuManager.styledMenu(
  text: String = "",
  graphic: Node? = null,
  vararg styleClass: String,
  id: String? = null
): Menu = styledMenu(text = text, graphic = graphic, styleClass = *styleClass, id = id) { }

/**
 * Create a styled [Menu] with configuration block.
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @param configuration the configuration block.
 *
 * @return the styled control created.
 */
inline fun styledMenu(
  text: String = "",
  graphic: Node? = null,
  vararg styleClass: String,
  id: String? = null,
  configuration: (@LayoutDslMarker KtfxMenu).() -> Unit
): Menu {
  contract { callsInPlace(configuration, EXACTLY_ONCE) }
  return newChild(KtfxMenu(text, graphic), styleClass = *styleClass, id = id, configuration =
      configuration)
}

/**
 * Add a styled [Menu] with configuration block to this manager.
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @param configuration the configuration block.
 *
 * @return the styled control added.
 */
inline fun MenuItemManager.styledMenu(
  text: String = "",
  graphic: Node? = null,
  vararg styleClass: String,
  id: String? = null,
  configuration: (@LayoutDslMarker KtfxMenu).() -> Unit
): Menu {
  contract { callsInPlace(configuration, EXACTLY_ONCE) }
  return addChild(newChild(KtfxMenu(text, graphic), styleClass = *styleClass, id = id, configuration
      = configuration))
}

/**
 * Add a styled [Menu] with configuration block to this manager.
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @param configuration the configuration block.
 *
 * @return the styled control added.
 */
inline fun MenuManager.styledMenu(
  text: String = "",
  graphic: Node? = null,
  vararg styleClass: String,
  id: String? = null,
  configuration: (@LayoutDslMarker KtfxMenu).() -> Unit
): Menu {
  contract { callsInPlace(configuration, EXACTLY_ONCE) }
  return addChild(newChild(KtfxMenu(text, graphic), styleClass = *styleClass, id = id, configuration
      = configuration))
}
