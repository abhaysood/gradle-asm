plugins {
    `kotlin-dsl`
    kotlin("jvm") version "1.8.20"
}

repositories {
    mavenCentral()
    google()
}

dependencies {
    implementation("com.android.tools.build:gradle-api:7.4.2")
    implementation("org.ow2.asm:asm-util:9.4")
}