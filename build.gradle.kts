class LazyVersion {
    private val version: String by lazy {
        System.getenv("FOO") ?: "bar"
    }
    override fun toString() = version
}

open class VersionPluginExtension {
    val version = LazyVersion()
}

class VersionPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.extensions.create<VersionPluginExtension>("versionPluginExtension")
    }
}

apply<VersionPlugin>()

version = the<VersionPluginExtension>().version

task("printVersion") {
    doLast {
        logger.quiet("The version is {}", version)
    }
}
