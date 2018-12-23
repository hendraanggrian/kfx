@file:Suppress("PackageDirectoryMismatch", "NOTHING_TO_INLINE")

package ktfx.layouts

import javafx.scene.shape.HLineTo

/** Creates a [HLineTo]. */
fun hlineTo(
    x: Double = 0.0,
    init: ((@LayoutDsl HLineTo).() -> Unit)? = null
): HLineTo = HLineTo(x).also { init?.invoke(it) }

/** Creates a [HLineTo] and add it to this manager. */
inline fun PathElementInvokable.hlineTo(
    x: Double = 0.0,
    noinline init: ((@LayoutDsl HLineTo).() -> Unit)? = null
): HLineTo = ktfx.layouts.hlineTo(x, init)()