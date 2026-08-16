pluginManagement {
    includeBuild("build-logic")

    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {

    repositories {
        mavenCentral()
    }
}

rootProject.name = "rest-springboot"

include(
    "common",
    "order-service",
    "payment-service",
    "inventory-service",
    "notification-service"
)