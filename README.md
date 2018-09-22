# files-synchronizer
Application to synchronize a source directory to destination directory and copy/move any new/updated file(s) from source to destination

Run mvn clean install to build the project. Maven plugin would generate the fat jar that can be used to run CLI

**CLI Options**

*To Copy*

java -jar files-synchronizer-0.0.1-SNAPSHOT-jar-with-dependencies.jar -c {{src}} {{dest}}

*To Move*

java -jar files-synchronizer-0.0.1-SNAPSHOT-jar-with-dependencies.jar -m {{src}} {{dest}}
