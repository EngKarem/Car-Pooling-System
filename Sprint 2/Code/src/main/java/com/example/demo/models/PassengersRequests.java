package com.example.demo.models;

import java.time.LocalTime ;

public class PassengersRequests {

    int RequestNum, PassengerNum;
    String PassengerName,SrcName,DestName;
    public LocalTime  time;
    static int ReqNum = 0;
    String Stat;
    public PassengersRequests(int PassengerNum,String PassengerName,String SrcName, String DestName) {
        this.PassengerNum = PassengerNum;
        this.RequestNum = ++ReqNum;
        this.PassengerName = PassengerName;
        this.SrcName = SrcName;
        this.DestName = DestName;
        this.Stat = "Waiting";
        time = LocalTime.now();

    }

    public String getPassengerName()
    {
        return PassengerName;
    }

    public int getPassengerNum()
    {
        return PassengerNum;
    }

    public String getSrcName()
    {
        return SrcName;
    }

    public String getDestName()
    {
        return DestName;
    }

    public void setStat(String Stat)
    {
        this.Stat = Stat;
    }
    public String getStat()
    {
        return Stat;
    }

    @Override
    public String toString(){

        return
                "Request Num: "+ RequestNum +
                        "\n============================"+
                        "\nPassenger numbers: " + PassengerNum +
                        "\nPassenger Name: " + PassengerName + "\nSource: " + SrcName+
                        "\nDestination: " +DestName+
                        "\nRequest Time: " +time;
    }


}