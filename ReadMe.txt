Belley Rani Bala - selenium + JUnit 5 testing of moo.com

This is a maven project. You need JDK8 to run it. The included chromedriver.exe works only on Windows

When you have your maven ready run:
mvn clean package

if you don't have maven ready, you can try the included maven using:
mvnw clean package

That will execute all tests inside of the framework.
I run my test from IntelliJ comunity edition on Windows.

In case you would like to use different chrome driver, please change the details in the com.example.moo.Launcher class.
