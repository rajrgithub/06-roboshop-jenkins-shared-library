def info(message) {
    echo "INFO: ${message}"
}

def warning(message) {
    echo "WARNING: ${message}"
}

def call(String message = 'human') {
    // Any valid steps can be called from this code, just like in other
    // Scripted Pipeline
    echo "Hello, ${message}."
}

/*

@Library('roboshop') _

log.info 'Starting'
log.info('Starting')
log.warning 'Nothing to do!'

log()
log('Hello')
 */