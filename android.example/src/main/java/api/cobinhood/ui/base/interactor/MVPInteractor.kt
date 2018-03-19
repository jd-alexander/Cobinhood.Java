package api.cobinhood.ui.base.interactor

/**
 * Created by joel on 3/18/18.
 */
interface MVPInteractor {

    fun isUserLoggedIn(): Boolean

    fun performUserLogout()

}