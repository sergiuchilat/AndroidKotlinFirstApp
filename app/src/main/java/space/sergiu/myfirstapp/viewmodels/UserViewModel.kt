package space.sergiu.myfirstapp.viewmodels

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import space.sergiu.myfirstapp.DC.UserData

class UserViewModel(): ViewModel(){

    var user = MutableLiveData<UserData>().apply { this.value = UserData("Ion", "35") }
    var userAge = MutableLiveData<String>().apply { this.value = "123" }

    fun incrementAge(){
        Log.d("test", "bind")
        //user.value = UserData("Ion", 50)
        userAge.value = (userAge.value?.toInt()!! + 1).toString()
        /*setChanged()
        notifyObservers()*/
    }
}