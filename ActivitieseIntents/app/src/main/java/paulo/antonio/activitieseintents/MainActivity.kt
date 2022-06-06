package paulo.antonio.activitieseintents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("ciclo", "onCreat" )

        val btn_next = findViewById<Button>(R.id.btn_next)

        //Intent é utilizada dentro de uma activity
        val intentSegunda = Intent(this, SegundaActivity::class.java)


        btn_next.setOnClickListener {
            startActivity(intentSegunda)

        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("ciclo", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("ciclo", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("ciclo", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("ciclo", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("ciclo", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ciclo", "onDestroy")
    }
}

