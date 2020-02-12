package space.sergiu.myfirstapp.DC

import androidx.databinding.Bindable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

data class UserData (
    var username: String,
    var password: String
){
    private var _username = MutableLiveData<String>().apply { this.value = username }
    private var _password = MutableLiveData<String>().apply { this.value = password }
}