package com.capgemini.parkingApp.dao;

import java.io.Serializable;
import java.util.List;

public interface Dao<T, K extends Serializable> {
    T getOne(K id);
}