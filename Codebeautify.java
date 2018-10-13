package com.example.kalikousik14.test2;

import java.sql.Struct;
import java.util.ArrayList;

public class Codebeautify {
    ArrayList < Object > route = new ArrayList < Object > ();
    Train TrainObject;
    private float debit;
    Current_station Current_stationObject;
    private String start_date;
    private String position;
    private float response_code;


    // Getter Methods

    public Train getTrain() {
        return TrainObject;
    }

    public float getDebit() {
        return debit;
    }

    public Current_station getCurrent_station() {
        return Current_stationObject;
    }

    public String getStart_date() {
        return start_date;
    }

    public String getPosition() {
        return position;
    }

    public float getResponse_code() {
        return response_code;
    }

    // Setter Methods

    public void setTrain(Train trainObject) {
        this.TrainObject = trainObject;
    }

    public void setDebit(float debit) {
        this.debit = debit;
    }

    public void setCurrent_station(Current_station current_stationObject) {
        this.Current_stationObject = current_stationObject;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setResponse_code(float response_code) {
        this.response_code = response_code;
    }
}
class Current_station {
    private String code;
    private float lng;
    private float lat;
    private String name;


    // Getter Methods

    public String getCode() {
        return code;
    }

    public float getLng() {
        return lng;
    }

    public float getLat() {
        return lat;
    }

    public String getName() {
        return name;
    }

    // Setter Methods

    public void setCode(String code) {
        this.code = code;
    }

    public void setLng(float lng) {
        this.lng = lng;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Train {
    ArrayList < Object > days = new ArrayList < Object > ();
    private String number;
    ArrayList < Object > classes = new ArrayList < Object > ();
    private String name;


    // Getter Methods

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    // Setter Methods

    public void setNumber(String number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }
}