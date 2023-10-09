package com.openholidays.api.entity

import jakarta.persistence.*
import java.io.Serializable

@Entity
class City (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    @Column(nullable = false)
    val name: String,

    @ManyToOne
    @JoinColumn(name = "state_id")
    val state: State? = null,
): AuditModel(), Serializable


