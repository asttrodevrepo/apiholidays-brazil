package com.openholidays.api.entity

import jakarta.persistence.*
import java.io.Serializable
import java.time.LocalDate

@Entity
class Holiday (
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    val id: Int,
    @Column(nullable = false)
    val name: String = "",
    @Column(nullable = false)
    val holidayDate: LocalDate,

    @ManyToOne
    @JoinColumn(name = "city_id")
    val city: City? = null,
    @ManyToOne
    @JoinColumn(name = "state_id")
    val state: State? = null,

): AuditModel(), Serializable