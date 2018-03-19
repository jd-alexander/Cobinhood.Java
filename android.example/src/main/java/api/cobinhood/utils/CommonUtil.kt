package api.cobinhood.utils

import android.app.ProgressDialog
import android.content.Context
import android.graphics.Color
import androidx.graphics.drawable.toDrawable
import api.cobinhood.R

/**
 * Created by joel on 3/19/18.
 */
object CommonUtil {

    fun showLoadingDialog(context: Context?): ProgressDialog {
        val progressDialog = ProgressDialog(context)
        progressDialog.let {
            it.show()
            it.window?.setBackgroundDrawable(Color.TRANSPARENT.toDrawable())
            it.setContentView(R.layout.progress_dialog)
            it.isIndeterminate = true
            it.setCancelable(false)
            it.setCanceledOnTouchOutside(false)
            return it
        }
    }

}