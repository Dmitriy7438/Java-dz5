package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void СountSqrNumbersPositiveLimit() {
        SQRService service = new SQRService();

        int actual = service.countSqrNumbers(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void СountSqrNumbersNegativeLimit() {
        SQRService service = new SQRService();

        int actual = service.countSqrNumbers(-200, 300);
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }
}
