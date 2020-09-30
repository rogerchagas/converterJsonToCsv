package com.lawn.starter.exercise;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import org.junit.Before;
import org.junit.Test;
import java.io.File;
import java.io.IOException;

public class ConverterTest {

    private File csvFromJson;

    @Before
    public void before(){

        csvFromJson = new File("src/main/resources/sample.csv");
    }


    @Test
    public void givenJsonInput_thenWriteCsv() throws JsonParseException, JsonMappingException, IOException {
        ConverterJsonToCsv.JsonToCsv(new File("src/main/resources/sample.json"), csvFromJson);
    }
}
