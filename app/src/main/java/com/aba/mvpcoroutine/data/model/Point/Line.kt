package com.aba.mvpcoroutine.data.model.Point


import com.google.gson.annotations.SerializedName

data class Line(
    @SerializedName("crowding")
    var crowding: Crowding?,
    @SerializedName("id")
    var id: String?,
    @SerializedName("name")
    var name: String?,
    @SerializedName("routeType")
    var routeType: String?,
    @SerializedName("status")
    var status: String?,
    @SerializedName("type")
    var type: String?,
    @SerializedName("uri")
    var uri: String?
)