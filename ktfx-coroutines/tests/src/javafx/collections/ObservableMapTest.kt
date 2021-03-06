package ktfx.coroutines

import javafx.collections.MapChangeListener
import javafx.collections.ObservableMap
import kotlinx.coroutines.Dispatchers
import com.hendraanggrian.ktfx.test.BaseObservableMapTest

class ObservableMapTest : BaseObservableMapTest() {

    override fun <K, V> ObservableMap<K, V>.callListener(action: (MapChangeListener.Change<out K, out V>) -> Unit) {
        listener<K, V>(Dispatchers.Unconfined) { action(it) }
    }
}