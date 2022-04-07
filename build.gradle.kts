import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.10"
    application
}

group = "com.frogobox"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    implementation("com.github.frogobox.frogo-sdk:frogocoresdk:0.0.3")
    implementation("com.github.frogobox.frogo-consume-api:frogocoreconsumeapi:2.1.0")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = JavaVersion.VERSION_11.toString()
}

application {
    mainClass.set("MainKt")
}