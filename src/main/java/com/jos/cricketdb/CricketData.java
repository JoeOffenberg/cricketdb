package com.jos.cricketdb;

import java.sql.Timestamp;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "cricketdata")
public class CricketData {

@Id
@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
private Timestamp time;
private float temp;
private float dB;

public CricketData() {
	}

public CricketData(Timestamp time, float temp, float dB) {
    this.time = time;
    this.temp = temp;
    this.dB = dB;
	}

	public Timestamp getTime() {
	return time;	}
	
	public float getTemp() {
	return temp;
	}
	
	public float getDb() {
		return dB;
		}
	
	public void setAge(Timestamp time) {
        this.time = time;
    }
	
	public void setTemp(float temp) {
        this.temp = temp;
    }
	
	public void setdB(float dB) {
        this.dB = dB;
    }
	
	@Override
    public String toString() {
        return "User{" +
                ", time='" + time + '\'' +
                ", temp=" + temp +
                ", dB=" + dB +
                '}';
    }
	
	
	
	


}


