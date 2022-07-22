package com.wilson2403.borutoapp.domain.use_cases.save_onboarding

import com.wilson2403.borutoapp.data.repository.Repository

class SaveOnBoardingUseCase(
    private val repository: Repository
) {
    suspend operator fun invoke(completed: Boolean) {
        repository.saveOnBoardingState(completed = completed)
    }
}