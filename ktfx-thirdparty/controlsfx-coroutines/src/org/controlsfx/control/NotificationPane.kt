@file:JvmMultifileClass
@file:JvmName("ControlsFxCoroutinesKt")
@file:Suppress("PackageDirectoryMismatch", "SpellCheckingInspection")

package ktfx.thirdparty.controlsfx.coroutines

import javafx.event.Event
import kotlin.coroutines.CoroutineContext
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.javafx.JavaFx
import kotlinx.coroutines.launch
import org.controlsfx.control.NotificationPane

fun NotificationPane.onShowing(
    context: CoroutineContext = kotlinx.coroutines.Dispatchers.JavaFx,
    action: suspend CoroutineScope.(Event) -> Unit
): Unit = setOnShowing { event -> kotlinx.coroutines.GlobalScope.launch(context) { action(event) } }

fun NotificationPane.onShown(
    context: CoroutineContext = kotlinx.coroutines.Dispatchers.JavaFx,
    action: suspend CoroutineScope.(Event) -> Unit
): Unit = setOnShown { event -> kotlinx.coroutines.GlobalScope.launch(context) { action(event) } }

fun NotificationPane.onHiding(
    context: CoroutineContext = kotlinx.coroutines.Dispatchers.JavaFx,
    action: suspend CoroutineScope.(Event) -> Unit
): Unit = setOnHiding { event -> kotlinx.coroutines.GlobalScope.launch(context) { action(event) } }

fun NotificationPane.onHidden(
    context: CoroutineContext = kotlinx.coroutines.Dispatchers.JavaFx,
    action: suspend CoroutineScope.(Event) -> Unit
): Unit = setOnHidden { event -> kotlinx.coroutines.GlobalScope.launch(context) { action(event) } }
