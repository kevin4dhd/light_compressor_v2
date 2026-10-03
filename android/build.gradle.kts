// Kole: copia local de light_compressor_v2 1.9.1. La versión publicada da por
// hecho el Kotlin integrado de AGP 9; la app usa AGP 8, así que se aplica el
// plugin de Kotlin y se usa srcDirs. El código de compresión no se tocó.
plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

group = "com.gurfdev.light_compressor_v2"
version = "1.0"

rootProject.allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

configure<com.android.build.api.dsl.LibraryExtension> {

    namespace = "com.gurfdev.light_compressor_v2"
    compileSdk = 34

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    sourceSets {
        getByName("main") {
            java.srcDirs("src/main/kotlin")
        }
    }

    defaultConfig {
        minSdk = 24
    }

    lint {
        disable.add("InvalidPackage")
    }
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")
    implementation("com.google.code.gson:gson:2.10.1")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    compilerOptions {
        jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_1_8)
    }
}
tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    compilerOptions {
        jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_1_8)
    }
}
