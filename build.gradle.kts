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
                implementation("org.junit.jupiter:junit-jupiter:5.8.2")
                runtimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.2")
            }
        }
    }
}

