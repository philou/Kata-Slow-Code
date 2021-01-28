#!/usr/bin/groovy

pipeline {
    agent {
        node {
            label 'curves-dev'
            customWorkspace '/src/new/Kata-BowlingGame'
        }
    }

    options {
        disableConcurrentBuilds()
        buildDiscarder(logRotator(numToKeepStr: '5'))
    }

    environment {
//        SRC_DIR = "/src/new/${VERSION}"
//        GENOFF_DIR = "/genoff.new/${VERSION}"
        JAVA_HOME = "/usr/local/java/jdk-11.0.2"
//        SONAR = "http://ci-proc-tpm/sonar"
        MAVEN_HOME = "/nfs_tools/common/maven/maven-3.6.3-takari"
        MAVEN_OPTS = "-Xms1G -Xmx10G -XX:NewRatio=8"
        JAVA_LD_LIBRARY_PATH = "${JAVA_HOME}/lib/server"
        PYTHON_PATH="/opt/rh/python27/root/usr"
        PATH = "${PYTHON_PATH}:${PYTHON_PATH}/bin:${JAVA_HOME}/bin:${PATH}"
        LD_LIBRARY_PATH = "${PYTHON_PATH}/lib64:${LD_LIBRARY_PATH}"
//        DOC_DEPLOY_SERVER = "ci-proc-tpm"
//        DOC_MASTER_TARGET_FOLDER = "/var/www/html/documentation"
    }

    stages {
        stage('Gradle') {
            steps {
                script {
                    try {
                        sh '''
                            cd ./java
                            chmod +x ./gradlew && ./gradlew clean test --no-daemon
                        '''
                    } finally {
                        junit '**/build/test-results/test/*.xml'
                    }
                }
            }
        }

        stage('Maven') {
            steps {
                script {
                    try {
                        sh '''
                            cd ./java
                            ${MAVEN_HOME}/bin/mvn clean test
                        '''
                    } finally {
                        junit '**/build/test-results/test/*.xml'
                    }
                }
            }
        }

        stage('Cmake') {
            steps {
                sh '''
                    cd ./cpp
                    rm -rf ./build
                    source /opt/rh/devtoolset-8/enable
                    ./cpp_easy_setup.sh
                '''
            }
        }
    }
}
