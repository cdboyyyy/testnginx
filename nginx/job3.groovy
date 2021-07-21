pipeline {
  agent any
  stages {
    stage("run app") {
      steps{
        sh 'docker-compose up -d'
      }
    }
  }
}                                                                         