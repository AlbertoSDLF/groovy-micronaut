pipeline {
	agent any
	stages {
		stage('Compile') {
			steps {
				sh "ls -lisa"
				dir('groovy-micronaut') {
					sh "ls -lisa"
				   	sh "gradlew build"
			   	}
			}
		}
	}
}