version=System.getenv("FOO") ?: "bar"

task("printVersion") {
    doLast {
        logger.quiet("The version is {}", version)
    }
}
