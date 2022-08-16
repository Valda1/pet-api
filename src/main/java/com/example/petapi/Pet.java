package com.example.petapi;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Pet {

    private int petID;
    private String petName;
    private String type;
    private int age;
    private String ownerName;


}
