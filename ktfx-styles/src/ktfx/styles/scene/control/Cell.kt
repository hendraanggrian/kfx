@file:Suppress("PackageDirectoryMismatch")

/* ktlint-disable package-name */
package ktfx.styles

/* ktlint-enable package-name */

import ktfx.styles.internal._CellStyleBuilder

interface CellStyleBuilder {

    /**
     * The cell size.
     * For vertical ListView or a TreeView or TableView this is the height, for a horizontal ListView this is the width.
     */
    var cellSize: Number
}

inline fun cellStyle(
    prettyPrint: Boolean = false,
    builder: CellStyleBuilder .() -> Unit
): String = _CellStyleBuilder(prettyPrint).apply(builder).toString()