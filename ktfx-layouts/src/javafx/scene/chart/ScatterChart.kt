@file:JvmMultifileClass
@file:JvmName("LayoutsKt")
@file:UseExperimental(ExperimentalContracts::class)

package ktfx.layouts

import javafx.collections.FXCollections
import javafx.collections.ObservableList
import javafx.scene.chart.Axis
import javafx.scene.chart.ScatterChart
import javafx.scene.chart.XYChart.Series
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

/** Create a [ScatterChart] with configurationialization block. */
inline fun <X, Y> scatterChart(
    x: Axis<X>,
    y: Axis<Y>,
    data: ObservableList<Series<X, Y>> = FXCollections.observableArrayList(),
    configuration: (@LayoutDslMarker ScatterChart<X, Y>).() -> Unit
): ScatterChart<X, Y> {
    contract { callsInPlace(configuration, InvocationKind.EXACTLY_ONCE) }
    return ScatterChart(x, y, data).apply(configuration)
}

/** Add a [ScatterChart] to this manager. */
fun <X, Y> NodeManager.scatterChart(
    x: Axis<X>,
    y: Axis<Y>,
    data: ObservableList<Series<X, Y>> = FXCollections.observableArrayList()
): ScatterChart<X, Y> = addChild(ScatterChart(x, y, data))

/** Add a [ScatterChart] with configurationialization block to this manager. */
inline fun <X, Y> NodeManager.scatterChart(
    x: Axis<X>,
    y: Axis<Y>,
    data: ObservableList<Series<X, Y>> = FXCollections.observableArrayList(),
    configuration: (@LayoutDslMarker ScatterChart<X, Y>).() -> Unit
): ScatterChart<X, Y> {
    contract { callsInPlace(configuration, InvocationKind.EXACTLY_ONCE) }
    return addChild(ScatterChart(x, y, data), configuration)
}
