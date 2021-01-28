import org.apache.tools.ant.filters.ReplaceTokens

plugins {
    java
}

group = "org.yatopiamc.necessity"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://repo.codemc.io/repository/maven-public/")
    maven("https://papermc.io/repo/repository/maven-public/")
}

dependencies {
    compileOnly("org.yatopiamc:yatopia-api:1.16.5-R0.1-SNAPSHOT")
}

java {
    if (JavaVersion.VERSION_1_8 > JavaVersion.current()) {
        error("This build must be run with Java 8 or better")
    }
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}