package com.openholidays.api.resource

import com.openholidays.api.dto.CreateStateDTO
import com.openholidays.api.dto.ResponseStateDTO
import com.openholidays.api.service.StateService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/state")
class StateResource(
    private val stateService: StateService,
) {

    @PostMapping
    fun create(@RequestBody createStateDTO: CreateStateDTO): ResponseStateDTO = stateService.create(createStateDTO)

}