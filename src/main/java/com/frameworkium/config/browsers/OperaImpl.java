package com.frameworkium.config.browsers;

import com.frameworkium.config.DriverType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

public class OperaImpl extends DriverType {

    @Override
    public DesiredCapabilities getDesiredCapabilities() {
        DesiredCapabilities capabilities = DesiredCapabilities.opera();
        capabilities.setCapability("opera.arguments", "-nowin -nomail");
        return capabilities;
    }

    @Override
    public WebDriver getWebDriverObject(DesiredCapabilities capabilities) {
        return new OperaDriver(capabilities);
    }

}
