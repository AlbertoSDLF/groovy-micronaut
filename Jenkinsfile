pipeline {
	agent any
	stages {
		stage('Compile') {
			steps {
				sh "cd groovy-micronaut"
				sh "ls -lisa"
				sh "./gradlew build"
			}
		}
	}
}