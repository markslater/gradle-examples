plugins {
    kotlin("jvm") version "1.8.20"
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.2"))
    testImplementation(group = "org.junit.jupiter", name = "junit-jupiter")

    testRuntimeOnly(group = "org.junit.jupiter", name = "junit-jupiter-engine")
}

tasks.test {
    useJUnitPlatform {}
}
