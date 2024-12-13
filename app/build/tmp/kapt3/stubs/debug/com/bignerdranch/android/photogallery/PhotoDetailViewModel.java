package com.bignerdranch.android.photogallery;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/bignerdranch/android/photogallery/PhotoDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "photoIdLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "photoLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/bignerdranch/android/photogallery/GalleryItem;", "getPhotoLiveData", "()Landroidx/lifecycle/LiveData;", "setPhotoLiveData", "(Landroidx/lifecycle/LiveData;)V", "photoRepository", "Lcom/bignerdranch/android/photogallery/PhotoRepository;", "loadCrime", "", "photoId", "app_debug"})
public final class PhotoDetailViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.bignerdranch.android.photogallery.PhotoRepository photoRepository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> photoIdLiveData = null;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.LiveData<com.bignerdranch.android.photogallery.GalleryItem> photoLiveData;
    
    public PhotoDetailViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.bignerdranch.android.photogallery.GalleryItem> getPhotoLiveData() {
        return null;
    }
    
    public final void setPhotoLiveData(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LiveData<com.bignerdranch.android.photogallery.GalleryItem> p0) {
    }
    
    public final void loadCrime(@org.jetbrains.annotations.NotNull
    java.lang.String photoId) {
    }
}