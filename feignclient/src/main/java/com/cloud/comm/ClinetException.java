package com.cloud.comm;

public class ClinetException extends Exception {

    int code ;

    String reson;
    public ClinetException(int code, String reson){

        this.code = code;
        this.reson = reson;
    }
}
