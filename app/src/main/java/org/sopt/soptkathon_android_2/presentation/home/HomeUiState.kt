package org.sopt.soptkathon_android_2.presentation.home

import org.sopt.soptkathon_android_2.data.dto.response.MissionDto

data class  HomeUiState(
    val missionCompletedCount: Int = 9,
    val level: Int = 1,
    val movedDistance: Int = 90,
    val missions: List<MissionDto> = emptyList(),
) {
    val fraction = movedDistance / 100f
}