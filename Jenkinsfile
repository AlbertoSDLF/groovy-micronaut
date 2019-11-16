pipeline {
	agent any
	stages {
		stage('Compile') {
			steps {
				dir('groovy-micronaut') {
					sh "ls -lisa"
				   	sh "gradlew build"
			   	}
			}
		}
	}
}