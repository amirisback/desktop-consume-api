import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.8.0"
    application
}

group = "com.frogobox"
version = "1.0"

repositories {
    google()
    mavenCentral()
    maven("https://jitpack.io")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = JavaVersion.VERSION_11.toString()
}

dependencies {
    implementation("com.github.frogobox.frogo-sdk:frogocoresdk:0.0.3")
    implementation("com.github.frogobox.frogo-consume-api:frogocoreconsumeapi:2.1.0")
    testImplementation(kotlin("test"))
}

application {
    mainClass.set("MainKt")
}