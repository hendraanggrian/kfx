@file:Suppress("NOTHING_TO_INLINE")

package ktfx.text

import javafx.scene.control.Labeled
import javafx.scene.text.Font
import javafx.scene.text.FontPosture
import javafx.scene.text.FontWeight
import java.io.InputStream

inline var Labeled.fontSize: Double
    get() = font.size
    set(value) {
        font = Font.font(value)
    }

inline var Labeled.fontFamily: String
    get() = font.family
    set(value) {
        font = Font.font(value)
    }

inline fun Labeled.font(
    size: Double = -1.0,
    family: String? = null,
    weight: FontWeight? = null,
    posture: FontPosture? = null
) {
    font = Font.font(family, weight, posture, size)
}

inline fun Labeled.font(
    url: String,
    size: Double = -1.0
) {
    font = Font.loadFont(url, size)
}

inline fun Labeled.font(
    stream: InputStream,
    size: Double = -1.0
) {
    font = Font.loadFont(stream, size)
}