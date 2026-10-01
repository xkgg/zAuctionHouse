group = "Hooks.ItemsAdder"

repositories {
    mavenCentral()
}

dependencies {
    compileOnly(projects.api)
    compileOnly("beer.devs:itemsadder-api:4.0.17")
}