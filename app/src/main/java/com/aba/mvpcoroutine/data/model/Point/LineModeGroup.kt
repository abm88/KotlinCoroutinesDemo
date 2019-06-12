package com.aba.mvpcoroutine.data.model.Point


import com.google.gson.annotations.SerializedName

data class LineModeGroup(
    @SerializedName("lineIdentifier")
    var lineIdentifier: List<String?>?,
    @SerializedName("modeName")
    var modeName: String?,
    @SerializedName("\$type")
    var type: String?
)