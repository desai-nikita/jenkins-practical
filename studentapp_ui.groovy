pipeline {
	   agent any
# performing multiple stages for our application
  	   stages {
		stage("pull") {
			steps {
			    echo "pull Done"
			}
		}
		stage("Build") {
			steps {
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
	    