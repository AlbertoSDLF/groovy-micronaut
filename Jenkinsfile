pipeline {
	agent any
	stages {
		stage('Compile') {
			steps {
				sh "ls -lisa groovy-micronaut"
				sh "./gradlew build"
			}
		}
	}
}