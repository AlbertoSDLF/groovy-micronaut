pipeline {
	agent any
	stages {
		stage('Compile') {
			steps {
				sh "pwd"
				sh "cd groovy-micronaut"
				sh "pwd"
				sh "ls -lisa"
				sh "./gradlew build"
			}
		}
	}
}