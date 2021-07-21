pipeline {
  agent any
  stages {
    stage("run app") {
      steps{
        echo 'docker-compose up -d'
      }
    }
  }
}                                                                         