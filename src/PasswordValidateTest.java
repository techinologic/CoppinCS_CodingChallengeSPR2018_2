import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class PasswordValidateTest {

    Pattern testPattern;

    @Test
    @DisplayName("Jacksparrow1710 = valid")
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
    @DisplayName("jacksparrow = invalid")
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
    @DisplayName("JACKSPARROW1710 = invalid")
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
    @DisplayName("jacksparrow1710 = invalid")
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
    @DisplayName("JAmesBond007 = valid")
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
    @DisplayName("JAmesBond007 = 12 chars")
    void test6(){
        ArrayList<String> pass = new ArrayList<>();
        pass.add("JAmesBond007");
        assertEquals(12, pass.get(pass.size()-1).length(), "Assert password expire");
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName()
                + ":  Passed!");
    }

    @Test
    @DisplayName("23452345sdfgsdfgsdfgsdfgsfgsdfgjy656745hxdXbdsrwty34563456" +
            "345dsfgsdhdfhgmhnsdfbs = valid")
    void test7(){
        testPattern = Pattern.compile(PasswordValidate.PASSWORD_REQUIREMENTS);
        String password = "23452345sdfgsdfgsdfgsdfgsfgsdfgjy656745hxdXbdsrwty345" +
                "63456345dsfgsdhdfhgmhnsdfbs";
        Matcher matcher = testPattern.matcher(password);
        boolean result = matcher.matches();
        assertEquals(true, result, "Assert password valid");
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName()
                + ":  Passed!");
    }

    @Test
    @DisplayName("23452345sdfgsdfgsdfgsdfgsfgsdfgjy656745hxdXbdsrwty345" +
            "63456345dsfgsdhdfhgmhnsdfbs = 80 chars")
    void test8(){
        ArrayList<String> pass = new ArrayList<>();
        pass.add("23452345sdfgsdfgsdfgsdfgsfgsdfgjy656745hxdXbdsrwty3456345" +
                "6345dsfgsdhdfhgmhnsdfbs");
        assertEquals(80, pass.get(pass.size()-1).length(), "Assert password expire");
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName()
                + ":  Passed!");
    }



}