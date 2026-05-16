package org.sopt.soptkathon_android_2.data.di

import org.sopt.soptkathon_android_2.data.di.NetworkModule.instance
import org.sopt.soptkathon_android_2.data.service.ApiService

object ServiceModule {
    val apiService: ApiService by lazy { instance.create(ApiService::class.java) }
}
