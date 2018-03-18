package api.coinbinhood.injection.component

import android.app.Application
import api.coinbinhood.CoinbinhoodApp
import api.coinbinhood.injection.module.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

/**
 * Created by joel on 3/17/18.
 */
@Singleton
@Component(modules = [(AppModule::class),(AndroidInjectionModule::class)])
interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(app: CoinbinhoodApp)

}