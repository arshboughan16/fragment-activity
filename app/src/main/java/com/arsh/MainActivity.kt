package com.arsh

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.FragmentContainer
import androidx.fragment.app.FragmentContainerView
import com.arsh.R.color.green

class MainActivity : AppCompatActivity() {

    lateinit var activityInterface: ActivityInterface
    lateinit var btnalert_Dialog: Button
    lateinit var fragmentContainerView : FragmentContainerView
    var c = 0
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnalert_Dialog =findViewById(R.id.btnAlert_Dialog )
        fragmentContainerView =findViewById(R.id.fragmentContainerView)

        btnalert_Dialog.setOnClickListener{
            c++
            activityInterface.ActivityInterface()
            var alertDialog= AlertDialog.Builder(this)
            alertDialog.setTitle("Title")
            alertDialog.setMessage("Alert dialog message")
            alertDialog.setPositiveButton("Red"){_,_->
                fragmentContainerView.setBackgroundResource(R.color.red)
            }
            alertDialog.setNegativeButton("Green"){_,_->
                fragmentContainerView.setBackgroundColor(green)
            }
            alertDialog.setNeutralButton("Blue"){_,_->
                fragmentContainerView.setBackgroundColor(R.color.blue)
            }
            alertDialog.show()
        }
    }
}