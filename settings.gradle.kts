pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        maven("https://jitpack.io")
    }

    plugins {
        kotlin("jvm").version(extra["kotlin.version"] as String)
    }
}

rootProject.name = "FrogoConsumeApiDesktop"