package com.openholidays.api.entity

import jakarta.persistence.Column
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
    @Column(nullable = false)
    private val name: String = "",
    @Column(nullable = false)
    private val abbreviation: String = "",
): AuditModel(), Serializable