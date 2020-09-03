package com.atulyadav.ageinminutes

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btndatepicker.setOnClickListener {view ->
            clickDatePicker(view)
           }
    }

    fun clickDatePicker(view : View) {
        val myCalendar = Calendar.getInstance()
        val year = myCalendar.get(Calendar.YEAR)
        val month = myCalendar.get(Calendar.MONTH)
        val day = myCalendar.get(Calendar.DAY_OF_MONTH)
        DatePickerDialog(this, {
                view, Selectedyear, Selectedmonth, SelecteddayOfMonth ->
            val SelectedDate = "$SelecteddayOfMonth/ ${Selectedmonth+1}/ $Selectedyear"

            tvSelectedDate.setText(SelectedDate)

            val sdf = SimpleDateFormat("dd/MM/yyyy")
        }
            ,year
            ,month,
            day).show()
    }

}

