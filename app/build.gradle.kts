plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "vn.edu.usth.weather"
    compileSdk = 34

    defaultConfig {
        applicationId = "vn.edu.usth.weather"
        minSdk = 32
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
<<<<<<< HEAD
    implementation("androidx.viewpager:viewpager:1.0.0")
    implementation("androidx.fragment:fragment:1.5.5")
=======
>>>>>>> 6974e102eef7a095ba53d828ac984daa625ee03d
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}