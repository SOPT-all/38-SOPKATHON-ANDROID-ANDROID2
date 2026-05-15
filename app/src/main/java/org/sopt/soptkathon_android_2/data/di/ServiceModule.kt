package org.sopt.soptkathon_android_2.data.di

import org.sopt.soptkathon_android_2.data.di.NetworkModule.instance
import org.sopt.soptkathon_android_2.data.service.DummyService

object ServiceModule {
    val dummyService: DummyService by lazy { instance.create(DummyService::class.java) }
}
