pipeline {
	agent any
	stages {
		stage('Compile') {
			steps {
				checkout scm
				dir('groovy-micronaut') {
					sh "ls -lisa"
				   	sh "gradlew build"
			   	}
			}
		}
	}
}