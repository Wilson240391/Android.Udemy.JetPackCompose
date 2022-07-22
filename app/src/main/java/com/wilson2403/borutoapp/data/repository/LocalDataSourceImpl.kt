package com.wilson2403.borutoapp.data.repository

import com.wilson2403.borutoapp.data.local.BorutoDatabase
import com.wilson2403.borutoapp.domain.model.Hero
import com.wilson2403.borutoapp.domain.repository.LocalDataSource

class LocalDataSourceImpl(borutoDatabase: BorutoDatabase): LocalDataSource {

    private val heroDao = borutoDatabase.heroDao()

    override suspend fun getSelectedHero(heroId: Int): Hero {
        return heroDao.getSelectedHero(heroId = heroId)
    }
}