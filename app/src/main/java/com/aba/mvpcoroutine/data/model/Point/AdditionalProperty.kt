package com.aba.mvpcoroutine.data.model.Point


import com.google.gson.annotations.SerializedName

data class AdditionalProperty(
    @SerializedName("category")
    var category: String?,
    @SerializedName("key")
    var key: String?,
    @SerializedName("sourceSystemKey")
    var sourceSystemKey: String?,
    @SerializedName("\$type")
    var type: String?,
    @SerializedName("value")
    var value: String?
)