package space.sergiu.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_screen2.*

class Screen2 : AppCompatActivity() {

    companion object{
        const val COUNTER_FIELD_NAME = ""
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)
        replicateCounter()
    }

    fun gotoMainScreen(view: View){
        startActivity(Intent(this, MainActivity::class.java))
    }

    private fun replicateCounter(){
        val counterValue = intent.getIntExtra(COUNTER_FIELD_NAME, 0)
        counterReplicationTextView.text = counterValue.toString()
    }
}
