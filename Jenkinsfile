pipeline {
	agent gradle
	stages {
		stage('Compile') {
			steps {
			   	sh "gradlew build"
			}
		}
	}
}