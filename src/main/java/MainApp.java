import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class MainApp {
    public static void main(String args[]) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        Student student = objectMapper.readValue(new File("src/main/resources/input2.json"),
                Student.class);
        System.out.println(student);

        Student student1 = new Student(2, "Jaata", "Paata", false,
                new Address("23", "Badlapur", "Delhi"),
                new ArrayList<String>(Arrays.asList("English", "Hindi", "French")));
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        objectMapper.writeValue(new File("src/main/resources/output.json"), student1);
    }
}
