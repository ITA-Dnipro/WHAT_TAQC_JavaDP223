package auth;

import base.BaseTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import steps.auth.AuthPageSteps;
import steps.myProfile.MyProfilePageSteps;

public class ValidDataUserLoginTest extends BaseTest {


    @Test
    public void verifyUserCanLogin() {

        authPageSteps
                .openWhatProjectApp()
                .checkAuthUrlIslCorrectly(driver)
                .checkAuthFormIsRendered()
                .checkEmailFieldIsEmpty()
                .fillEmailFieldWithData(user.getEmail())
                .checkPasswordFieldIsEmpty()
                .fillPasswordFieldWithData(user.getPassword())
                .checkThatButtonSignInIsEnabled()
                .clickSignInButton()
                .clickMyProfileIcon(driver, MyProfilePageSteps.class)
                .checkThatUserLoggedByEmail(user.getEmail())
                .clickDropdownProfile()
                .clickLogOut(driver, AuthPageSteps.class)
                .checkAuthUrlIslCorrectly(driver);
    }
}
