package com.zetcode.service;

import com.zetcode.bean.City;
import java.util.List;

public interface ICityService {

    public List<City> findAll();
}