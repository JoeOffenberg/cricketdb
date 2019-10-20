package com.jos.cricketdb;

import java.sql.Timestamp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jos.cricketdb.CricketData;


@Repository
public interface CricketDataRepository extends JpaRepository<CricketData, Timestamp>{

}