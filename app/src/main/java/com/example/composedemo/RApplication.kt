package com.example.composedemo

import android.app.Application
import rogo.iot.module.rogocore.basesdk.ILogR
import rogo.iot.module.rogocore.sdk.SmartSdk

class RApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        SmartSdk.isForceStagingSvr = true

        SmartSdk().initV2(
            this,
            "fa751d67ddcf4e0dabe03d29ec81bac5",
            "1de6ed021df6a4cf4d3a178f918a414df1f290da20ef",
            RogoNotificationImpl(), false, true
        )
        ILogR.setEnablePrint(true)
    }
}