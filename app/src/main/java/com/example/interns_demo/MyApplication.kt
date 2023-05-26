package com.example.interns_demo
import android.app.Application
import com.moengage.core.DataCenter
import com.moengage.core.LogLevel
import com.moengage.core.MoEngage
import com.moengage.core.config.DataSyncConfig
import com.moengage.core.config.FcmConfig
import com.moengage.core.config.LOG_CONFIG_DEFAULT_LOG_LEVEL
import com.moengage.core.config.LOG_CONFIG_DEFAULT_STATE_FOR_RELEASE_BUILD
import com.moengage.core.config.LogConfig
import com.moengage.core.config.NotificationConfig


class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        val moEngage = MoEngage.Builder(this, "92R5VB91Z54N8SLZ4E84Y2C8")
            .configureNotificationMetaData(
                NotificationConfig(
                    R.drawable.small_icon,
                    R.drawable.moengage_icon
                    ))
            .configureLogs(LogConfig(LogLevel.VERBOSE))
            .configureFcm(FcmConfig(true))
            .build()
        MoEngage.initialiseDefaultInstance(moEngage)

    }
}