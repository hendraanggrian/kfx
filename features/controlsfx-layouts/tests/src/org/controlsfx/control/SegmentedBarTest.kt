package ktfx.controlsfx.layouts

import ktfx.layouts.KtfxPane
import ktfx.layouts.NodeManager
import ktfx.test.LayoutTest
import org.controlsfx.control.SegmentedBar

class SegmentedBarTest : LayoutTest<NodeManager, SegmentedBar<SegmentedBar.Segment>>() {

    override fun manager() = KtfxPane()
    override fun childCount() = manager.childCount
    override fun child1() = segmentedBar<SegmentedBar.Segment> { }
    override fun NodeManager.child2() = segmentedBar<SegmentedBar.Segment>()
    override fun NodeManager.child3() = segmentedBar<SegmentedBar.Segment> { }
}