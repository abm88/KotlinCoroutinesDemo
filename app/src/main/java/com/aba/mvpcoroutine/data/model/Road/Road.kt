package com.aba.mvpcoroutine.data.model.Road


import com.google.gson.annotations.SerializedName

data class Road(
    @SerializedName("bounds")
    var bounds: String?,
    @SerializedName("displayName")
    var displayName: String?,
    @SerializedName("envelope")
    var envelope: String?,
    @SerializedName("group")
    var group: String?,
    @SerializedName("id")
    var id: String?,
    @SerializedName("statusSeverity")
    var statusSeverity: String?,
    @SerializedName("statusSeverityDescription")
    var statusSeverityDescription: String?,
    @SerializedName("\$type")
    var type: String?,
    @SerializedName("url")
    var url: String?
)