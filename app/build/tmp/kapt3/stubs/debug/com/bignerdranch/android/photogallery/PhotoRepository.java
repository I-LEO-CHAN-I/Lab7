package com.bignerdranch.android.photogallery;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0011\u0010\u0010\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00170\u0013R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lcom/bignerdranch/android/photogallery/PhotoRepository;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "database", "Ldatabase/PhotoDatabase;", "executor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "photoDao", "Ldatabase/PhotoDao;", "addPhoto", "", "galleryItem", "Lcom/bignerdranch/android/photogallery/GalleryItem;", "delPhotos", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPhoto", "Landroidx/lifecycle/LiveData;", "id", "", "getPhotos", "", "Companion", "app_debug"})
public final class PhotoRepository {
    private final java.util.concurrent.ExecutorService executor = null;
    @org.jetbrains.annotations.NotNull
    private final database.PhotoDatabase database = null;
    @org.jetbrains.annotations.NotNull
    private final database.PhotoDao photoDao = null;
    @org.jetbrains.annotations.Nullable
    private static com.bignerdranch.android.photogallery.PhotoRepository INSTANCE;
    @org.jetbrains.annotations.NotNull
    public static final com.bignerdranch.android.photogallery.PhotoRepository.Companion Companion = null;
    
    private PhotoRepository(android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.bignerdranch.android.photogallery.GalleryItem>> getPhotos() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.bignerdranch.android.photogallery.GalleryItem> getPhoto(@org.jetbrains.annotations.NotNull
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object delPhotos(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    public final void addPhoto(@org.jetbrains.annotations.NotNull
    com.bignerdranch.android.photogallery.GalleryItem galleryItem) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/bignerdranch/android/photogallery/PhotoRepository$Companion;", "", "()V", "INSTANCE", "Lcom/bignerdranch/android/photogallery/PhotoRepository;", "get", "initialize", "", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void initialize(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.bignerdranch.android.photogallery.PhotoRepository get() {
            return null;
        }
    }
}