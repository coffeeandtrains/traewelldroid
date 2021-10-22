package de.hbch.traewelling.api.models.status

import com.google.gson.annotations.SerializedName
import de.hbch.traewelling.api.models.user.ForeignUser
import de.hbch.traewelling.api.models.user.User
import java.util.*

data class Status(
    @SerializedName("id") val id: Int,
    @SerializedName("body") val body: String?,
    @SerializedName("type") val type: String,
    @SerializedName("createdAt") val createdAt: Date,
    @SerializedName("user") val user: ForeignUser,
    @SerializedName("visibility") val visibility: StatusVisibility,
    @SerializedName("business") val business: StatusBusiness,
    @SerializedName("likes") var likes: Int,
    @SerializedName("liked") var liked: Boolean,
    @SerializedName("train") val journey: Journey
    // TODO Event
) {

}

enum class StatusVisibility(val visibility: Int) {
    @SerializedName("0")
    PUBLIC(0),
    @SerializedName("1")
    UNLISTED(1),
    @SerializedName("2")
    FOLLOWERS(2),
    @SerializedName("3")
    PRIVATE(3)
}

enum class StatusBusiness(val business: Int) {
    @SerializedName("0")
    PRIVATE(0),
    @SerializedName("1")
    BUSINESS(1),
    @SerializedName("2")
    COMMUTE(2)
}