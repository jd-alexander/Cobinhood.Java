package api.coinbinhood.injection.builder

import api.coinbinhood.ui.main.MainActivityModule
import api.coinbinhood.ui.main.view.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by joel on 3/17/18.
 */
@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [(MainActivityModule::class)])
    abstract fun bindMainActivity(): MainActivity

}