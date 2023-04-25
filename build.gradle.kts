object Dodgy {
    override fun toString(): String {
        println("Called toString")
        return "qux"
    }
}

open class VersionPluginExtension {
    val version = Dodgy
}

class VersionPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.extensions.create<VersionPluginExtension>("versionPlugin")
    }
}

apply<VersionPlugin>()

version = the<VersionPluginExtension>().version

task("printVersion") {
    doLast {
        logger.quiet("The version is {}", version)
    }
}
