// vars/buildPlugin.groovy
def call(Map config) {
    echo "Map function"
    echo "${config.name}"
}

/*
Jenkinsfile (Scripted Pipeline)
map name: 'git'

 */