package api.cobinhood.ui.base.presenter

import api.cobinhood.ui.base.interactor.MVPInteractor
import api.cobinhood.ui.base.view.MVPView

/**
 * Created by joel on 3/18/18.
 */
interface MVPPresenter<V : MVPView, I : MVPInteractor> {

    fun onAttach(view: V?)

    fun onDetach()

    fun getView(): V?

}