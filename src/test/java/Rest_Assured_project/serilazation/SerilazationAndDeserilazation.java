package Rest_Assured_project.serilazation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;

public class SerilazationAndDeserilazation {


    @Test
    void serilazationMethod() throws JsonProcessingException {

        PojoClass pojaData = new PojoClass();

        pojaData.setName("hamid");
        pojaData.setLastName("Hamidi");
        pojaData.setClass_name("SDET");

        System.out.println(pojaData.getName() + "" + pojaData.getLastName() + "" + pojaData.getClass_name());

        ObjectMapper objectMapper = new ObjectMapper();

        String jsonFile = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(pojaData);
        System.out.println(jsonFile);

        String jsondata = "{\n" +
                "  \"name\" : \"hamid\",\n" +
                "  \"lastName\" : \"Hamidi\",\n" +
                "  \"class_name\" : \"SDET\"\n" +
                "}\n";

    }

    @Test
    void DeserilazationMethod() throws JsonProcessingException {


        ObjectMapper objectMapper = new ObjectMapper();

        String jsondata = "{\n" +
                "  \"name\" : \"hamid\",\n" +
                "  \"lastName\" : \"Hamidi\",\n" +
                "  \"class_name\" : \"SDET\"\n" +
                "}\n";

       PojoClass dataready = objectMapper.readValue(jsondata, PojoClass.class);

       System.out.println(dataready.getName());
        System.out.println(dataready.getLastName());
        System.out.println(dataready.getClass_name());
    }
}