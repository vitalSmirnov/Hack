package com.example.hakaton

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.hakaton.databinding.ActivityMainBinding
import com.example.hakaton.model.Data


class MainActivity : AppCompatActivity(){
    private var count = 0
    private var mainString = ""
    private val data = Data()
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        Glide.with(this)
            .load("https://images.pexels.com/photos/4067739/pexels-photo-4067739.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1")
            .into(findViewById<ImageView>(R.id.backgroundImage))
        val btn0 = binding.btn0
        val btn1 = binding.btn1
        val btn2 = binding.btn2
        val btn3 = binding.btn3
        val btn4 = binding.btn4
        val btn5 = binding.btn5
        val btn6 = binding.btn6
        val btn7 = binding.btn7
        val btn8 = binding.btn8
        val btn9 = binding.btn9
        val btnA = binding.btnAcept
        val btnD = binding.btnDel

        btnA.setOnClickListener(){
            acceptPin(it)
            delPinAnim()
        }
        btnD.setOnClickListener(){
            delPin(it)
            delPinAnim()
        }
        btn0.setOnTouchListener(){ v, event ->
            enterVarsEvent(v.id, event)
            onClickAnim(v)
            true
        }
        btn1.setOnTouchListener(){ v, event ->
            enterVarsEvent(v.id, event)
            onClickAnim(v)
            true
        }
        btn2.setOnTouchListener(){ v, event ->
            enterVarsEvent(v.id, event)
            onClickAnim(v)
            true
        }
        btn3.setOnTouchListener(){ v, event ->
            enterVarsEvent(v.id, event)
            onClickAnim(v)
            true
        }
        btn4.setOnTouchListener(){ v, event ->
            enterVarsEvent(v.id, event)
            onClickAnim(v)
            true
        }
        btn5.setOnTouchListener(){ v, event ->
            enterVarsEvent(v.id, event)
            onClickAnim(v)
            true
        }
        btn6.setOnTouchListener(){ v, event ->
            enterVarsEvent(v.id, event)
            onClickAnim(v)
            true
        }
        btn7.setOnTouchListener(){ v, event ->
            enterVarsEvent(v.id, event)
            onClickAnim(v)
            true
        }
        btn8.setOnTouchListener(){ v, event ->
            enterVarsEvent(v.id, event)
            onClickAnim(v)
            true
        }
        btn9.setOnTouchListener(){ v, event ->
            enterVarsEvent(v.id, event)
            onClickAnim(v)
            true
        }
    }

    fun setPinAnim(){
        when (count){
            1 ->{
                val view = findViewById<TextView>(R.id.first1)
                val animBtn = AnimationUtils.loadAnimation(this, R.anim.pin_set)
                view.startAnimation(animBtn)
                view.setBackgroundResource(R.drawable.pin_set)
            }
            2 ->{
                val view = findViewById<TextView>(R.id.first2)
                val animBtn = AnimationUtils.loadAnimation(this, R.anim.pin_set)
                view.startAnimation(animBtn)
                view.setBackgroundResource(R.drawable.pin_set)
            }
            3 ->{
                val view = findViewById<TextView>(R.id.first3)
                val animBtn = AnimationUtils.loadAnimation(this, R.anim.pin_set)
                view.startAnimation(animBtn)
                view.setBackgroundResource(R.drawable.pin_set)

            }
            4 ->{
                val view = findViewById<TextView>(R.id.first4)
                val animBtn = AnimationUtils.loadAnimation(this, R.anim.pin_set)
                view.startAnimation(animBtn)
                view.setBackgroundResource(R.drawable.pin_set)
            }
        }
    }

    fun delPinAnim(){
        when (count){
            0 ->{
                val view = findViewById<TextView>(R.id.first1)
                val animBtn = AnimationUtils.loadAnimation(this, R.anim.pin_out)
                view.startAnimation(animBtn)
                view.setBackgroundResource(R.drawable.pin_place)
            }
            1 ->{
                val view = findViewById<TextView>(R.id.first2)
                val animBtn = AnimationUtils.loadAnimation(this, R.anim.pin_out)
                view.startAnimation(animBtn)
                view.setBackgroundResource(R.drawable.pin_place)
            }
            2 ->{
                val view = findViewById<TextView>(R.id.first3)
                val animBtn = AnimationUtils.loadAnimation(this, R.anim.pin_out)
                view.startAnimation(animBtn)
                view.setBackgroundResource(R.drawable.pin_place)

            }
            3 ->{
                val view = findViewById<TextView>(R.id.first4)
                val animBtn = AnimationUtils.loadAnimation(this, R.anim.pin_out)
                view.startAnimation(animBtn)
                view.setBackgroundResource(R.drawable.pin_place)
            }
        }
    }
    fun onClickAnim(view: View){
        val animBtn = AnimationUtils.loadAnimation(this, R.anim.btn_anim)
        view.startAnimation(animBtn)
    }

    fun enterVarsEvent(itemid: Int, event : MotionEvent){

        val binding = ActivityMainBinding.inflate(layoutInflater)
            val action = event.action

            when(action){

                MotionEvent.ACTION_DOWN-> {
                    if (count < 4){
                    count+=1
                    setPinAnim()
                    var pswrd = mainString
                    when(itemid){
                        R.id.btn0 ->{
                            pswrd = pswrd + "0"
                        }
                        R.id.btn1 ->{
                            pswrd = pswrd + "1"
                        }
                        R.id.btn2 ->{
                            pswrd = pswrd + "2"
                        }
                        R.id.btn3 ->{
                            pswrd = pswrd + "3"
                        }
                        R.id.btn4 ->{
                            pswrd = pswrd + "4"
                        }
                        R.id.btn5 ->{
                            pswrd = pswrd + "5"
                        }
                        R.id.btn6 ->{
                            pswrd = pswrd + "6"
                        }
                        R.id.btn7 ->{
                            pswrd = pswrd + "7"
                        }
                        R.id.btn8 ->{
                            pswrd = pswrd + "8"
                        }
                        R.id.btn9 ->{
                            pswrd += "9"
                        }
                    }
                    mainString = pswrd
                }
                    else
                    {
                        Toast.makeText(this, "Too many caracthers", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        true
    }

    fun delPin(view: View){
        if (count > 0 && count < 5) {
            val text =  mainString
            mainString = text.dropLast(1)
            count -= 1
        }
    }
    fun acceptPin(view: View){
        if (count == 4)
        {
            val pswrd = mainString
            if (data.getPassword() == ""){
                data.setPassword(pswrd)
                Toast.makeText(this, "Password installed succes", Toast.LENGTH_SHORT).show()
            }else{
                if (data.getPassword() == pswrd) {
                    Toast.makeText(this, "Accept", Toast.LENGTH_SHORT).show()
                }
                else
                {
                    errorShow(1)
                }
            }
        }
        else
        {
            errorShow(0)
        }
    }

    fun errorShow(code : Int){
        var errorText = ""
        when(code) {
            0 ->{
                errorText = "fill all character"
            }
            1->{
                errorText = "Wrong answer"
            }
            else -> {
                errorText = "Unknown error"
            }
        }
        Toast.makeText(this, errorText, Toast.LENGTH_SHORT).show()
    }

}