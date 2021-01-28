# sql-encoding-problem
Example of an SQL charset encoding problem found with Eclipse and Maven.

To reproduce the problem in Eclipse (actually, Spring Tool Suite 4):

 - Run SqlEncodingApplicationTests with Run As -> JUnit Test.
 - The test passes.
 - On the pom.xml, Run As -> Maven Test.
 - The test fails on non-ascii characters (éßþŭ).

See [stackoverflow post](https://stackoverflow.com/questions/65885856/encoding-issue-with-data-sql-in-spring-boot-with-maven).

A solution is to add the following lines in the `<plugins/>` of the `pom.xml` file.

	<plugin>
		<groupId>org.apache.maven.plugins</groupId>
		<artifactId>maven-surefire-plugin</artifactId>
		<configuration>
			<argLine>-Dfile.encoding=UTF-8</argLine>
		</configuration>
	</plugin>