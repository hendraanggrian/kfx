const val RELEASE_USER = "hendraanggrian"
const val RELEASE_ARTIFACT = "ktfx"
const val RELEASE_GROUP = "com.$RELEASE_USER.$RELEASE_ARTIFACT"
const val RELEASE_VERSION = "8.5.0"
const val RELEASE_DESC = "Kotlin extensions for JavaFX app development"
const val RELEASE_WEB = "https://github.com/$RELEASE_USER/$RELEASE_ARTIFACT"

val BINTRAY_USER get() = System.getenv("BINTRAY_USER")
val BINTRAY_KEY get() = System.getenv("BINTRAY_KEY")