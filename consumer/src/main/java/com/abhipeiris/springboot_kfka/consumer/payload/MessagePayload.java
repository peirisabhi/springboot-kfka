package com.abhipeiris.springboot_kfka.consumer.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by Intellij.
 * Author: Abhishek Peiris
 * Date: 05/07/2023
 * Time: 13:27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessagePayload implements Serializable {

    private int id;
    private String message;

    @Override
    public String toString() {
        return "MessagePayload{" +
                "id=" + id +
                ", message='" + message + '\'' +
                '}';
    }
}
