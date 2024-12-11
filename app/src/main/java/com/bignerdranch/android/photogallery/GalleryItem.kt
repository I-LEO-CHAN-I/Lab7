package com.bignerdranch.android.photogallery

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import java.util.UUID

@Entity
data class GalleryItem(@PrimaryKey val uid: UUID = UUID.randomUUID(),
    var title: String = "",
    var id: String = "",
    @SerializedName("url_s") var url: String = ""
)