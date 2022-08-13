package ru.nmanzhay.radio;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void positiveSetRadio() {
        Radio radio = new Radio();
        radio.setRadioId(5);
        int expected = 5;
        int actual = radio.getRadioId();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void positiveSetRadioMin() {
        Radio radio = new Radio();
        radio.setRadioId(0);
        int expected = 0;
        int actual = radio.getRadioId();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void positiveSetRadioMax() {
        Radio radio = new Radio();
        radio.setRadioId(9);
        int expected = 9;
        int actual = radio.getRadioId();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void negativeSetRadioLow() {
        Radio radio = new Radio();
        radio.setRadioId(-1);
        int expected = 0;
        int actual = radio.getRadioId();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void negativeSetRadioHigh() {
        Radio radio = new Radio();
        radio.setRadioId(10);
        int expected = 0;
        int actual = radio.getRadioId();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void positiveNextRadioMin() {
        Radio radio = new Radio();
        radio.next();
        int expected = 1;
        int actual = radio.getRadioId();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void positiveNextRadioMax() {
        Radio radio = new Radio();
        radio.setRadioId(9);
        radio.next();
        int expected = 0;
        int actual = radio.getRadioId();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void positiveNextRadioMain() {
        Radio radio = new Radio();
        radio.setRadioId(6);
        radio.next();
        int expected = 7;
        int actual = radio.getRadioId();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void positivePrevRadioMin() {
        Radio radio = new Radio();
        radio.prev();
        int expected = 9;
        int actual = radio.getRadioId();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void positivePrevRadioMain() {
        Radio radio = new Radio();
        radio.setRadioId(6);
        radio.prev();
        int expected = 5;
        int actual = radio.getRadioId();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void zeroGetVolume() {
        Radio radio = new Radio();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void positiveSetVolumeMain() {
        Radio radio = new Radio();
        radio.setVolume(8);
        int expected = 8;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void positiveSetVolumeMax() {
        Radio radio = new Radio();
        radio.setVolume(11);
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void positiveSetVolumeMin() {
        Radio radio = new Radio();
        radio.setVolume(-1);
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void positiveIncreaseVolumeMin() {
        Radio radio = new Radio();
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void positiveIncreaseVolumeMax() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void positiveDecreaseVolumeMin() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void positiveDecreaseVolumeMax() {
        Radio radio = new Radio();
        radio.setVolume(4);
        radio.decreaseVolume();
        int expected = 3;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
}
