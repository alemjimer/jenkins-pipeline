#!/usr/bin/env groovy
node (){

    stage('Checkout') {
        sh "rm -rf *"
        git url: 'https://github.com/alemjimer/jenkins-pipeline.git'
    }

    stage('Build') {
        sh '/Users/ahmedlemjimer/Documents/work/apache-maven-3.3.9/bin/mvn clean install'
    }
}

