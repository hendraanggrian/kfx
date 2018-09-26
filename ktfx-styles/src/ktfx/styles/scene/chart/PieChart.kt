@file:Suppress("PackageDirectoryMismatch")

/* ktlint-disable package-name */
package ktfx.styles

/* ktlint-enable package-name */

import ktfx.styles.internal._PieChartStyleBuilder

interface PieChartStyleBuilder {

    var clockwise: Boolean

    var pieLabelVisible: Boolean

    var labelLineLength: Number

    var startAngle: Number
}

inline fun pieChartStyle(
    prettyPrint: Boolean = false,
    builder: PieChartStyleBuilder.() -> Unit
): String = _PieChartStyleBuilder(prettyPrint).apply(builder).toString()