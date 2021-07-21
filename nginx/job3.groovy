pipeline {
  agent any
  stages {
    stage("run app") {
      steps{
        docker-compose up -d
      }
    }
  }
}                                                                         