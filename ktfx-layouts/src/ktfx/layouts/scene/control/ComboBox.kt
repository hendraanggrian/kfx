@file:Suppress("PackageDirectoryMismatch", "NOTHING_TO_INLINE")

/* ktlint-disable package-name */
package ktfx.layouts

/* ktlint-enable package-name */

import javafx.collections.FXCollections
import javafx.collections.ObservableList
import javafx.scene.Node
import javafx.scene.control.ComboBox

/** Creates a [ComboBox]. */
fun <T> comboBox(
    items: ObservableList<T> = FXCollections.observableArrayList(),
    init: ((@LayoutDsl ComboBox<T>).() -> Unit)? = null
): ComboBox<T> = ComboBox(items).also { init?.invoke(it) }

/** Creates a [ComboBox] and add it to this [LayoutManager]. */
inline fun <T> LayoutManager<Node>.comboBox(
    items: ObservableList<T> = FXCollections.observableArrayList(),
    noinline init: ((@LayoutDsl ComboBox<T>).() -> Unit)? = null
): ComboBox<T> = ktfx.layouts.comboBox(items, init)()