package database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.bignerdranch.android.photogallery.GalleryItem

@Dao
interface PhotoDao {
    @Query("SELECT * FROM galleryitem")
    fun getPhoto(): List<GalleryItem>

    @Query("DELETE FROM galleryitem")
    fun clearPhoto(): Void

    @Update
    fun updateCrime(photo: GalleryItem)

    @Insert
    fun addCrime(photo: GalleryItem)
}