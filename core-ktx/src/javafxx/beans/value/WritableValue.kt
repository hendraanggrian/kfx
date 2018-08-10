@file:Suppress("NOTHING_TO_INLINE")

package javafxx.beans.value

import javafx.beans.value.WritableValue
import kotlin.reflect.KProperty

/** Delegated property, use with `by` keyword. */
inline operator fun <V> WritableValue<in V>.setValue(thisRef: Any?, property: KProperty<*>, value: V) = setValue(value)