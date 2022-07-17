## What is Page Object Model ?
Well for my framework POM is a must and Helpful a design pattern in Selenium 
for to create complex framework reducing code duplication, easier to maintain, 
reusable and reliable and its more readable so good step for Gherkin lang, BDD integration to java code
How do we achieve?
I store all Webelements with their useful methods in each page classes.
PageFactory, we can construct our Webdriver which also useful for parallel execution
Under project configuration.properties stores credentials and environment Url 
under resource package I store my  test cases as feature files and my step definition
integrate gherkin language from feature files to java codes from my pages
we  also can store some utils
I store our timing listing windows handling method in BASE as a parent class,
and we inherit for each page class as child class with extends
I have class for reading our configuration with help of fileStream and properties method
I also have driver class to regulate my driver with ThreadLocal pool design allow me to run tests
parallel. And switch case method choose my browser type including headless mode.