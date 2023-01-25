// vars/buildPlugin.groovy
def call(Map config) {
    print 'Map function'
    print '${config.name}'
}

/*
Jenkinsfile (Scripted Pipeline)
map name: 'git'

 */