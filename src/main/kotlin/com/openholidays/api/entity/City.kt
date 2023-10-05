package com.openholidays.api.entity

import jakarta.persistence.*
import java.io.Serializable

@Entity
class City (

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private val id: Int,
    private val name: String,

    @ManyToOne
    @JoinColumn(name = "state_id")
    private val state: State? = null,
): AuditModel(), Serializable


