package com.aba.mvpcoroutine.data.model.Point


import com.google.gson.annotations.SerializedName

data class LineGroup(
    @SerializedName("lineIdentifier")
    var lineIdentifier: List<String?>?,
    @SerializedName("stationAtcoCode")
    var stationAtcoCode: String?,
    @SerializedName("\$type")
    var type: String?
)