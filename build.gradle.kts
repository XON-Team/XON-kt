plugins {
    kotlin("multiplatform") version "1.6.10"
}

group = "io.github.xon"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}



kotlin {
    
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))
            }
        }
        val commonTest by getting
    }

    targets {
        jvm()
        js(IR).nodejs()
        mingwX64()
        linuxArm64()
        linuxX64()
    }
}
