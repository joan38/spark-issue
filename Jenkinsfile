pipeline {
    agent any

    stages {
        stage("Checks") {
            steps {
                checkout scm

                withEnv(["PATH=/usr/lib/jvm/java-1.8.0-openjdk/bin:$PATH"]) {
                  sh "sbt scalafmtSbtCheck scalafmtCheck scalafixTest test"
                }
            }
        }
    }
}
