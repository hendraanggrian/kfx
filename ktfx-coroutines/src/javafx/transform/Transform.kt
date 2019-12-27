@file:JvmMultifileClass
@file:JvmName("CoroutinesKt")

package ktfx.coroutines

import javafx.event.Event
import javafx.event.EventHandler
import javafx.event.EventType
import javafx.scene.transform.Transform
import javafx.scene.transform.TransformChangedEvent
import kotlin.coroutines.CoroutineContext
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.javafx.JavaFx
import kotlinx.coroutines.launch

/** Registers an event filter to this transform. */
fun <E : Event> Transform.eventFilter(
    context: CoroutineContext = Dispatchers.JavaFx,
    type: EventType<E>,
    action: suspend CoroutineScope.(E) -> Unit
): EventHandler<E> = EventHandler<E> { event -> GlobalScope.launch(context) { action(event) } }
    .also { addEventFilter(type, it) }

/** Registers an event handler to this transform. */
fun <E : Event> Transform.eventHandler(
    context: CoroutineContext = Dispatchers.JavaFx,
    type: EventType<E>,
    action: suspend CoroutineScope.(E) -> Unit
): EventHandler<E> = EventHandler<E> { event -> GlobalScope.launch(context) { action(event) } }
    .also { addEventHandler(type, it) }

/** Sets the onTransformChanged event handler which is called whenever the transform changes any of its parameters. */
fun Transform.onTransformChanged(
    context: CoroutineContext = Dispatchers.JavaFx,
    action: suspend CoroutineScope.(TransformChangedEvent) -> Unit
): Unit = setOnTransformChanged { event -> GlobalScope.launch(context) { action(event) } }