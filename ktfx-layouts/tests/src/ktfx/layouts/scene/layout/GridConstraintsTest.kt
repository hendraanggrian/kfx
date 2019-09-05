package ktfx.layouts.scene.layout

import ktfx.layouts.NodeManager
import ktfx.layouts._Pane
import ktfx.layouts.columnConstraints
import ktfx.layouts.gridPane
import ktfx.layouts.rowConstraints
import ktfx.test.ToolkitLayoutTest
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class GridConstraintsTest : ToolkitLayoutTest<NodeManager>(_Pane()) {

    override fun test() {
        manage {
            val gridPane = gridPane {
                rowConstraints {
                    constraints()
                    constraints(20.0)
                }
                columnConstraints {
                    constraints(30.0)
                    constraints()
                }
            }
            assertNotNull(gridPane.rowConstraints[0])
            assertEquals(gridPane.rowConstraints[1].prefHeight, 20.0)
            assertEquals(gridPane.columnConstraints[0].prefWidth, 30.0)
            assertNotNull(gridPane.columnConstraints[1])
        }
    }
}