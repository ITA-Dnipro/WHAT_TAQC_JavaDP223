package constants;

public class Constants {

    public static final int IMPLISITLY_WAIT = 10;
    public static final int ELEMENT_WAIT = 5;

    public static final String COURSE_TITTLE_NAME = "Soft Skills for Lecturers";
    public static final String COURSE_NAME = "Course Name";

    public static final String AUTH_URL = "http://localhost:8080/auth",
                               REGISTRATION_URL = "http://localhost:8080/registration",
                               FORGOT_PASSWORD_URL = "http://localhost:8080/forgot-password";

    public interface testDataPaths {
         String dir = System.getProperty("basedir");
         String ADMIN_DATA_JSON = dir + "\\src\\main\\resources\\testData\\Admin.json",
                 MENTOR_DATA_JSON = dir + "\\src\\main\\resources\\testData\\Mentor.json",
                 SECRETARY_DATA_JSON = dir + "\\src\\main\\resources\\testData\\Secretary.json",
                 STUDENT_DATA_JSON = dir + "\\src\\main\\resources\\testData\\Student.json",
                 CREATED_USERS_DATA_JSON = dir + "\\src\\main\\resources\\testData\\CreatedUser.json",
                 INVALID_DATA_FIRST_NAME_FIELD_JSON = dir + "\\src\\main\\resources\\registration\\InvalidDataFirstName.json",
                 INVALID_DATA_LAST_NAME_FIELD_JSON = dir + "\\src\\main\\resources\\registration\\InvalidDataLastName.json",
                 INVALID_DATA_EMAIL_FIELD_JSON = dir + "\\src\\main\\resources\\registration\\InvalidDataEmail.json",
                 INVALID_DATA_PASSWORD_FIELD_JSON = dir + "\\src\\main\\resources\\registration\\InvalidDataPassword.json",
                 INVALID_DATA_PASSWORD_CONFIRM_FIELD_JSON = dir + "\\src\\main\\resources\\registration\\InvalidDataPasswordConfirm.json",
                 INVALID_DATA_EMAIL_LOGIN_FIELD_JSON = dir + "\\src\\main\\resources\\auth\\InvalidDataEmail.json",
                 INVALID_DATA_PASSWORD_LOGIN_FIELD_JSON = dir + "\\src\\main\\resources\\auth\\InvalidDataPassword.json";




    }

}
