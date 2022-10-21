package co.touchlab.kmmbridgekickstart

import co.touchlab.kmmbridgekickstart.db.KMMBridgeKickStartDb
import com.russhwolf.settings.NSUserDefaultsSettings
import com.russhwolf.settings.Settings
import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.drivers.native.NativeSqliteDriver
import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.engine.darwin.Darwin
import platform.Foundation.NSUserDefaults

class IOSServiceLocator(
    userDefaults: NSUserDefaults
) : BaseServiceLocator() {

    override val sqlDriver: SqlDriver by lazy {
        NativeSqliteDriver(KMMBridgeKickStartDb.Schema, "KMMBridgeKickStartDb")
    }

    override val settings: Settings by lazy { NSUserDefaultsSettings(userDefaults) }

    override val clientEngine: HttpClientEngine by lazy { Darwin.create() }
}
