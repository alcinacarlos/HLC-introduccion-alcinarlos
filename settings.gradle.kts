plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "HLC-introduccion-alcinarlos"
include("src:main:ejercicios")
findProject(":src:main:ejercicios")?.name = "ejercicios"
include("src:main:java")
findProject(":src:main:java")?.name = "java"
