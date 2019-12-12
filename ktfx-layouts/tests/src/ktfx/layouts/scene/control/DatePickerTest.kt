package ktfx.layouts.scene.control

import javafx.scene.control.DatePicker
import ktfx.layouts.KtfxPane
import ktfx.layouts.NodeManager
import ktfx.layouts.datePicker
import ktfx.test.BaseLayoutTest
import kotlin.test.assertNull

class DatePickerTest : BaseLayoutTest<NodeManager, DatePicker>() {

    override fun manager() = KtfxPane()
    override fun childCount() = manager.childCount
    override fun child1() = datePicker { }
    override fun NodeManager.child2() = datePicker()
    override fun NodeManager.child3() = datePicker { }

    override fun DatePicker.testDefaultValues() {
        assertNull(value)
    }
}