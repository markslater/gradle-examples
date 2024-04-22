plugins {
    kotlin("jvm") version "1.9.22"
}

repositories {
    mavenCentral()
}

testing {
    @Suppress("UnstableApiUsage")
    suites {
        val test by getting(JvmTestSuite::class) {
            useJUnitJupiter("5.10.2")
        }
    }
}