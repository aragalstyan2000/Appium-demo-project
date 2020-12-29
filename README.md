# What's in this repository?

This repository contains a demo Appium Test Suite written in Java that runs a few simple tests on Android app.
The main goal is to show the technique of Appium testing, and the structure of Appium project.

## System Requirements

* Mac OSX or Windows or Linux
* Android SDK ≥ 16

## Setting up

You need to have Appium, Appium-doctor, Maven installed. Here are some helpful links to help you get the necessary tools installed.
* http://appium.io/
* https://github.com/appium/appium-doctor
* https://maven.apache.org/install.html

When you have the tools installed run the ```appium-doctor``` command to check that all the necessary dependencies are installed.
This is  how the results of the appium-doctor check should look like.
![Appium Doctor Screenshot](https://www.linkpicture.com/q/appium-doctor.png)

## Running the tests
In ```AppiumController.java``` file configure the device info accordingly to your device info.
```
   capabilities.setCapability("deviceName", "Your device name");
   capabilities.setCapability("platformVersion", "Your device android version");
   capabilities.setCapability("udid", "Your device udid");
```
* connect your device with ADB to your computer
* run ```appium``` command to run the Appium server
* ```cd``` to the root repository of the project
* run ```mvn test``` command
