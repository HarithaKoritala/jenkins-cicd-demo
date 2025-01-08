pipeline {
    agent any

    tools {
        // Install the Maven version configured name as "M3" and add it to the path.
        maven "maven"
    }

    stages {
        stage("SCM Checkout") {
            steps {
              checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/HarithaKoritala/jenkins-cicd-demo.git']])
            }
        }
            stage("Build Process") {
            steps {
              script{
                  sh 'mvn clean install'
              }
            }
        }

       /*  stage("Deploy to Container") {
                    steps {
                      script{
                          deploy adapters:[tomcat9(credentialsId:'tomcat-pwd', path:'', url:'')]
                      }
                    }
                } */
    }
}
