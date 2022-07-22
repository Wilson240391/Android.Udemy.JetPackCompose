package com.wilson2403.borutoapp.domain.use_cases.get_selected_hero

import com.wilson2403.borutoapp.data.repository.Repository
import com.wilson2403.borutoapp.domain.model.Hero

class GetSelectedHeroUseCase(
    private val repository: Repository
) {
//    suspend operator fun invoke(heroId: Int): Hero {
//        return repository.getSelectedHero(heroId = heroId)
//    }
}