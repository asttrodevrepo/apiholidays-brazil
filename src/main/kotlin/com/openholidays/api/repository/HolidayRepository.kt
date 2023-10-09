package com.openholidays.api.repository

import com.openholidays.api.entity.Holiday
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface HolidayRepository : CrudRepository<Holiday, Int>
