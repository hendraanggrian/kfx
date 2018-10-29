@file:Suppress("PackageDirectoryMismatch", "NOTHING_TO_INLINE")

package ktfx.layouts

import javafx.scene.control.PasswordField
import ktfx.NodeManager
import ktfx.annotations.LayoutDsl

/** Creates a [PasswordField]. */
fun passwordField(
    init: ((@LayoutDsl PasswordField).() -> Unit)? = null
): PasswordField = PasswordField().also { init?.invoke(it) }

/** Creates a [PasswordField] and add it to this manager. */
inline fun NodeManager.passwordField(
    noinline init: ((@LayoutDsl PasswordField).() -> Unit)? = null
): PasswordField = ktfx.layouts.passwordField(init)()