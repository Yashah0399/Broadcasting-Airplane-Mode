package android.tyit.com.helloworld

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyReceiver (val showState: (state: Boolean) -> Unit) : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {

        val state = intent?.getBooleanExtra("state", false)
        state?.let{showState(it)}
        // an Intent broadcast.
        Toast.makeText(context, "Broadcast : Flight mode changed.",
                Toast.LENGTH_LONG).show()
    }
}
