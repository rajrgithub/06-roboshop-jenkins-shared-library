def testgroovyfun() {
    print 'function name should be mentioned'
    print 'test.testgroovyfun()'
    def abc = "test"
    def xyz = 79

    print "abc= ${abc}"
    print "xyz=${xyz}"

    print abc
}

def call() {
    print 'Call is default function called by default even if function name is NOT mentioned'
    print 'test()'
    def abc = "hello"
    def xyz = 10

    print "abc= ${abc}"
    print "xyz=${xyz}"

    print abc
}