plugins {
    java
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

testing {
    suites {
        val test by getting(JvmTestSuite::class) {
            useJUnitJupiter()
            dependencies {
                implementation(group = "org.junit.jupiter", name = "junit-jupiter", version = "5.8.2")
                runtimeOnly(group = "org.junit.jupiter", name = "junit-jupiter-engine", version = "5.8.2")
            }
        }
    }
}

