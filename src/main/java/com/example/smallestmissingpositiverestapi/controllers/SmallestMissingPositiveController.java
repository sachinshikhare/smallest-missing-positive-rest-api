package com.example.smallestmissingpositiverestapi.controllers;

import com.example.smallestmissingpositiverestapi.service.FinderService;
import com.example.smallestmissingpositiverestapi.validators.RequestValidators;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/smallest-missing-positive")
@CrossOrigin(origins = "http://localhost:3000")
public class SmallestMissingPositiveController {

    @Autowired
    private FinderService finderService;

    @Autowired
    private RequestValidators requestValidators;

    @PostMapping
    public ResponseEntity<Integer> getSmallestMissingPositiveNumber(@RequestBody int[] inputArray) {
        requestValidators.validateInput(inputArray);
        Integer result = finderService.getSmallestMissingPositiveNumber(inputArray);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }


}
