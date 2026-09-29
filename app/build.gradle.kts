plugins {
    id("com.android.application")
}

android {
    namespace = "com.emeka45.conflingoapp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.emeka45.conflingoapp"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "0.1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
}
