#!/usr/bin/env groovy

def call(body) {
    echo "Start Deployment"
    sh 'docker-compose up -d'
    echo "Deployed"
    currentBuild.result = 'SUCCESS' //or FAILURE
    return this
}
