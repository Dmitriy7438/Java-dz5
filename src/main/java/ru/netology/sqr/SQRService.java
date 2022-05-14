package ru.netology.sqr;

public class SQRService {

    public int countSqrNumbers(int min, int max) {

        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int x = i * i;
            if (x < max && x > min) {
                count++;
            }
        }
        return count;
    }

}
