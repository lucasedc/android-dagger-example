package com.example.dagger_example

import dagger.Component

@Component(modules = [NCBatteryModule::class])
interface SmartPhoneComponent {

    fun getSmartPhone(): SmartPhone
}