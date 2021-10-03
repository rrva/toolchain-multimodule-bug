java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(14))
    }
}

kotlin {
    jvmToolchain {
        (this as JavaToolchainSpec).languageVersion.set(JavaLanguageVersion.of(14))
    }
}
