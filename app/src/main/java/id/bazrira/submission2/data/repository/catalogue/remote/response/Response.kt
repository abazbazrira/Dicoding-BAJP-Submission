package id.bazrira.submission2.data.repository.catalogue.remote.response

import com.google.gson.annotations.SerializedName

data class ListResponse<T>(
  @SerializedName("status_message")
  val statusMessage: String? = null,
  @SerializedName("status_code")
  val statusCode: Int? = null,
  @SerializedName("results")
  val result: List<T>? = null
)