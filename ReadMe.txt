Please follow below steps to use application

1) Make sure you have jdk version 8 installed.
2) Download and execute emailchecker.jar file on command line using this command "java -jar /path_to_the_jar/emailchecker.jar"
3) Once you see "Started EmailChecker in x.xxxx seconds" command means your webservice is up and running.
4) Then you can send your email list in JSON format to the webservice using some tool like postman
   Sample JSON input {"values":["test.email+spam@gmail.com", "test.email@gmail.com", "testemail@gmail.com","test.email++spam@gmail.com","test.email+@yahoo.com"]}
   Make sure you use Get method to send above request and set header Content-Type to application/json
5) Once you send request you should get back String response representing the number of unique emails.
   For above sample input response would be "Number of unique email entries = 2"

Note: Since SpringBoot is used to develop the webservice, we can run this as a standalone java application as tomcat container is embedded within it.
      Also please go through snaps in snapshot folder if more info is needed to execute webservice and test it.



