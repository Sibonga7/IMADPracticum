package vcmsa.sibonga.imadpracticum

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }//end of ViewCompact
        //ST10445437 Sibongakonke Mtambo
        //code starts here


        val btnAdd=findViewById<Button>(R.id.btnAdd)
        val btnNext=findViewById<Button>(R.id.btnNext)
        val btnExit=findViewById<Button>(R.id.btnExit)

        //Show the playlist details
        btnAdd.setOnClickListener{
         TODO("The song title","The artist's name","The rating(1-5)","User comments",)

        }
         btnNext.setOnClickListener{
     startActivity(Intent(this,MainActivity2::class.java))
         }
        btnExit.setOnClickListener{

        }
    }

    private fun TODO(s: String, s1: String, s2: String, s3: String) {

    }
}