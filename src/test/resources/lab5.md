##Explain your Cucumber BDD Framework Structure

In my current job I created a well-structured cucumber BDD framework which allows 
me to integrate my coding with Gherkin language. so it makes nontechnical friendly.
Also, scenario cases with giving and then when annotations reduce the miss
understanding of test case requirements.
If I want to go into technical details.
My project is structured by Maven it is helping to manage dependency and plugins,
compiling as well as Jenkins integration.
Also, under my project
JenkinsFile script for ci,cd pipeline integration
ConfigurationProperties where I keep my credentials and environment URL
database sheets for the backend
gitignore to eliminate files that I don't want in remote repository
log4j for regulating my logs
target for my logs report with screenshot attachments
Under my resource package feature files including my test cases and scenarios 
created with gherkin lang given when then annotations

My frame build efficient way with POM.
Under my page package, I have page classes with
for each application page such as login home etc.
Inside the page classes, Webelements created with Findby annotation 
and useful methods, designed with encapsulation
I construct myDriver with PageFactory
under my stepDefinition there are classes that integrate gherkin lang from feature files
with matching steps to java codes from page classes creating object and calling methods.
Not much coding nontechnical friendly readable.
Hook class before annotation to set browser and after annotation failed screenshot, closed river.

My test runners class under step-runner package. Test runner class includes
run with annotation from junit with cucumber class I have cucumber options
which defines my feature files path step-definition path, tags regulate my suites 
such as smoke and regression.
and my plugins like failed rerun, html,json reporter

In my util package
BASE utils extend as a base for my page classes its includes my
implicit, explicit, fluent wait time and wait conditions, as well
as list methods for storing arraylists such as windows,frame handles and switch,
also basic javascript for scroll and page
inside driver util i store my Webdriver with threadLocal pool design It's 
allowing me to run my test cases parallel
also my browser switches for different browser including headless
version.

I have class for reading configuration
with method to path my properties to my java codes with help of filestream and properties method.



