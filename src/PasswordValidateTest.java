import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class PasswordValidateTest {

    Pattern testPattern;

    @Test
    void test1(){
        testPattern = Pattern.compile(PasswordValidate.PASSWORD_REQUIREMENTS);
        String password = "Jacksparrow1710";
        Matcher matcher = testPattern.matcher(password);
        boolean result = matcher.matches();
        assertEquals(true, result, "Assert password valid");
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName()
                + ":  Passed!");
    }

    @Test
    void test2(){
        testPattern = Pattern.compile(PasswordValidate.PASSWORD_REQUIREMENTS);
        String password = "jacksparrow";
        Matcher matcher = testPattern.matcher(password);
        boolean result = matcher.matches();
        assertEquals(false, result, "Assert password invalid");
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName()
                + ":  Passed!");
    }

    @Test
    void test3(){
        testPattern = Pattern.compile(PasswordValidate.PASSWORD_REQUIREMENTS);
        String password = "JACKSPARROW1710";
        Matcher matcher = testPattern.matcher(password);
        boolean result = matcher.matches();
        assertEquals(false, result, "Assert password invalid");
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName()
                + ":  Passed!");
    }

    @Test
    void test4(){
        testPattern = Pattern.compile(PasswordValidate.PASSWORD_REQUIREMENTS);
        String password = "jacksparrow1710";
        Matcher matcher = testPattern.matcher(password);
        boolean result = matcher.matches();
        assertEquals(false, result, "Assert password invalid");
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName()
                + ":  Passed!");
    }

    @Test
    void test5(){
        testPattern = Pattern.compile(PasswordValidate.PASSWORD_REQUIREMENTS);
        String password = "JAmesBond007";
        Matcher matcher = testPattern.matcher(password);
        boolean result = matcher.matches();
        assertEquals(true, result, "Assert password valid");
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName()
                + ":  Passed!");
    }

    @Test
    void test6(){
        ArrayList<String> pass = new ArrayList<>();
        pass.add("JAmesBond007");
        assertEquals(12, pass.get(pass.size()-1).length(), "Assert password expire");
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName()
                + ":  Passed!");
    }


}