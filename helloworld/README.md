# Sample Project for generating code from a MIB
This project provide a sample maven build that can be used by third parties to generate code from SNMP mibs.

## Project Dependencies 
The primary dependencies in the POM are 

* The [autogen](https://oss.sonatype.org/#nexus-search;quick~mibbler) jar file
* The [snmp-core](https://oss.sonatype.org/#nexus-search;quick~snmp-core) jar file
* The [commons-lang](http://mvnrepository.com/artifact/commons-lang/commons-lang/2.6) jar file

## The Default Configuration File
The primary configuration [file](./src/main/resources/defaultConfiguration.xml) is used ..

## The location of the MIBs
The default location for the mibs is [src/main/resources/mibs](./src/main/resources/mibs).

## Hello World Sample
This sample is standalone from the Mibbler project, it downloads its snapshot jars from from OSS and release jars from 
Maven Central.

