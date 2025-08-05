## Don't forget to give a :star: to make the project popular.

## :question: What is this Repository about?

- This repo contains automation tests for handling the _ElementClickInterceptedException_ using Selenium WebDriver 4.
- This repo uses Maven as build tool and TestNG testing framework to run the tests.
- The following websites have been used to demo out scenarios for handling the _ElementClickInterceptionException_ in
  multiple ways.
    - [LambdaTest.com](https://www.lambdatest.com)
    - [LambdaTest E-Commerce Demo Website](https://ecommerce-playground.lambdatest.io/)
    - [UITestingPlayground](http://www.uitestingplayground.com/overlapped)
    - [OWASP Juice Shop](https://juice-shop.herokuapp.com/#/)

## Examples covered in this repository for handling _Element Click Intercepted Exception_

1. Using Explicit waits in Selenium WebDriver
2. Using JavaScriptExecutor to click on the web element
3. Using JavaScriptExecutor with Scroll into view
4. Locating the overlay web element and clicking on it before clicking on actual web element that throws the exception.
5. Using Selenium WebDriver's _Actions_ class
6. Maximizing the browser window

Checkout [How to Handle ElementClickInterceptedException in Selenium Java](https://www.lambdatest.com/blog/elementclickinterceptedexception-in-selenium-java/)
for a detailed explanation.

## Running the Tests

By default, tests would be running on LambdaTest Platform using the `browser` value `remote-chrome`.
If you want to run it on your local machine, please update the `browser` value in `testng.xml` to
`chrome` or `firefox` and you should be able to run it in local chrome or firefox respectively.

- To run the test using `Maven` from command line use the following command:

  `mvn clean test -DLT_USERNAME=<LambdaTest username> -DLT_ACCESSKEY<LambdaTest access key>`

- To run the tests using `TestNG`:
    1. In the Run Configuration add the LambdaTest username and access key in the VM option as follows:
       `-DLT_USERNAME=<LambdaTest username> -DLT_ACCESSKEY<LambdaTest access key>`
    2. Right-click on the `testng.xml` file and select `Run '...\testng.xml'`

## :writing_hand: Blog Links

- [How to Handle StaleElementReferenceException in Selenium](https://medium.com/@iamfaisalkhatri/how-to-handle-staleelementreferenceexception-in-selenium-1947d8c11f71)
- [Handling “Element is Not Clickable at Point” Exception in Selenium](https://www.lambdatest.com/blog/element-is-not-clickable-at-point-exception/)

🧬 Need Assistance?

- Discuss your queries by writing to me @ `mohammadfaisalkhatri@gmail.com`
  OR ping me on any of the social media sites using the below link:
    - [Linktree](https://linktr.ee/faisalkhatri)

### :thought_balloon: Checkout the blogs related to Testing on [Medium](https://medium.com/@iamfaisalkhatri), [My Website](https://mfaisalkhatri.github.io) and [LambdaTest blogs](https://www.lambdatest.com/blog/author/mfaisalkhatri/)

### :bookmark: Checkout videos related to Software Testing and Test automation tools on [Testing Talks with Faisal Khatri](https://www.youtube.com/@faisalkhatriqa)