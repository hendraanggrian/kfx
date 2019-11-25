@file:JvmMultifileClass
@file:JvmName("ObservableCollectionKt")
@file:Suppress("NOTHING_TO_INLINE")

package ktfx.collections

import javafx.beans.binding.Bindings
import javafx.beans.binding.BooleanBinding
import javafx.beans.binding.DoubleBinding
import javafx.beans.binding.FloatBinding
import javafx.beans.binding.IntegerBinding
import javafx.beans.binding.LongBinding
import javafx.beans.binding.ObjectBinding
import javafx.beans.binding.StringBinding
import javafx.beans.value.ObservableValue
import javafx.collections.FXCollections
import javafx.collections.ObservableMap

/**
 * Returns an empty immutable [ObservableMap].
 *
 * @see emptyMap
 */
fun <K, V> emptyObservableMap(): ObservableMap<K, V> =
    FXCollections.emptyObservableMap()

/**
 * Returns an empty immutable [ObservableMap].
 *
 * @see mapOf
 */
inline fun <K, V> observableMapOf(): ObservableMap<K, V> =
    emptyObservableMap()

/**
 * Returns an empty observable map of containing all [pairs].
 *
 * @see mapOf
 */
fun <K, V> observableMapOf(vararg pairs: Pair<K, V>): ObservableMap<K, V> =
    if (pairs.isNotEmpty()) FXCollections.unmodifiableObservableMap(pairs.toMap(FXCollections.observableHashMap())) else emptyObservableMap()

/**
 * Returns an empty [ObservableMap].
 *
 * @see mutableMapOf
 */
fun <K, V> mutableObservableMapOf(): ObservableMap<K, V> =
    FXCollections.observableHashMap()

/**
 * Returns an [ObservableMap] of [pairs].
 *
 * @see mutableMapOf
 */
fun <K, V> mutableObservableMapOf(vararg pairs: Pair<K, V>): ObservableMap<K, V> =
    if (pairs.isEmpty()) mutableObservableMapOf() else FXCollections.observableMap(HashMap<K, V>().apply {
        for ((key, value) in pairs) put(key, value)
    })

/**
 * Converts this map to immutable [ObservableMap].
 *
 * @see Map.toMap
 */
fun <K, V> Map<K, V>.toObservableMap(): ObservableMap<K, V> {
    return when (size) {
        0 -> emptyObservableMap()
        else -> FXCollections.unmodifiableObservableMap(this.toMutableObservableMap())
    }
}

/**
 * Converts this map to [ObservableMap].
 *
 * @see Map.toMutableMap
 */
fun <K, V> Map<K, V>.toMutableObservableMap(): ObservableMap<K, V> =
    FXCollections.observableMap(this)

/** Generates a bidirectional binding between two instances of [ObservableMap]. */
fun <K, V> ObservableMap<K, V>.bindContentBidirectional(other: ObservableMap<K, V>): Unit =
    Bindings.bindContentBidirectional(this, other)

/** Remove a bidirectional binding between two instances of [ObservableMap]. */
fun <K, V> ObservableMap<K, V>.unbindContentBidirectional(other: ObservableMap<K, V>): Unit =
    Bindings.unbindContentBidirectional(this, other)

/** Generates a bidirectional binding between an [ObservableMap] and a [Map]. */
fun <K, V> Map<K, V>.bindContent(other: ObservableMap<K, V>): Unit =
    Bindings.bindContent(this, other)

/** Remove a bidirectional binding between an [ObservableMap] and a [Map]. */
fun <K, V> Map<K, V>.unbindContent(other: ObservableMap<K, V>): Unit =
    Bindings.unbindContent(this, other)

/** Creates a new [IntegerBinding] that contains the size [ObservableMap]. */
val <K, V> ObservableMap<K, V>.sizeBinding: IntegerBinding
    get() = Bindings.size(this)

/** Creates a new [BooleanBinding] that holds `true` if a given [ObservableMap] is empty. */
val <K, V> ObservableMap<K, V>.emptyBinding: BooleanBinding
    get() = Bindings.isEmpty(this)

/** Creates a new [BooleanBinding] that holds `true` if a given [ObservableMap] is not empty. */
val <K, V> ObservableMap<K, V>.notEmptyBinding: BooleanBinding
    get() = Bindings.isNotEmpty(this)

/** Creates a new [ObjectBinding] that contains the mapping of a specific key in an [ObservableMap]. */
fun <K, V> ObservableMap<K, V>.getBinding(key: K): ObjectBinding<V> =
    Bindings.valueAt(this, key)

/** Creates a new [ObjectBinding] that contains the mapping of a specific key in an [ObservableMap]. */
fun <K, V> ObservableMap<K, V>.getBinding(key: ObservableValue<K>): ObjectBinding<V> =
    Bindings.valueAt(this, key)

/** Creates a new [BooleanBinding] that contains the mapping of a specific key in an [ObservableMap]. */
fun <K> ObservableMap<K, Boolean>.getBinding(key: K): BooleanBinding =
    Bindings.booleanValueAt(this, key)

/** Creates a new [BooleanBinding] that contains the mapping of a specific key in an [ObservableMap]. */
fun <K> ObservableMap<K, Boolean>.getBinding(key: ObservableValue<K>): BooleanBinding =
    Bindings.booleanValueAt(this, key)

/** Creates a new [DoubleBinding] that contains the mapping of a specific key in an [ObservableMap]. */
fun <K> ObservableMap<K, Double>.getBinding(key: K): DoubleBinding =
    Bindings.doubleValueAt(this, key)

/** Creates a new [DoubleBinding] that contains the mapping of a specific key in an [ObservableMap]. */
fun <K> ObservableMap<K, Double>.getBinding(key: ObservableValue<K>): DoubleBinding =
    Bindings.doubleValueAt(this, key)

/** Creates a new [FloatBinding] that contains the mapping of a specific key in an [ObservableMap]. */
fun <K> ObservableMap<K, Float>.getBinding(key: K): FloatBinding =
    Bindings.floatValueAt(this, key)

/** Creates a new [FloatBinding] that contains the mapping of a specific key in an [ObservableMap]. */
fun <K> ObservableMap<K, Float>.getBinding(key: ObservableValue<K>): FloatBinding =
    Bindings.floatValueAt(this, key)

/** Creates a new [IntegerBinding] that contains the mapping of a specific key in an [ObservableMap]. */
fun <K> ObservableMap<K, Int>.getBinding(key: K): IntegerBinding =
    Bindings.integerValueAt(this, key)

/** Creates a new [IntegerBinding] that contains the mapping of a specific key in an [ObservableMap]. */
fun <K> ObservableMap<K, Int>.getBinding(key: ObservableValue<K>): IntegerBinding =
    Bindings.integerValueAt(this, key)

/** Creates a new [LongBinding] that contains the mapping of a specific key in an [ObservableMap]. */
fun <K> ObservableMap<K, Long>.getBinding(key: K): LongBinding =
    Bindings.longValueAt(this, key)

/** Creates a new [LongBinding] that contains the mapping of a specific key in an [ObservableMap]. */
fun <K> ObservableMap<K, Long>.getBinding(key: ObservableValue<K>): LongBinding =
    Bindings.longValueAt(this, key)

/** Creates a new [StringBinding] that contains the mapping of a specific key in an [ObservableMap]. */
fun <K> ObservableMap<K, String>.getBinding(key: K): StringBinding =
    Bindings.stringValueAt(this, key)

/** Creates a new [StringBinding] that contains the mapping of a specific key in an [ObservableMap]. */
fun <K> ObservableMap<K, String>.getBinding(key: ObservableValue<K>): StringBinding =
    Bindings.stringValueAt(this, key)