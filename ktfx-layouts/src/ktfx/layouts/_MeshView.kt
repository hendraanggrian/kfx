@file:JvmMultifileClass
@file:JvmName("LayoutsKt")
@file:OptIn(ExperimentalContracts::class)

package ktfx.layouts

import javafx.scene.shape.Mesh
import javafx.scene.shape.MeshView
import kotlin.String
import kotlin.Unit
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind.EXACTLY_ONCE
import kotlin.contracts.contract
import kotlin.jvm.JvmMultifileClass
import kotlin.jvm.JvmName
import ktfx.internal.KtfxInternals.newChild

/**
 * Add a [MeshView] to this manager.
 *
 * @return the control added.
 */
fun NodeManager.meshView(mesh: Mesh? = null): MeshView = meshView(mesh = mesh) { }

/**
 * Create a [MeshView] with configuration block.
 * @param configuration the configuration block.
 *
 * @return the control created.
 */
inline fun meshView(mesh: Mesh? = null, configuration: (@LayoutDslMarker MeshView).() -> Unit):
    MeshView {
  contract { callsInPlace(configuration, EXACTLY_ONCE) }
  return newChild(MeshView(mesh), configuration = configuration)
}

/**
 * Add a [MeshView] with configuration block to this manager.
 * @param configuration the configuration block.
 *
 * @return the control added.
 */
inline fun NodeManager.meshView(mesh: Mesh? = null, configuration: (@LayoutDslMarker MeshView).() ->
    Unit): MeshView {
  contract { callsInPlace(configuration, EXACTLY_ONCE) }
  return addChild(newChild(MeshView(mesh), configuration = configuration))
}

/**
 * Create a styled [MeshView].
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 *
 * @return the styled control created.
 */
fun styledMeshView(
  mesh: Mesh? = null,
  vararg styleClass: String,
  id: String? = null
): MeshView = styledMeshView(mesh = mesh, styleClass = *styleClass, id = id) { }

/**
 * Add a styled [MeshView] to this manager.
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 *
 * @return the styled control added.
 */
fun NodeManager.styledMeshView(
  mesh: Mesh? = null,
  vararg styleClass: String,
  id: String? = null
): MeshView = styledMeshView(mesh = mesh, styleClass = *styleClass, id = id) { }

/**
 * Create a styled [MeshView] with configuration block.
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @param configuration the configuration block.
 *
 * @return the styled control created.
 */
inline fun styledMeshView(
  mesh: Mesh? = null,
  vararg styleClass: String,
  id: String? = null,
  configuration: (@LayoutDslMarker MeshView).() -> Unit
): MeshView {
  contract { callsInPlace(configuration, EXACTLY_ONCE) }
  return newChild(MeshView(mesh), styleClass = *styleClass, id = id, configuration = configuration)
}

/**
 * Add a styled [MeshView] with configuration block to this manager.
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @param configuration the configuration block.
 *
 * @return the styled control added.
 */
inline fun NodeManager.styledMeshView(
  mesh: Mesh? = null,
  vararg styleClass: String,
  id: String? = null,
  configuration: (@LayoutDslMarker MeshView).() -> Unit
): MeshView {
  contract { callsInPlace(configuration, EXACTLY_ONCE) }
  return addChild(newChild(MeshView(mesh), styleClass = *styleClass, id = id, configuration =
      configuration))
}
