package pe.com.applaboratorio02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ActividadPromedio : AppCompatActivity() {
    //declarando variables
    var n1:Double = 0.0
    var n2:Double = 0.0
    var n3:Double = 0.0
    var n4:Double = 0.0
    var prom:Double = 0.0
    var condi:String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actividad_promedio)
    }

    fun CalcularPromedio(nt1:Double,nt2:Double,nt3:Double,nt4:Double)=(nt1+nt2+nt3+nt4)/4
}