package ru.nmanzhay.radio;

public class Radio {
    private int radioId;
    private int volume;
    private int countChanel = 10;
    private int  volumeMin=0;
    private int volumeMax=100;

    public Radio() {
    }

    public Radio(int countChanel) {
        this.countChanel = countChanel;
    }


    public int getRadioId() {
        return radioId;
    }

    public void next() {
        int chanel = radioId + 1;
        if (chanel > countChanel-1) {
            chanel = 0;
        }
        this.radioId = chanel;
    }

    public void prev() {
        int chanel = radioId - 1;
        if (chanel < 0) {
            chanel = countChanel-1;
        }
        this.radioId = chanel;
    }

    public void setRadioId(int radioId) {
        if (radioId < 0 || radioId >countChanel-1 ) {
            return;
        }
        this.radioId = radioId;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < volumeMin || volume > volumeMax) {
            return;
        }
        this.volume = volume;
    }

    public void increaseVolume() {
        if (volume < volumeMax) {
            volume = volume + 1;
        }
    }

    public void decreaseVolume() {
        if (volume > volumeMin) {
            volume = volume - 1;
        }
    }
}
