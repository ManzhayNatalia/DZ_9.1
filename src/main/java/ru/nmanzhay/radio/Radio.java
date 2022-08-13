package ru.nmanzhay.radio;

public class Radio {
    private int radioId;
    private int volume;

    public int getRadioId() {
        return radioId;
    }

    public void next() {
        int chanel = radioId + 1;
        if (chanel > 9) {
            chanel = 0;
        }
        this.radioId = chanel;
    }

    public void prev() {
        int chanel = radioId - 1;
        if (chanel < 0) {
            chanel = 9;
        }
        this.radioId = chanel;
    }

    public void setRadioId(int radioId) {
        if (radioId < 0 || radioId > 9) {
            return;
        }
        this.radioId = radioId;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < 0 || volume > 10) {
            return;
        }
        this.volume = volume;
    }

    public void increaseVolume() {
        if (volume < 10) {
            volume = volume + 1;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }
}
