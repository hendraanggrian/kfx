package ktfx.coroutines

import javafx.scene.control.ScrollToEvent
import javafx.scene.control.SortEvent
import javafx.scene.control.TreeTableColumn
import javafx.scene.control.TreeTableView
import kotlinx.coroutines.Dispatchers
import com.hendraanggrian.ktfx.test.BaseTreeTableViewTest

class TreeTableViewTest : BaseTreeTableViewTest() {

    override fun <S> TreeTableView<S>.callOnSort(action: (SortEvent<TreeTableView<S>>) -> Unit) =
        onSort(Dispatchers.Unconfined) { action(it) }

    override fun <S> TreeTableView<S>.callOnScrollTo(action: (ScrollToEvent<Int>) -> Unit) =
        onScrollTo(Dispatchers.Unconfined) { action(it) }

    override fun <S> TreeTableView<S>.callOnScrollToColumn(action: (ScrollToEvent<TreeTableColumn<S, *>>) -> Unit) =
        onScrollToColumn(Dispatchers.Unconfined) { action(it) }
}