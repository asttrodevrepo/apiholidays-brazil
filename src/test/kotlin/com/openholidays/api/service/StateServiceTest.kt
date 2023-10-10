package com.openholidays.api.service

import com.openholidays.api.entity.State
import com.openholidays.api.repository.StateRepository
import com.openholidays.api.template.buildCreateStateDTOMock
import com.openholidays.api.template.buildStateEntity
import io.mockk.every
import io.mockk.mockk
import io.mockk.slot
import io.mockk.verify
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals


class StateServiceTest {

    private val stateRepository: StateRepository = mockk()
    private val stateService = StateService(stateRepository)

    private val slotState = slot<State>()

    @Test
    fun `should create state`() {

        val stateMock = buildStateEntity()
        val stateRequestMock = buildCreateStateDTOMock()

        every { stateRepository.save(any()) } returns stateMock

        val stateCreated = stateService.create(stateRequestMock)

        assertEquals(stateRequestMock.name, stateCreated.name)
        assertEquals(stateRequestMock.abbreviation, stateCreated.abbreviation)

        verify(exactly = 1) {
            stateRepository.save(capture(slotState))
        }

        assertThat(slotState.captured)
            .usingRecursiveAssertion()
            .isEqualTo(stateMock.copy(id = null))

    }

}