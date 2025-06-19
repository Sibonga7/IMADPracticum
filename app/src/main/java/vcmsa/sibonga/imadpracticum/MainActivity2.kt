package vcmsa.sibonga.imadpracticum

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        //Declaration
        val btnlist= arrayOf(
            "Halo,Beyonce,4/5,Amazing vocals",
            "Water,Tyla,5/5,Great song to dance to",
            "Sorry,Justin Bieber,3/5,The song is a bit corny",
            "Sunshine,Lady Zamar,4/5,A great song to vibe to",
        )

           val btnaverage= arrayOf(
              "Average=4/5+5/5+3/5+4/5=18/4=4.5"
           )
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }//code starts here

        //UI elements
        val list=findViewById<Button>(R.id.btnlist)
        val average=findViewById<Button>(R.id.btnAverage)
        val btnReturn=findViewById<Button>(R.id.btnReturn)

        btnReturn.setOnClickListener{

        }



    }
}