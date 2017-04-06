
node (){
  
  stage('Build') {
    echo 'Hallo'
    echo 'Halllllllo'
  }
  
  stage('Performance Test') {
    job build: 'tests-mvn-job'
  }
}
