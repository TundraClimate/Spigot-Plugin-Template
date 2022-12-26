val versionSp = "1.19"

group = "com.template"
version = "0.0"


plugins {
    java
    kotlin("jvm") version "1.7.20" // Your Kotlin version here
}

repositories {
    mavenCentral()
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
}

dependencies {
    compileOnly("org.spigotmc:spigot-api:${versionSp}-R0.1-SNAPSHOT")
    implementation(kotlin("stdlib-jdk8"))
}