package app.miki.mikiso.count0712

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var number : Int = 0
        numberTextView.text = "0"

        plusButton.setOnClickListener {
            number = number + 100
            numberTextView.text = number.toString()


        }

        minusButton.setOnClickListener {
            number = number - 100
            numberTextView.text = number.toString()
        }

        multiplyButton.setOnClickListener {
            number = number * 100
            numberTextView.text = number.toString()
        }


    }
}