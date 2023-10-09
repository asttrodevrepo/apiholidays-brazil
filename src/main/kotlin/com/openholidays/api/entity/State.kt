package com.openholidays.api.entity

import jakarta.persistence.*
import java.io.Serializable

@Entity
class State(
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    val id: Int? = null,
    @Column(nullable = false)
    val name: String = "",
    @Column(nullable = false)
    val abbreviation: String = "",
): AuditModel(), Serializable