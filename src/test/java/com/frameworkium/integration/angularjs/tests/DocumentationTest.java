package com.frameworkium.integration.angularjs.tests;

import com.frameworkium.core.common.retry.RetryFlakyTest;
import com.frameworkium.core.ui.tests.BaseUITest;
import com.frameworkium.integration.angularjs.pages.DeveloperGuidePage;
import io.qameta.allure.TmsLink;
import org.testng.annotations.Test;

import static com.google.common.truth.Truth.assertThat;

public class DocumentationTest extends BaseUITest {

    @Test(retryAnalyzer = RetryFlakyTest.class)
    @TmsLink("ANG-1")
    public void angular_documentation_test() {
        String guideTitle = DeveloperGuidePage.open()
                .searchDeveloperGuide("Bootstrap")
                .clickBootstrapSearchItem()
                .getGuideTitle();

        assertThat(guideTitle)
                .endsWith("Bootstrap");
    }

}
