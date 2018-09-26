@file:Suppress("PackageDirectoryMismatch", "ClassName")

/* ktlint-disable package-name */
package ktfx.styles

/* ktlint-enable package-name */

import javafx.geometry.Orientation
import javafx.geometry.Pos

@PublishedApi
internal class _TilePaneStyleBuilder(
    prettyPrint: Boolean
) : _RegionStyleBuilder(prettyPrint), TilePaneStyleBuilder {
    override var orientation: Orientation by map
    override var prefRows: Int by map
    override var prefColumns: Int by map
    override var prefTileWidth: Number by map
    override var prefTileHeight: Number by map
    override var hgap: Number by map
    override var vgap: Number by map
    override var alignment: Pos by map
    override var tileAlignment: Pos by map
}

interface TilePaneStyleBuilder {

    var orientation: Orientation

    var prefRows: Int

    var prefColumns: Int

    var prefTileWidth: Number

    var prefTileHeight: Number

    var hgap: Number

    var vgap: Number

    var alignment: Pos

    var tileAlignment: Pos
}

inline fun tilePaneStyle(
    prettyPrint: Boolean = false,
    builder: TilePaneStyleBuilder.() -> Unit
): String = _TilePaneStyleBuilder(prettyPrint).apply(builder).toString()