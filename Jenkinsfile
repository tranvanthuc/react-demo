#!/usr/bin/env groovy


def helper

pipeline {
    agent {
        docker { image 'node:19-alpine3.15' }
    }

    stages {
        stage('Init') {
            steps {
                script {
                    helper = load "helper.groovy"
                }
            }
        }
        stage('Lint') {
            steps {
                script {
                    helper.test()
                }
            }
        }
        stage('Build') {
            steps {
                script {
                    helper.build()
                }
            }
        }
        stage('Deploy') {
            steps {
                script {
                    helper.deploy()
                }
            }
        }
    }

    post {
        always {
            echo 'One way or another, I have finished'
            deleteDir() /* clean up our workspace */
        }
        success {
            echo 'I succeeded!'
        }
        unstable {
            echo 'I am unstable :/'
        }
        failure {
            echo 'I failed :('
        }
        changed {
            echo 'Things were different before...'
        }
    }
}
