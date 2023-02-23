package com.example.smallestmissingpositiverestapi.service;

import org.springframework.stereotype.Service;

@Service
public class FinderService {

    public Integer getSmallestMissingPositiveNumber(int[] elements) {

        int arrayLength = elements.length;
        int index = 0;
        while  (index < arrayLength) {
            if (elements[index] > 0 && elements[index] <= arrayLength && elements[elements[index] - 1] != elements[index]) {
                int temp = elements[elements[index] - 1];
                elements[elements[index] - 1] = elements[index];
                elements[index] = temp;
            } else {
                index += 1;
            }
        }

        for (index = 0; index < arrayLength; index++) {
            if (elements[index] != index + 1) {
                return index + 1;
            }
        }
        return arrayLength + 1;

    }
}
