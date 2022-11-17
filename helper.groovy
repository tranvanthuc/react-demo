

def test() {
    try {
        sh 'npm i'
        sh 'npm run test'
    } catch (e) {
        echo 'Test failed'
        sh 'exit 1'
    }
}

def build() {
    try {
        echo 'Building...'
        sh 'npm run build'
    } catch (e) {
        echo 'Build failed'
        sh 'exit 1'
    }
}

def deploy() {
    try {
        echo 'Deploying...'
    } catch (e) {
        echo 'Deploy failed'
        sh 'exit 1'
    }
}

return this