package Rest_Assured_project;

import java.util.Random;

public class UtilityClass {
    public static String randomEmail(){
        return ("tekSchool"+ (int)(Math.random()*4555)+"@gmail.com");
    }

    public static String randomUserName(){
        return ("tekSchool"+ (int)(Math.random()*45559));
    }
}
