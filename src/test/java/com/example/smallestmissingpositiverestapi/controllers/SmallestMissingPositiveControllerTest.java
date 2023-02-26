package com.example.smallestmissingpositiverestapi.controllers;

import com.example.smallestmissingpositiverestapi.exceptions.BadRequestException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SmallestMissingPositiveControllerTest {

    @Autowired
    private SmallestMissingPositiveController controller;

    @Test
    void getSmallestMissingPositiveNumber_ValidInput() {
        int result = controller.getSmallestMissingPositiveNumber(new int[]{-3, -2-0,1,2,3,5}).getBody();
        assertEquals(4, result);
    }

    @Test
    void getSmallestMissingPositiveNumber_InvalidRequest() {
        BadRequestException exception = assertThrows(BadRequestException.class, () -> controller.getSmallestMissingPositiveNumber(new int[0]));
        assertEquals("Invalid input provided.", exception.getMessage());
    }

    @Test
    void getSmallestMissingPositiveNumber_InvalidRequest2() {
        BadRequestException exception = assertThrows(BadRequestException.class, () -> controller.getSmallestMissingPositiveNumber(new int[]{-3,-5,0,-66}));
        assertEquals("Input array should consist at least one positive number", exception.getMessage());
    }
}