
node (){
  deleteDir()
  sh 'mkdir hallo'
  stage ('checkout') {
    dir('hallo') {
      git credentialsId: 'f2a8f3f0-db0f-4de5-b181-ab7e790dd42a', url: 'https://github.com/alemjimer/jenkins-pipeline.git'
    }
  }
  stage('Build') {
    echo 'Hallo'
    echo 'Halllllllo'
  }
  
  stage('Performance Test') {
    build job: 'tests-mvn-job'
  }
}
