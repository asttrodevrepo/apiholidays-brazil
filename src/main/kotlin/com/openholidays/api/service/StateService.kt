package com.openholidays.api.service

import com.openholidays.api.dto.CreateStateDTO
import com.openholidays.api.dto.ResponseStateDTO
import com.openholidays.api.entity.State
import com.openholidays.api.repository.StateRepository
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class StateService(
    private val stateRepository: StateRepository
) {

    private val logger = LoggerFactory.getLogger(this::class.java)

    fun create(createStateDTO: CreateStateDTO): ResponseStateDTO {
        logger.info("creating state ${createStateDTO.name}")
        val stateCreated = stateRepository.save(createStateDTO.toEntity())
        logger.info("state created ${stateCreated.id}")
        return stateCreated.toResponse()
    }

    private fun CreateStateDTO.toEntity() = State(
        name = this.name,
        abbreviation = this.abbreviation
    )

    private fun State.toResponse() = ResponseStateDTO(
        id = this.id?: 0,
        name = this.name,
        abbreviation = this.abbreviation
    )

}