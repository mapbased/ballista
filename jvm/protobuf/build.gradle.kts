plugins {
    java
    id("com.google.protobuf") version "0.8.11"
    id("idea")
}

sourceSets {
    main {
        proto {
            srcDir("../../proto")
        }
    }
}

dependencies {
    implementation("com.google.protobuf:protobuf-java:3.11.4")
    testImplementation("junit:junit:4.13")
}
