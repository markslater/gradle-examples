class VersionPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.version = System.getenv("FOO") ?: "bar"
    }
}

apply<VersionPlugin>()

task("printVersion") {
    doLast {
        logger.quiet("The version is {}", version)
    }
}
