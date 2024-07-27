// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.google.gms.google.services) apply false
}
//
//buildscript{
//    repositories{
//        google()
//        jcenter()
//    }
//    dependencies{
//        classpath("com.android.tools.build:gradle:4.1.2")
//        classpath("com.google.gms:google-services:4.3.5")
//    }
//
//}
//
//allprojects {
//    repositories {
//        google()
//        jcenter()
//        maven { url = uri("https://jitpack.io") }
//    }
//}