package database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.bignerdranch.android.photogallery.GalleryItem

@TypeConverters(PhotoTypeConverters::class)
@Database(entities = [ GalleryItem::class ], version=1)

abstract class PhotoDatabase : RoomDatabase() {
    abstract fun photoDao(): PhotoDao
}