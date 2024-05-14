val myConfiguration: Configuration by configurations.creating

dependencies {
    myConfiguration(project("subproject"))
}

task("useSubprojectArtefact") {
    inputs.files(myConfiguration)
    logger.warn("Got ${myConfiguration.files.size} artefact(s)")
    doLast {
        logger.warn(myConfiguration.singleFile.readText())
    }
}