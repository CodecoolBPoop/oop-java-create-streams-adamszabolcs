package com.codecool;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.Stream.*;

public class Fibonacci implements Supplier{

    int firstNumber = 0;
    int secondNumber = 1;

    @Override
    public Object get() {
        Integer nextFibonacciNumber = firstNumber + secondNumber;
        firstNumber = secondNumber;
        secondNumber = nextFibonacciNumber;
        return nextFibonacciNumber;
    }
}
