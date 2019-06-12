package com.aba.mvpcoroutine.data.model.Point


import com.google.gson.annotations.SerializedName

data class Children(
    @SerializedName("additionalProperties")
    var additionalProperties: List<Any?>?,
    @SerializedName("children")
    var children: List<Any?>?,
    @SerializedName("commonName")
    var commonName: String?,
    @SerializedName("hubNaptanCode")
    var hubNaptanCode: String?,
    @SerializedName("icsCode")
    var icsCode: String?,
    @SerializedName("id")
    var id: String?,
    @SerializedName("lat")
    var lat: Double?,
    @SerializedName("lineGroup")
    var lineGroup: List<Any?>?,
    @SerializedName("lineModeGroups")
    var lineModeGroups: List<Any?>?,
    @SerializedName("lines")
    var lines: List<Any?>?,
    @SerializedName("lon")
    var lon: Double?,
    @SerializedName("modes")
    var modes: List<Any?>?,
    @SerializedName("naptanId")
    var naptanId: String?,
    @SerializedName("placeType")
    var placeType: String?,
    @SerializedName("stationNaptan")
    var stationNaptan: String?,
    @SerializedName("status")
    var status: Boolean?,
    @SerializedName("\$type")
    var type: String?
)