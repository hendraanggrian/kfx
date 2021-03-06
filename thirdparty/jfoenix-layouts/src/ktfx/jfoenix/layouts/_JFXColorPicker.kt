@file:JvmMultifileClass
@file:JvmName("JFoenixLayoutsKt")
@file:OptIn(ExperimentalContracts::class)

package ktfx.jfoenix.layouts

import com.jfoenix.controls.JFXColorPicker
import javafx.scene.paint.Color
import javafx.scene.paint.Color.WHITE
import ktfx.layouts.KtfxLayoutDslMarker
import ktfx.layouts.NodeManager
import kotlin.String
import kotlin.Unit
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind.EXACTLY_ONCE
import kotlin.contracts.contract
import kotlin.jvm.JvmMultifileClass
import kotlin.jvm.JvmName

/**
 * Add a [JFXColorPicker] to this manager.
 *
 * @return the control added.
 */
public fun NodeManager.jfxColorPicker(color: Color = WHITE): JFXColorPicker = jfxColorPicker(
    color =
    color
) { }

/**
 * Create a [JFXColorPicker] with configuration block.
 * @param configuration the configuration block.
 *
 * @return the control created.
 */
public inline fun jfxColorPicker(
    color: Color = WHITE,
    configuration: (
        @KtfxLayoutDslMarker    
        JFXColorPicker
    ).() -> Unit
): JFXColorPicker {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    val child = JFXColorPicker(color)
    child.configuration()
    return child
}

/**
 * Add a [JFXColorPicker] with configuration block to this manager.
 * @param configuration the configuration block.
 *
 * @return the control added.
 */
public inline fun NodeManager.jfxColorPicker(
    color: Color = WHITE,
    configuration: (@KtfxLayoutDslMarker JFXColorPicker).() -> Unit
): JFXColorPicker {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    val child = JFXColorPicker(color)
    child.configuration()
    return addChild(child)
}

/**
 * Create a styled [JFXColorPicker].
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 *
 * @return the styled control created.
 */
public fun styledJFXColorPicker(
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
public fun NodeManager.styledJFXColorPicker(
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
public inline fun styledJFXColorPicker(
    color: Color = WHITE,
    vararg styleClass: String,
    id: String? = null,
    configuration: (@KtfxLayoutDslMarker JFXColorPicker).() -> Unit
): JFXColorPicker {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    val child = JFXColorPicker(color)
    child.styleClass += styleClass
    child.id = id
    child.configuration()
    return child
}

/**
 * Add a styled [JFXColorPicker] with configuration block to this manager.
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @param configuration the configuration block.
 *
 * @return the styled control added.
 */
public inline fun NodeManager.styledJFXColorPicker(
    color: Color = WHITE,
    vararg styleClass: String,
    id: String? = null,
    configuration: (@KtfxLayoutDslMarker JFXColorPicker).() -> Unit
): JFXColorPicker {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    val child = JFXColorPicker(color)
    child.styleClass += styleClass
    child.id = id
    child.configuration()
    return addChild(child)
}
