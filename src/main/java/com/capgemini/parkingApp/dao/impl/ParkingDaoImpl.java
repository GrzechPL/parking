package com.capgemini.parkingApp.dao.impl;

import com.capgemini.parkingApp.dao.ParkingDao;
import com.capgemini.parkingApp.entity.ParkingEntity;
import org.springframework.stereotype.Repository;

@Repository
public class ParkingDaoImpl extends AbstractDao<ParkingEntity, Long> implements ParkingDao {
}
