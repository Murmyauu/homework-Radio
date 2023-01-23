package ru.netology.hmradio.services;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int maxRadioStation;


    public Radio() {

        maxRadioStation = 10;
    }

    public Radio(int stationsSum) {
        maxRadioStation = stationsSum - 1;
    }

    public int getCurrentRadioStation() {

        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void next() {
        if (currentRadioStation != maxRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prev() {
        if (currentRadioStation != 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume != 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
        }
    }

    public void decreaseVolume() {
        if (currentVolume != 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }

}

