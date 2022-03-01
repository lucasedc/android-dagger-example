package com.example.dagger_example

import dagger.Module
import dagger.Provides
import javax.inject.Inject

@Module
class NCBatteryModule {
    @Provides
    fun providesNCBattery(nickelCadmiumBattery: NickelCadmiumBattery):Battery{
        return nickelCadmiumBattery
    }
}