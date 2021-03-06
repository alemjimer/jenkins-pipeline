
node (){
  deleteDir()
  sh 'mkdir hallo'
  stage ('checkout') {
    dir('hallo') {
      git credentialsId: 'f2a8f3f0-db0f-4de5-b181-ab7e790dd42a', url: 'https://github.com/alemjimer/jenkins-pipeline.git'
    }
  }
  stage('Build') {
    dir('hallo') {
      sh 'mvn clean install'
    }
    echo 'Hallo'
    echo 'Halllllllo'
  }
  
  stage('Performance Test') {
    archive 'hallo'
    dir('hallo') {
      build job: 'tests-mvn-job'
    }
  }
}
