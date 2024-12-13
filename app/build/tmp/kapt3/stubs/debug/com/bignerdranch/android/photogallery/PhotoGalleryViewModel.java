package com.bignerdranch.android.photogallery;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001b"}, d2 = {"Lcom/bignerdranch/android/photogallery/PhotoGalleryViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "flickrFetchr", "Lcom/bignerdranch/android/photogallery/FlickrFetchr;", "galleryItemLiveData", "Landroidx/lifecycle/LiveData;", "", "Lcom/bignerdranch/android/photogallery/GalleryItem;", "getGalleryItemLiveData", "()Landroidx/lifecycle/LiveData;", "mutableSearchTerm", "Landroidx/lifecycle/MutableLiveData;", "", "photoRepository", "Lcom/bignerdranch/android/photogallery/PhotoRepository;", "getPhotoRepository", "()Lcom/bignerdranch/android/photogallery/PhotoRepository;", "searchTerm", "getSearchTerm", "()Ljava/lang/String;", "clearDB", "", "fetchPhotos", "query", "app_debug"})
public final class PhotoGalleryViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull
    private final android.app.Application app = null;
    @org.jetbrains.annotations.NotNull
    private final com.bignerdranch.android.photogallery.PhotoRepository photoRepository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.bignerdranch.android.photogallery.GalleryItem>> galleryItemLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final com.bignerdranch.android.photogallery.FlickrFetchr flickrFetchr = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mutableSearchTerm = null;
    
    public PhotoGalleryViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application app) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.bignerdranch.android.photogallery.PhotoRepository getPhotoRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.bignerdranch.android.photogallery.GalleryItem>> getGalleryItemLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSearchTerm() {
        return null;
    }
    
    public final void fetchPhotos(@org.jetbrains.annotations.NotNull
    java.lang.String query) {
    }
    
    public final void clearDB() {
    }
}