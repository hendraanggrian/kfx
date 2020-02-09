@file:JvmMultifileClass
@file:JvmName("JfoenixLayoutsKt")
@file:UseExperimental(ExperimentalContracts::class)

package ktfx.jfoenix.layouts

import com.jfoenix.controls.JFXCheckBox
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract
import ktfx.layouts.LayoutDslMarker
import ktfx.layouts.NodeManager
import ktfx.layouts.addChild

/** Create a [JFXCheckBox] with configurationialization block. */
inline fun jfxCheckBox(
    text: String? = null,
    configuration: (@LayoutDslMarker JFXCheckBox).() -> Unit
): JFXCheckBox {
    contract { callsInPlace(configuration, InvocationKind.EXACTLY_ONCE) }
    return JFXCheckBox(text).apply(configuration)
}

/** Add a [JFXCheckBox] to this manager. */
fun NodeManager.jfxCheckBox(
    text: String? = null
): JFXCheckBox = addChild(JFXCheckBox(text))

/** Add a [JFXCheckBox] with configurationialization block to this manager. */
inline fun NodeManager.jfxCheckBox(
    text: String? = null,
    configuration: (@LayoutDslMarker JFXCheckBox).() -> Unit
): JFXCheckBox {
    contract { callsInPlace(configuration, InvocationKind.EXACTLY_ONCE) }
    return addChild(JFXCheckBox(text), configuration)
}
