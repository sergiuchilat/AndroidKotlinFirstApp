package space.sergiu.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.activity_main.*
import space.sergiu.myfirstapp.DC.UserData
import space.sergiu.myfirstapp.databinding.ActivityMainBinding
import space.sergiu.myfirstapp.viewmodels.UserViewModel

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        //setEventListeners()

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_main
        )
        binding.viewModel = UserViewModel()
        binding.lifecycleOwner = this

    }

    private fun decreaseValue(){
        var count:Int = Integer.parseInt(counterTextView.text.toString())
        count--
        counterTextView.text = count.toString()
    }

    private fun increaseValue(){
        var count:Int = Integer.parseInt(counterTextView.text.toString())
        count++
        counterTextView.text = count.toString()
    }

    private fun resetValue(){
        counterTextView.text = 0.toString()
    }

    private fun gotoScreen2(){
        val secondScreenIntent = Intent(this, Screen2::class.java)
        val counterValue = Integer.parseInt(counterTextView.text.toString())
        secondScreenIntent.putExtra(Screen2.COUNTER_FIELD_NAME, counterValue)
        startActivity(secondScreenIntent)
    }

    private fun setEventListeners(){
        decreaseCounterBtn.setOnClickListener { decreaseValue() }
        increaseCounterBtn.setOnClickListener { increaseValue() }
        resetCounterBtn.setOnClickListener { resetValue() }
        gotoScreen2Btn.setOnClickListener { gotoScreen2() }
    }
}
