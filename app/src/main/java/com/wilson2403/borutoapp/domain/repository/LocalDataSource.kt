package com.wilson2403.borutoapp.domain.repository

import com.wilson2403.borutoapp.domain.model.Hero


interface LocalDataSource {
    suspend fun getSelectedHero(heroId: Int): Hero
}