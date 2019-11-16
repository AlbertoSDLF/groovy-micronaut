pipeline {
	agent gradle
	stages {
		stage('Compile') {
			steps {
				dir('groovy-micronaut') {
				   	sh "./gradlew build"
			   	}
			}
		}
	}
}