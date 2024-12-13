package database;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0011\u0010\u0006\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\t2\u0006\u0010\n\u001a\u00020\u000bH\'J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r0\tH\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Ldatabase/PhotoDao;", "", "addCrime", "", "galleryItem", "Lcom/bignerdranch/android/photogallery/GalleryItem;", "delPhotos", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPhoto", "Landroidx/lifecycle/LiveData;", "id", "", "getPhotos", "", "app_debug"})
@androidx.room.Dao
public abstract interface PhotoDao {
    
    @androidx.room.Query(value = "SELECT * FROM galleryitem")
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.util.List<com.bignerdranch.android.photogallery.GalleryItem>> getPhotos();
    
    @androidx.room.Query(value = "SELECT * FROM galleryitem WHERE id=(:id)")
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<com.bignerdranch.android.photogallery.GalleryItem> getPhoto(@org.jetbrains.annotations.NotNull
    java.lang.String id);
    
    @androidx.room.Query(value = "DELETE FROM galleryitem")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object delPhotos(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Insert
    public abstract void addCrime(@org.jetbrains.annotations.NotNull
    com.bignerdranch.android.photogallery.GalleryItem galleryItem);
}