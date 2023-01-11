import com.ivy.buildsrc.Hilt
import com.ivy.buildsrc.Testing

apply<com.ivy.buildsrc.IvyPlugin>()

plugins {
    `android-library`
    `kotlin-android`
}

dependencies {
    Hilt()
    implementation(project(":common:main"))
    implementation(project(":core:domain"))
    implementation(project(":core:data-model"))
    implementation(project(":core:persistence"))
    implementation(project(":backup:base"))
    Testing()
}