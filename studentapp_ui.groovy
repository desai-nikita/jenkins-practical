pipeline {
	   agent any
// # performing multiple stages for our application
  	   stages {
		stage("pull") {
			steps {
                git changelog: false, poll: false, url: 'https://github.com/desai-nikita/studentapp.ui'
			    echo "pull Done"
			}
		}
		stage("Build") {
			steps {
                sh '/opt/apache-maven-3.9.6/bin/mvn clean package'
			    echo "Build Done"
			}
		}
		stage("Test") {
			steps {
				sh '''mvn sonar:sonar \\ -Dsonar.projectKey=studentapp-ui \\ -Dsonar.host.url=http://54.80.197.65:9000 \\ -Dsonar.login=001edb64f67f8951253e0ea09b1094ea92b50db8'''
			    echo "Test Done"
			}
		}

		stage("Quality-Test") {
			steps {
			    echo "Quality-check Done"
			}
		}
		stage("Deploy") {
			steps {
			    echo "Deploy Done"
			}
		}
       }
}
	    
