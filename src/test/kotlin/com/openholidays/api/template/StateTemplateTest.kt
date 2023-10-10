package com.openholidays.api.template

import com.openholidays.api.dto.CreateStateDTO
import com.openholidays.api.entity.State

const val STATE_NAME = "SAO PAULO"
const val STATE_ABBREVIATION = "SP"
const val STATE_ID = 1

fun buildStateEntity(
    id: Int = STATE_ID,
    name: String = STATE_NAME,
    abbreviation: String = STATE_ABBREVIATION
) = State(
    id = id,
    name = name,
    abbreviation = abbreviation
)

fun buildCreateStateDTOMock(
    name: String = STATE_NAME,
    abbreviation: String = STATE_ABBREVIATION,
) = CreateStateDTO(
    name = name,
    abbreviation = abbreviation
)