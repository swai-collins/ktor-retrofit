import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jetbrains.kotlin.gradle.dsl.Coroutines

plugins {
  kotlin("jvm") version "1.2.71"
}

repositories {
  jcenter()
  maven { setUrl("https://dl.bintray.com/kotlin/ktor") }
}

dependencies {
  implementation(kotlin("stdlib-jdk8"))
  implementation("io.ktor:ktor-server-core:0.9.5")
  implementation("com.squareup.retrofit2:retrofit:2.4.0")

  testCompile("org.junit.jupiter:junit-jupiter-api:5.1.1")
  testRuntime("org.junit.jupiter:junit-jupiter-engine:5.1.1")
  testCompile("io.ktor:ktor-server-test-host:0.9.5")
  testCompile("io.ktor:ktor-jackson:0.9.5")
}

kotlin {
  experimental.coroutines = Coroutines.ENABLE
}

tasks.withType<KotlinCompile> {
  kotlinOptions.jvmTarget = "1.8"
}