package api.coinbinhood.ui.base.presenter

import api.coinbinhood.ui.base.interactor.MVPInteractor
import api.coinbinhood.ui.base.view.MVPView

/**
 * Created by joel on 3/18/18.
 */
interface MVPPresenter<V : MVPView, I : MVPInteractor> {

    fun onAttach(view: V?)

    fun onDetach()

    fun getView(): V?

}