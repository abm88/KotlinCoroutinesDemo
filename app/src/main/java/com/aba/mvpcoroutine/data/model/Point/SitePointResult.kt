package com.aba.mvpcoroutine.data.model.Point


import com.google.gson.annotations.SerializedName

data class SitePointResult(
    @SerializedName("additionalProperties")
    var additionalProperties: List<AdditionalProperty?>?,
    @SerializedName("children")
    var children: List<Children?>?,
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
    var lineGroup: List<LineGroup?>?,
    @SerializedName("lineModeGroups")
    var lineModeGroups: List<LineModeGroup?>?,
    @SerializedName("lines")
    var lines: List<Line?>?,
    @SerializedName("lon")
    var lon: Double?,
    @SerializedName("modes")
    var modes: List<String?>?,
    @SerializedName("naptanId")
    var naptanId: String?,
    @SerializedName("placeType")
    var placeType: String?,
    @SerializedName("stationNaptan")
    var stationNaptan: String?,
    @SerializedName("status")
    var status: Boolean?,
    @SerializedName("stopType")
    var stopType: String?,
    @SerializedName("\$type")
    var type: String?
)