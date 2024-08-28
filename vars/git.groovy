

def buildContainer(env) {
    echo "build number : ${env.BUILD_NUMBER}"
    
    // Execute shell commands
    sh """
        docker build -t my-vue:${env.BUILD_NUMBER} .
        docker image ls
    """
    
    // Continue with other steps if needed
}

// Return the method to be accessible in the pipeline
return this
