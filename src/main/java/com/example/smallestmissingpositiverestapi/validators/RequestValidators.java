package com.example.smallestmissingpositiverestapi.validators;

import com.example.smallestmissingpositiverestapi.exceptions.BadRequestException;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class RequestValidators {


    /**
     * 1. List should not be null or empty
     * 2. List should contain at least 1 positive element else will throw exception
     * @param inputArray
     */
    public void validateInput(int[] inputArray) {

        if (inputArray == null || inputArray.length == 0) {
            throw new BadRequestException("Invalid input provided.");
        }
        boolean atLeastOnePositiveExist = Arrays.stream(inputArray)
                .anyMatch(elem -> elem > 0);
        if (!atLeastOnePositiveExist) {
            throw new BadRequestException("Input array should consist at least one positive number");
        }
    }

}
