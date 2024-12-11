package com.bignerdranch.android.photogallery

import android.content.Context
import android.provider.ContactsContract.Contacts.Photo
import androidx.room.Room
import database.PhotoDatabase
import java.util.UUID
import java.util.concurrent.Executors

private const val DATABASE_NAME = "photo-database"
private val executor = Executors.newSingleThreadExecutor()
class PhotoRepository private
constructor(context: Context) {

    private val database : PhotoDatabase =
        Room.databaseBuilder(
            context.applicationContext,
            PhotoDatabase::class.java,
            DATABASE_NAME
        ).build()
    private val photoDao = database.photoDao()

    fun getPhotos(): List<GalleryItem> = photoDao.getPhoto()
    fun clearPhotos(): Void = photoDao.clearPhoto()

    fun updatePhoto(photo: GalleryItem) {
        executor.execute {
            photoDao.updateCrime(photo)
        }
    }

    fun addPhoto(photo: GalleryItem) {
        executor.execute {
            photoDao.addCrime(photo)
        }
    }

    companion object {
        private var INSTANCE: PhotoRepository? =
            null
        fun initialize(context: Context) {
            if (INSTANCE == null) {
                INSTANCE = PhotoRepository(context)
            }
        }
        fun get(): PhotoRepository {
            return INSTANCE ?:
            throw IllegalStateException("PhotoRepository must be initialized")
        }
    }
}