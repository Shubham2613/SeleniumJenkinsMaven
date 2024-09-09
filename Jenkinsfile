pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Build done'
            }
        }
            stage('Test') {
            steps {
                echo 'Test Done'
            }
        }
    
            stage('Deploy') {
            steps {
                echo 'Deploy Done'
            }
        }
        
    
    }
    post{
        always{
            emailext body: 'Summary', subject: 'PipeLine Status', to: 'shubhambarje@nimapinfotech.com'
        }
    }
}
