pipeline {
	agent any
	stages {
		stage('Compile') {
			steps {
				sh "ls -lisa"
				sh "./gradlew build"
			}
		}
	}
}