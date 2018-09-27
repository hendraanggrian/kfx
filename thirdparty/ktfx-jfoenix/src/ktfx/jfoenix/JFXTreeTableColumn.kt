@file:Suppress("NOTHING_TO_INLINE")

package ktfx.jfoenix

/** Creates a [JFXTreeTableColumn]. *//*

fun <S, T> jfxTreeTableColumn(
    text: String? = null,
    init: ((@LayoutDsl JFXTreeTableColumn<S, T>).() -> Unit)? = null
): JFXTreeTableColumn<S, T> = JFXTreeTableColumn<S, T>(text).also {
    init?.invoke(it)
}

*/
/** Creates a [JFXTreeTableColumn] and add it to this [LayoutManager]. *//*

inline fun <S, T> LayoutManager<Node>.jfxTreeTableColumn(
    text: String? = null,
    noinline init: ((@LayoutDsl JFXTreeTableColumn<S, T>).() -> Unit)? = null
): JFXTreeTableColumn<S, T> = ktfx.jfoenix.jfxTreeTableColumn(text, init)()*/
