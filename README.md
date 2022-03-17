
# Andoroid Ktor Client

A brief description of what this project does and who it's for


## Dependencies for ktor and kotlinx-serialization
```kotlin

dependencies {
    ......
    .........
    implementation "io.ktor:ktor-client-core:$ktor_version"
    implementation "io.ktor:ktor-client-android:$ktor_version"
    implementation "io.ktor:ktor-client-logging:$ktor_version"
    implementation "io.ktor:ktor-client-content-negotiation:$ktor_version"
    implementation "io.ktor:ktor-serialization-kotlinx-json:$ktor_version"
    implementation 'org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.2'
}

```

## Versions 

```groovy

ext {
    ......
    ........
    kotlin_version = '1.6.10'
    ktor_version = '2.0.0-beta-1'
    }

```

## Buildscript classpaths
```Groovy
dependencies {
        classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"
        classpath "org.jetbrains.kotlin:kotlin-serialization:$kotlin_version"
        }
```
