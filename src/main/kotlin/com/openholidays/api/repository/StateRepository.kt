package com.openholidays.api.repository

import com.openholidays.api.entity.State
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface StateRepository : CrudRepository<State, Int>
