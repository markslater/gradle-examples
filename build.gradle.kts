val myConfiguration: Configuration by configurations.creating

dependencies {
    myConfiguration(project(mapOf(
        "path" to ":subproject",
        "configuration" to "myFile",
    )))
}

task("useSubprojectArtefact") {
    inputs.files(myConfiguration)
    doLast {
        logger.info(myConfiguration.singleFile.readText())
    }
}