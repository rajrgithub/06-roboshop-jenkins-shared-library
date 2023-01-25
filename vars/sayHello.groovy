// vars/sayHello.groovy
def call(String name = 'human') {
    // Any valid steps can be called from this code, just like in other
    // Scripted Pipeline
    echo "Hello, ${name}."
}


/* Jenkins File

sayHello 'Joe'
sayHello() /* invoke with default arguments - No need to pass value takes default value*/
 */