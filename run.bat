set projectLocation=C:\Users\krush\eclipse-workspace\FrameWorks
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testSuite_using_classes.xml