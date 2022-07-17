##Explain your Cucumber BDD Framework Structure
I use cucumber BDD framework in my current job. Cucumber allows me 
to integrate my coding with Gherkin language so its make nontechnical friendly.
ALso, scenario cases with giving and then when annotations reducing the miss understanding of
testcase requirement.
    My project structured by Maven it is helping my 
dependency management, compiling as well as jenkins integration.
   Under my resource file i keep my feature which including 
my test cases and scenarios files and database sheet with 
log4j file

Under my project i keep my cofiguration  properties such 
as my url and login credentials

 My frame build most efficent way with POM. 
Under java i have my page file which includes page classes
with their Webelements also useful methods, design with 
encapsulation
under my step definiton there are classes build on gherkin 
lang to java codes for matching feature file steps 
Also my hook class allows me to regulate browser 
 before classes and failed screenshot and quiting driver after.

   My test runners under steprunner package an my test runner class includes
run with annotation from junit with cucumber class i have cucumber options
which defines my feature files path stepdef path, tags regulate my scenarios priority
and my plugins such as failed rerun, html,json reporter 

In my util package browser, configuration reader and Driver utils
  BASE utils extend as a base for my page clases its icludes my 
impilicit, explicit, fluent wait time and wait conditions, as well
as list methods for storing arrylists such as windows,frame
handles and switcher, also basic javascript for scroll and page
navigation.
 Inside configuration reader i design to path my properties
 to my java codes with help of filestream and properties method.
  inside driver util i store my Webdriver with threadLocal 
with pool desing its allowing me to run my test cases parallel
also my browser switches for different browser including headless
version.



