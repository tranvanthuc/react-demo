pipeline {
    agent {
      docker { image 'node:19-alpine3.15' }
    }

    stages {
        stage('Lint') {
          steps {
            sh 'npm i'
            sh 'npm run test'
          }
        }
        stage('Build') {
            steps {
                echo 'Building...'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
            }
        }
    }
}
