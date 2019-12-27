package ktfx.layouts

import javafx.scene.media.MediaView
import ktfx.test.LayoutsTest
import kotlin.test.assertNull

class MediaViewTest : LayoutsTest<NodeManager, MediaView>() {

    override fun manager() = KtfxPane()
    override fun childCount() = manager.childCount
    override fun child1() = mediaView { }
    override fun NodeManager.child2() = mediaView()
    override fun NodeManager.child3() = mediaView { }

    override fun MediaView.testDefaultValues() {
        assertNull(mediaPlayer)
    }
}