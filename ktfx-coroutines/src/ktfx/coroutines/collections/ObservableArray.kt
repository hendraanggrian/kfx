package ktfx.coroutines

import javafx.collections.ObservableArray
import kotlinx.coroutines.experimental.launch
import kotlin.coroutines.experimental.CoroutineContext

/** Add a listener to this observable array. */
fun <T : ObservableArray<T>> ObservableArray<T>.listener(
    context: CoroutineContext = FX,
    listener: suspend (array: T, changed: Boolean, from: Int, to: Int) -> Unit
) = addListener { array, changed, from, to -> launch(context) { listener(array, changed, from, to) } }