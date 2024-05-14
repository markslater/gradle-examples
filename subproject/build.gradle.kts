plugins {
    base
}

val outputFile = project.layout.buildDirectory.file("MyFile.txt")

val writeFile: Task by tasks.creating {
    outputs.file(outputFile)
    doLast {
        outputFile.get().asFile.writeText("Hello, World!")
    }
}

val myFile: Configuration by configurations.creating

artifacts {
    add(myFile.name, outputFile) {
        builtBy(writeFile)
    }
}