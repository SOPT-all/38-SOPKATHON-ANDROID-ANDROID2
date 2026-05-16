package org.sopt.soptkathon_android_2.data.service

import org.sopt.soptkathon_android_2.core.model.BaseResponse
import org.sopt.soptkathon_android_2.data.dto.request.HomeRequestDto
import org.sopt.soptkathon_android_2.data.dto.response.HomeResponseDto
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ApiService {
    @GET("/api/v1/users/completed-missions/{userId}")
    suspend fun getHome(
        @Path("userId") userId: Int,
    ): BaseResponse<HomeResponseDto>

    @POST("/api/v1/missions/{missionId}/complete")
    suspend fun postMission(
        @Path("missionId") missionId: Int,
        @Body request: HomeRequestDto,
    ): BaseResponse<Unit>
}
