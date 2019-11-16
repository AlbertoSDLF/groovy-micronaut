pipeline {
	agent any
	stages {
		stage('Compile') {
			steps {
				dir('groovy-micronaut') {
				   	sh "gradlew build"
			   	}
			}
		}
	}
}