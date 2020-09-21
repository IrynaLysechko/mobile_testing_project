package com.epam.utils;

import com.epam.entity.Message;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonReader {
    private static final String messageFilePath = "src\\main\\resources\\entity\\message.json";

    public static Message getMessage() {
        Message message = new Message();
        try {
            message = new ObjectMapper().readValue(new File(messageFilePath), Message.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return message;
    }
}
