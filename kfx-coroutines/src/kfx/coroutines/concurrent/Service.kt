package kfx.coroutines

import javafx.concurrent.Service
import javafx.concurrent.WorkerStateEvent
import javafx.event.Event
import javafx.event.EventType
import kotlinx.coroutines.experimental.launch
import kotlin.coroutines.experimental.CoroutineContext

fun <E : Event> Service<*>.eventFilter(
    context: CoroutineContext = FX,
    type: EventType<E>,
    action: suspend (E) -> Unit
) = addEventFilter(type, { event -> launch(context) { action(event) } })

fun <E : Event> Service<*>.eventHandler(
    context: CoroutineContext = FX,
    type: EventType<E>,
    action: suspend (E) -> Unit
) = addEventFilter(type, { event -> launch(context) { action(event) } })

fun Service<*>.onCancelled(
    context: CoroutineContext = FX,
    action: suspend (WorkerStateEvent) -> Unit
) = setOnCancelled { event -> launch(context) { action(event) } }

fun Service<*>.onFailed(
    context: CoroutineContext = FX,
    action: suspend (WorkerStateEvent) -> Unit
) = setOnFailed { event -> launch(context) { action(event) } }

fun Service<*>.onReady(
    context: CoroutineContext = FX,
    action: suspend (WorkerStateEvent) -> Unit
) = setOnReady { event -> launch(context) { action(event) } }

fun Service<*>.onRunning(
    context: CoroutineContext = FX,
    action: suspend (WorkerStateEvent) -> Unit
) = setOnRunning { event -> launch(context) { action(event) } }

fun Service<*>.onScheduled(
    context: CoroutineContext = FX,
    action: suspend (WorkerStateEvent) -> Unit
) = setOnScheduled { event -> launch(context) { action(event) } }

fun Service<*>.onSucceeded(
    context: CoroutineContext = FX,
    action: suspend (WorkerStateEvent) -> Unit
) = setOnSucceeded { event -> launch(context) { action(event) } }