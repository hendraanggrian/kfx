import org.gradle.api.tasks.JavaExec
import org.jetbrains.dokka.gradle.DokkaTask
import org.jetbrains.kotlin.gradle.dsl.Coroutines

group = "$RELEASE_GROUP.test"
version = RELEASE_VERSION

plugins {
    kotlin("jvm")
}

sourceSets {
    get("main").java.srcDir("src")
}

dependencies {
    compile(kotlin("stdlib", VERSION_KOTLIN))
    compile(kotlin("test", VERSION_KOTLIN))
    compile(testFx("core"))
    compile(testFx("junit"))
    compile(truth())
    compile(junit())
}