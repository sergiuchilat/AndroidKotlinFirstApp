package space.sergiu.myfirstapp.viewmodels

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.*

class LoginViewModel() : ViewModel() {


    var username = MutableLiveData<String>().apply { this.value = "" }
    var password = MutableLiveData<String>().apply { this.value = "" }
    //var authorizationStatus = MutableLiveData<AuthorizationStatuses>().apply { this.value = AuthorizationStatuses.WAIT }

    var authorizationStatus = MutableLiveData<Int>().apply { this.value = 0 }

    fun login() {
        authorizationStatus.value = 1
        val timer = Timer()
        timer.schedule(object : TimerTask() {
            override fun run() {
                //authorizationStatus.value = 2
                Log.d("test", "timer")
                timer.cancel()
            }
        }, 0, 1000)

    }

    /*fun waitForInput(): Boolean {
        return authorizationStatus.value == AuthorizationStatuses.WAIT
    }

    fun getRequestPending(): Boolean {
        return authorizationStatus.value == AuthorizationStatuses.PENDING
    }

    fun responseSuccess(): Boolean {
        return authorizationStatus.value == AuthorizationStatuses.SUCCESS
    }

    fun responseError(): Boolean {
        return authorizationStatus.value == AuthorizationStatuses.ERROR
    }*/
}