package com.openholidays.api.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.io.Serializable

@Entity
class State(
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private val id: Int,
    private val name: String = "",
    private val abbreviation: String = "",
): AuditModel(), Serializable