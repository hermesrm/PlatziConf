package com.platzi.conf.view.adapter

import com.platzi.conf.model.Conference
import java.text.FieldPosition

interface ScheduleListener {
    fun onConferenceCliked(conference: Conference, position: Int)
}