package com.openholidays.api.repository

import com.openholidays.api.entity.City
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CityRepository : CrudRepository<City, Int>
