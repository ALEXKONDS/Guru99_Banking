# Guru99_banking
Guru99 Live Selenium Webdriver Testing Project

📝 Project Summary:
- This is a demo project provided by Guru99. It simulates Selenium WebDriver test cases for a demo banking website every 24hs for 7 days. Uploading each test case to GitHub as part of my portfolio as a tester.

📆 Tasks:
- Each daily task is uploaded in the tasks folder as a .png file

💼 Evidence:
- While not required for the project, screenshot evidence is included in the evidence folder, sorted by day


-----

🕒 Day 1:

Hi Fellow Tester,
 
You are the Selenium automation engineer assigned to test the esteemed "Guru99 Bank" project.
Here is a link to the AUT - http://www.demo.guru99.com/V4/
The following test case needs to be automated -

SR#:
- SS1

Test Scenario:
- Verify the login section

Test Cases:
- Enter valid User ID & Password

Test Steps:
1. Go to http://www.demo.guru99.com/v4/
2. Enter valid User ID
3. Enter valid Password
4. Click login

Test Data:
- User ID
- Password

Expected Result:
1. Login successful

The client has requested you to use WebDriver (Firefox Driver) for the project. Go ahead and record the script in Webdriver.

-----

🕒 Day 2:

Hey there,
There is a major flaw in the test case we created. There is no verification step.The script is no-good if it cannot produce Pass & Fail Status. Go ahead and modify the script

SR#:
- SS1

Test Scenario:
- Verify the login section

Test Cases:
- Enter valid User ID & Password

Test Steps:
1. Go to http://www.demo.guru99.com/v4/
2. Enter valid User ID
3. Enter valid Password
4. Click login
5. Verify the output

Test Data:
- User ID
- Password

Expected Result:
1. Login successful
2. Verify title of the homepage

But WAIT!

There is another major flaw. The script is a rookie script & in not production ready. Here is how you can make the script production ready

- The code to setup and launch WebDriver (Firefox) should be improved to include Location   Firefox.exe    and a Firefox Profile must be created.
- The amount of time the driver should wait when searching for a GUI element should be specified
- The code to setup and launch Firefox should be created as a separate method.
- All script initialization parameters like Location of Firefox , Base URL, User Name , Password etc should be stored in separate file say Util.java.  This helps in easy maintenance of scrip

-----

🕒 Day 3:

Hi Fellow Geek, 
The client has enhanced the test scenario to include more test cases

SR#:
- SS1
- SS2
- SS3
- SS4

Test Scenario:
- Verify the login section

Test Cases:
- Enter valid User ID & Password
- Enter invalid User ID & valid Password
- Enter valid User ID & invalid Password
- Enter invalid User ID & invalid Password

Test Steps:
1. Go to http://www.demo.guru99.com/v4/
2. Enter valid User ID
3. Enter valid Password
4. Click login
5. Verify the output

Test Data:
- User ID
- Password

Expected Result:
1. Login successful
2. Verify title of the homepage
- or
1. A pop-up "User or Password is not valid" is shown

One approach to automate this is to record separate script for all the above test cases. But this defeats the very purpose of automation.
The best technique to automate the above test suite  is to parametrize the script.
The most famous tool store data for parametrization is MS Excel.
Go ahead and create a script to read test-data from an Excel and execute Webdriver test cases.

-----

🕒 Day 4:

Hi,
 
The client is happy with the work you have been doing so far, but he is not happy with the Test Results generated. The test results are not user friendly.
He wants you to use TestNg which has better Test reporting format. Go ahead and create the same script using TestNg
