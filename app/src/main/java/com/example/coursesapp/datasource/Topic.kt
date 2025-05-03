package com.example.coursesapp.datasource

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val titleStringId: Int,
    val associatedCourses:Int,
    @DrawableRes val topicImage: Int,
)