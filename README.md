# jvm-oom

Simple OutOfMemoryError-causing project for JVM Internals classes

OutOfMemoryError is generated over time while appending more and more arrays to the list of arrays.

`while (true) { list.add(sth) }`

## running the project

`mvn compile exec:java`