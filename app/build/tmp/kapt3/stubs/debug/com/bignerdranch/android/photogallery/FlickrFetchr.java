package com.bignerdranch.android.photogallery;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\"\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\u0013\u001a\u00020\bJ\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0013\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/bignerdranch/android/photogallery/FlickrFetchr;", "", "()V", "flickrApi", "Lapi/FlickrApi;", "fetchPhoto", "Landroid/graphics/Bitmap;", "url", "", "fetchPhotoMetadata", "Landroidx/lifecycle/LiveData;", "", "Lcom/bignerdranch/android/photogallery/GalleryItem;", "flickrRequest", "Lretrofit2/Call;", "Lapi/FlickrResponse;", "fetchPhotos", "fetchPhotosRequest", "searchPhotos", "query", "searchPhotosRequest", "app_debug"})
public final class FlickrFetchr {
    @org.jetbrains.annotations.NotNull
    private final api.FlickrApi flickrApi = null;
    
    public FlickrFetchr() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Call<api.FlickrResponse> fetchPhotosRequest() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.bignerdranch.android.photogallery.GalleryItem>> fetchPhotos() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Call<api.FlickrResponse> searchPhotosRequest(@org.jetbrains.annotations.NotNull
    java.lang.String query) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.bignerdranch.android.photogallery.GalleryItem>> searchPhotos(@org.jetbrains.annotations.NotNull
    java.lang.String query) {
        return null;
    }
    
    private final androidx.lifecycle.LiveData<java.util.List<com.bignerdranch.android.photogallery.GalleryItem>> fetchPhotoMetadata(retrofit2.Call<api.FlickrResponse> flickrRequest) {
        return null;
    }
    
    @androidx.annotation.WorkerThread
    @org.jetbrains.annotations.Nullable
    public final android.graphics.Bitmap fetchPhoto(@org.jetbrains.annotations.NotNull
    java.lang.String url) {
        return null;
    }
}