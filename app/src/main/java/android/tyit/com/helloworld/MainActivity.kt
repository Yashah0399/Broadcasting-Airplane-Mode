package android.tyit.com.helloworld

import android.content.IntentFilter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txtState = findViewById<TextView>(R.id.state)

        val rec = MyReceiver{
            txtState.text = if (it){
                "Airplane Mode On"
            }
            else{
                "Airplane Mode Off"
            }

        }

        registerReceiver(rec, IntentFilter("android.intent.action.AIRPLANE_MODE"))
    }
}
