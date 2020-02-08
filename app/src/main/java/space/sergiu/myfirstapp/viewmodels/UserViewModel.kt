package space.sergiu.myfirstapp.viewmodels

import android.util.Log
import androidx.databinding.ObservableField
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import space.sergiu.myfirstapp.DC.UserData
import java.util.*

class UserViewModel(var userData: UserData): Observable() {

    var user = userData

    fun incrementAge(){
        Log.d("test", "bind")
        user = UserData("Ion", 50)
        setChanged()
        notifyObservers()
    }
}