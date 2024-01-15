

val storageUrl = System.getenv("FLUTTER_STORAGE_BASE_URL")
    ?: "https://storage.googleapis.com"

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven{
            url = uri("C:\\Users\\Matheus\\Desktop\\flutter_module\\my_flutter\\build\\host\\outputs\\repo")
        }
        maven{
            url = uri("https://storage.googleapis.com/download.flutter.io")
        }
    }
}

rootProject.name = "POC_flutter"
include(":app")
