@file:Suppress("PackageDirectoryMismatch", "NOTHING_TO_INLINE")

package ktfx.jfoenix

import com.jfoenix.controls.JFXMasonryPane
import ktfx.layouts.NodeInvokable
import ktfx.layouts.LayoutDsl

/** Creates a [JFXMasonryPane]. */
fun jfxMasonryPane(
    init: ((@LayoutDsl JFXMasonryPane).() -> Unit)? = null
): JFXMasonryPane = JFXMasonryPane().also { init?.invoke(it) }

/** Creates a [JFXMasonryPane] and add it to this manager. */
inline fun NodeInvokable.jfxMasonryPane(
    noinline init: ((@LayoutDsl JFXMasonryPane).() -> Unit)? = null
): JFXMasonryPane = ktfx.jfoenix.jfxMasonryPane(init)()