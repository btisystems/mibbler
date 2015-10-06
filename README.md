# mibbler

## Gradle quick builds
The Gradle Daemon is a background process that does the heavy lifting of running builds, 
then stays alive between builds waiting for the next build. 
This allows data and code that is likely to be required in the next build to be kept in memory, ready to go. 
This dramatically improves the performance of subsequent builds. 
Enabling the Gradle Daemon is an extremely cheap way to decrease build times. 

[Gradle Daemon](https://docs.gradle.org/current/userguide/gradle_daemon.html)


## Building
To build the entire project, you should run the following in the root of the checkout.

    ./gradlew build

This will compile all the code, generate all the documentation and run all the tests. 

## Running
To run the application, ensure that it is built and execute the binary with the appropriate arguments

    ./gradlew -q clean fatjar; java -jar build/libs/mibbler-all*.jar
    
This will hide the gradle output and run the application.