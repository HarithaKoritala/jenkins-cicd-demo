/*
pipeline {
    agent any

    tools {
        // Install the Maven version configured name as "M3" and add it to the path.
        maven "maven"
    }

    stages {
        stage("SCM Checkout") {
            steps {
              checkout scmGit(branches: [[name: '*//*
main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/HarithaKoritala/jenkins-cicd-demo.git']])
            }
        }
            stage("Build Process") {
            steps {
              script{
                  sh 'mvn clean install'
              }
            }
        }

        stage('Build Image') {
            steps {
              script{
                 sh 'docker build -t koritalaharitha1/jenkins-cicd:1.0 .'
              }
            }
         }
         stage('Push Image to Hub') {
                     steps {
                       script{
                          sh 'docker push -t koritalaharitha1/jenkins-cicd:1.0 .'
                   }
               }
           }

        */
/*  stage("Deploy to Container") {
                    steps {
                      script{
                          deploy adapters:[tomcat9(credentialsId:'tomcat-pwd', path:'', url:'')]
                      }
                    }
                } *//*

    }
}
 */
