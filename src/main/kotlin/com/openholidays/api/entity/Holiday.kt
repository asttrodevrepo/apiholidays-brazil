package com.openholidays.api.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import java.io.Serializable
import java.time.LocalDate

@Entity
class Holiday (
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private val id: Int,
    @Column(nullable = false)
    private val name: String = "",
    @Column(nullable = false)
    private val holidayDate: LocalDate,

    @ManyToOne
    @JoinColumn(name = "city_id")
    private val city: City? = null,
    @ManyToOne
    @JoinColumn(name = "state_id")
    private val state: State? = null,

): AuditModel(), Serializable