# Spring Boot Oracle Example

* To run this example you will need to download and install the Oracle JDBC driver 6(ojdbc6.jar) from Oracle website for
  Oracle 11g or Oracle JDBC driver 7(ojdbc7.jar) for Oracle 12c.
* You can install the Oracle Jar into your local Maven repsository by opening terminal, going to the folder where you have downloaded the
  jar and using this below command:

  mvn install:install-file -Dfile=ojdbc6.jar -DgroupId=com.oracle -DartifactId=ojdbc6 -Dversion=11.2.0 -Dpackaging=jar
