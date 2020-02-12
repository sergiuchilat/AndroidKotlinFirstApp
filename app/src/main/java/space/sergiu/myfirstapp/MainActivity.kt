package space.sergiu.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import space.sergiu.myfirstapp.databinding.ActivityMainBinding
import space.sergiu.myfirstapp.viewmodels.LoginViewModel

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_main
        )
        binding.viewModel = LoginViewModel()
        binding.lifecycleOwner = this
    }
}
