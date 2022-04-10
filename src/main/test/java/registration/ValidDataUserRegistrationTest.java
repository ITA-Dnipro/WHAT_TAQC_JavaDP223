package registration;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.registration.validDataForRegistration.ValidStaticProvider;
import steps.registration.RegistrationPageSteps;

public class ValidDataUserRegistrationTest extends BaseTest {

    @Test (dataProviderClass = ValidStaticProvider.class, dataProvider = "create")
    public void verifyPossibilityRegistration(String name, String sureName, String email, String password, String confPassword) {

        authPageSteps
                .openWhatProjectApp()
                .checkAuthUrlIslCorrectly(driver)
                .clickRegistrationLink(driver, RegistrationPageSteps.class)
                .waitRegistrationFormIsRendered()
                .checkRegistrationUrlIslCorrectly(driver)
                .checkFirstNameFieldIsEmpty()
                .fillFirstNameField(name)
                .checkLastNameFieldIsEmpty()
                .fillLastNameField(sureName)
                .checkEmailAddressFieldIsEmpty()
                .fillEmailAddressFieldWithData(email)
                .checkPasswordFieldIsEmpty()
                .fillPasswordFieldFieldWithData(password)
                .checkConfirmPasswordFieldIsEmpty()
                .fillConfirmPasswordFieldFieldWithData(confPassword)
                .checkThatButtonSignUpIsEnabled()
                .clickButtonSignUp()
                .checkRegisterSuccessMessage()
                .checkRegisterSuccessText();
    }
}
