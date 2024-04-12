pipeline {
	   agent any
# performing multiple stages for our application
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
	    