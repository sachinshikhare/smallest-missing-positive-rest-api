package com.example.smallestmissingpositiverestapi.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FinderServiceTest {

    @Autowired
    private FinderService finderService;

    @Test
    void getSmallestMissingPositiveNumberTest_ValidInput() {
        int[] elements = new int[]{32,43,12,14,365,76873,232,4354,87,43,1,43,23,2,6,3,4,5,7,9,34,65,32,9};
        int result = finderService.getSmallestMissingPositiveNumber(elements);
        assertEquals(8, result);
    }

//    @Test
//    void getSmallestMissingPositiveNumber_TestWithRandomInputs() {
//        int cntr = 0;
//        while (cntr++ < 15 ) {
//            int[] elements = randomElementsArrayGenerator(-100, 100, 200);
//            List<Integer> ints = new ArrayList<>();
//            Arrays.stream(elements).forEach(ints::add);
//            Collections.sort(ints);
//            System.out.println(ints);
//            int result = finderService.getSmallestMissingPositiveNumber(elements);
//            System.out.println("result: " + result);
//            System.out.println("===================================================");
//            System.out.println();
//        }
//    }
//
//    public int[] randomElementsArrayGenerator(int min, int max, int count) {
//
//        // Create a random object
//        Random random = new Random();
//
//        // Generate a list of random numbers within the range
//        List<Integer> randomNumbers = new ArrayList<>();
//        int[] arr = new int[count];
//        for (int i = 0; i < count; i++) {
//            int randomNumber = random.nextInt(max - min + 1) + min;
//            arr[i] = randomNumber;
//        }
//        return arr;
//    }
}