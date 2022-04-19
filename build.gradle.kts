plugins {
    base
    `maven-publish`
}

group = "com.example"

val tarFoo by tasks.registering(Tar::class) {
    from("foo")
    archiveBaseName.set("foo")
}

val tarBar by tasks.registering(Tar::class) {
    from("bar")
    archiveBaseName.set("bar")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            artifact(tarFoo)
        }
        create<MavenPublication>("bar") {
            artifact(tarBar)
            artifactId = "bar"
        }
    }
}