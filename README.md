# Calculator-Tests

- This project demonstrates how to use Appium with TestNG to automate the testing of a simple Android Calculator application. The tests are written in Java and organized using the TestNG framework.
- The project uses Selenium Java version 3.141.59, Maven version 3.0.0-M5, TestNG version 7.8.0, and Appium Java-client version 7.0.0, all managed via the pom.xml file in Eclipse IDE.
- It runs on a physical device: a Samsung SM A145F with Android version 13.


## Table of Contents
- [Prerequisites](#prerequisites)
- [Setup](#setup)
  - [Install Appium](#install-appium)
  - [Install Android Studio](#install-android-studio)
  - [Clone the Repository](#clone-the-repository)
  - [Configure the Project](#configure-the-project)
- [Running the Tests](#running-the-tests)
  - [Using IDE](#using-ide)
  - [Using Maven](#using-maven)
- [Project Structure](#project-structure)
- [TestNG Reports](#TestNG-Reports)
 


## Prerequisites

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) (my version  17.0.8)
- [Maven](https://maven.apache.org/install.html)  
- [Android Studio](https://developer.android.com/studio)
- [Appium](http://appium.io/) (my version 7.0.0)


## Setup

### Install Appium

1. Install Appium via npm:

   ```sh
   npm install -g appium

2. Start the Appium server:
      ```sh
   appium

### Install Android Studio
1. Download and install Android Studio from the [official website](https://developer.android.com/studio)
2. Configure the Android SDK and ensure you have the necessary platform tools and SDKs installed.
3. Connect your physical Android device or start an Android Virtual Device (AVD) for testing.

### Clone the Repositor
1. Clone:

   ```sh
   git clone https://github.com/Yassmin-gamal/Calculator-Tests.git
   cd Calculator-Tests

### Configure the Project
1. Open the project in your preferred IDE (e.g., IntelliJ IDEA, Eclipse). ( i use Eclipse)
2. Ensure the testng.xml file is properly configured.
3. Update the BaseTest.java file with the correct path to your Calculator APK and device details.
   
   ```java(Java)
   
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "SM A145F"); 
        caps.setCapability(MobileCapabilityType.UDID, "RK8W5048BXB");
        caps.setCapability( MobileCapabilityType.PLATFORM_VERSION, "13.0");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        
        caps.setCapability("appPackage","com.sec.android.app.popupcalculator");
	caps.setCapability("appActivity","com.sec.android.app.popupcalculator.Calculator");

## Running the Tests

### Using IDE
   Open testng.xml in your IDE.
   Right-click on testng.xml and select "Run 'testng.xml'".

### Using Maven
1. Maven Test
   ```sh
   mvn test

## Project Structure

 encapsulate the elements in a separate class to improve the maintainability and readability of my code. This is often referred to as the Page Object Model (POM) pattern. 
 
1. POM Pattern of my Project :
   ```css
   Calculator-Tests
   ├── pom.xml
   ├── testng.xml
   ├── src
   │   ├── main
   │   │   └── java
   │   │       └── Android
   │   │           └── App
   │   │       
   │   └── test
   │       └── java
   │           └── Android
   │               └── APP
   │                   ├── tests
   │                   │   ├── AdditionTest.java
   │                   │   ├── SubtractionTest.java
   │                   │   └── MultiplicationTest.java
   │                   │   └── DivisionTest.java
   │                   │   └── PercentageTest.java
   │                   └── pages
   │                   │      └── CalculatorPage.java
   │                   │    
   │                   └── utils
   │                       └── BaseTest.java
   └── README.md


## TestNG Reports

- testing the basic operation involves opening App , Add to numbers , check result

  ![25](https://github.com/Yassmin-gamal/Calculator-Tests/assets/66153260/41086a8c-37b4-4d6a-95f7-69bc891fee06)
  ![26](https://github.com/Yassmin-gamal/Calculator-Tests/assets/66153260/be13fbc3-df18-4a17-8c34-0822b7ec5ac3)


