package com.jalilurrahman.audioplayerkotlin

import android.app.Application
import android.content.Context

class AudioPlayerApp : Application() {

    companion object {
        lateinit var instance: AudioPlayerApp

        /*
        * return the instance of the Application
        * */
        fun getApplication(): AudioPlayerApp {
            return instance
        }

        /*
        * @return the context of the Application
        * */
        fun getContext(): Context {
            return instance.applicationContext
        }
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        StorageUtil.init(this)
    }
}