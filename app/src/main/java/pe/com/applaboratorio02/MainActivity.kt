package pe.com.applaboratorio02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    //declarando variables
    var num1=0
    var num2=0
    var sum=0
    var res=0
    var mul=0
    var div=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun CalcularSuma(n1:Double,n2:Double):Double{
        return n1+n2
    }
    fun CalcularResta(n1:Double,n2:Double):Double{
        return n1-n2
    }
    fun CalcularMultiplicacion(n1:Double,n2:Double):Double{
        return n1*n2
    }
    fun CalcularDivision(n1:Double,n2:Double):Double{
        return n1/n2
    }

}