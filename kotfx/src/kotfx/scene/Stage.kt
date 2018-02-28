package kotfx.scene

import javafx.scene.image.Image
import javafx.stage.Stage
import javafx.stage.StageStyle
import javafx.stage.StageStyle.DECORATED
import kotfx.internal.NO_GETTER
import kotfx.internal.noGetter
import kotlin.DeprecationLevel.ERROR

/** Removes old icons and set a new one to this stage. */
var Stage.icon: Image
    @Deprecated(NO_GETTER, level = ERROR) get() = noGetter()
    set(value) = when (icons.size) {
        0 -> icons += value
        1 -> icons[0] = value
        else -> {
            icons.clear()
            icons += value
        }
    }

fun Stage.minSize(width: Number = minWidth, height: Number = minHeight) {
    minWidth = width.toDouble()
    minHeight = height.toDouble()
}

fun Stage.maxSize(width: Number = maxWidth, height: Number = maxHeight) {
    maxWidth = width.toDouble()
    maxHeight = height.toDouble()
}

fun Stage.size(width: Number = this.width, height: Number = this.height) {
    this.width = width.toDouble()
    this.height = height.toDouble()
}

var Stage.minSize: Number
    @Deprecated(NO_GETTER, level = ERROR) get() = noGetter()
    set(value) = minSize(value, value)

var Stage.maxSize: Number
    @Deprecated(NO_GETTER, level = ERROR) get() = noGetter()
    set(value) = maxSize(value, value)

var Stage.size: Number
    @Deprecated(NO_GETTER, level = ERROR) get() = noGetter()
    set(value) = size(value, value)

/** Creates a stage with options. */
fun stage(
    title: String? = null,
    style: StageStyle = DECORATED,
    init: (Stage.() -> Unit)? = null
): Stage = Stage(style).apply {
    if (title != null) setTitle(title)
    init?.invoke(this)
}