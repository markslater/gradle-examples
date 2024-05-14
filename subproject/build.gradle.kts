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

artifacts {
    add("default", outputFile) {
        builtBy(writeFile)
    }
}