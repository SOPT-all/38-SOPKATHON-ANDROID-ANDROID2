package org.sopt.soptkathon_android_2.data.dto.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HomeResponseDto(
    @SerialName("userId")
    val userId: Int,
    @SerialName("missionCompletedCount")
    val missionCompletedCount: Int,
    @SerialName("level")
    val level: Int,
    @SerialName("movedDistance")
    val movedDistance: Int,
    @SerialName("missionCompleted")
    val missionCompleted: List<MissionDto>,
)

@Serializable
data class MissionDto(
    @SerialName("missionId")
    val missionId: Int,
    @SerialName("status")
    val status: String,
    @SerialName("description")
    val description: String,
    @SerialName("difficulty")
    val difficulty: String,
    @SerialName("completedAt")
    val completedAt: String,
)
