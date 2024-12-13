package com.bignerdranch.android.photogallery;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \"2\u00020\u0001:\u0003\"#$B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J$\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u001a\u001a\u00020\rH\u0016J\b\u0010\u001b\u001a\u00020\rH\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u001a\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\u00162\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/bignerdranch/android/photogallery/PhotoGalleryFragment;", "Landroidx/fragment/app/Fragment;", "()V", "photoGalleryViewModel", "Lcom/bignerdranch/android/photogallery/PhotoGalleryViewModel;", "photoRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "photoRepository", "Lcom/bignerdranch/android/photogallery/PhotoRepository;", "thumbnailDownloader", "Lcom/bignerdranch/android/photogallery/ThumbnailDownloader;", "Lcom/bignerdranch/android/photogallery/PhotoGalleryFragment$PhotoHolder;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onDestroyView", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onViewCreated", "view", "Companion", "PhotoAdapter", "PhotoHolder", "app_debug"})
public final class PhotoGalleryFragment extends androidx.fragment.app.Fragment {
    private com.bignerdranch.android.photogallery.PhotoGalleryViewModel photoGalleryViewModel;
    private androidx.recyclerview.widget.RecyclerView photoRecyclerView;
    private com.bignerdranch.android.photogallery.ThumbnailDownloader<? super com.bignerdranch.android.photogallery.PhotoGalleryFragment.PhotoHolder> thumbnailDownloader;
    @org.jetbrains.annotations.NotNull
    private com.bignerdranch.android.photogallery.PhotoRepository photoRepository;
    @org.jetbrains.annotations.NotNull
    public static final com.bignerdranch.android.photogallery.PhotoGalleryFragment.Companion Companion = null;
    
    public PhotoGalleryFragment() {
        super();
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @java.lang.Override
    public void onDestroy() {
    }
    
    @java.lang.Override
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull
    android.view.Menu menu, @org.jetbrains.annotations.NotNull
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/bignerdranch/android/photogallery/PhotoGalleryFragment$Companion;", "", "()V", "newInstance", "Lcom/bignerdranch/android/photogallery/PhotoGalleryFragment;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.bignerdranch.android.photogallery.PhotoGalleryFragment newInstance() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/bignerdranch/android/photogallery/PhotoGalleryFragment$PhotoAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bignerdranch/android/photogallery/PhotoGalleryFragment$PhotoHolder;", "galleryItems", "", "Lcom/bignerdranch/android/photogallery/GalleryItem;", "(Lcom/bignerdranch/android/photogallery/PhotoGalleryFragment;Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_debug"})
    final class PhotoAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.bignerdranch.android.photogallery.PhotoGalleryFragment.PhotoHolder> {
        @org.jetbrains.annotations.NotNull
        private final java.util.List<com.bignerdranch.android.photogallery.GalleryItem> galleryItems = null;
        
        public PhotoAdapter(@org.jetbrains.annotations.NotNull
        java.util.List<com.bignerdranch.android.photogallery.GalleryItem> galleryItems) {
            super();
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public com.bignerdranch.android.photogallery.PhotoGalleryFragment.PhotoHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull
        com.bignerdranch.android.photogallery.PhotoGalleryFragment.PhotoHolder holder, int position) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\u0012\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/bignerdranch/android/photogallery/PhotoGalleryFragment$PhotoHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "itemImageView", "Landroid/widget/ImageView;", "(Landroid/widget/ImageView;)V", "bindDrawable", "Lkotlin/Function1;", "Landroid/graphics/drawable/Drawable;", "", "getBindDrawable", "()Lkotlin/jvm/functions/Function1;", "galleryItem", "Lcom/bignerdranch/android/photogallery/GalleryItem;", "getGalleryItem", "()Lcom/bignerdranch/android/photogallery/GalleryItem;", "setGalleryItem", "(Lcom/bignerdranch/android/photogallery/GalleryItem;)V", "onClick", "v", "Landroid/view/View;", "app_debug"})
    static final class PhotoHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        @org.jetbrains.annotations.NotNull
        private final android.widget.ImageView itemImageView = null;
        public com.bignerdranch.android.photogallery.GalleryItem galleryItem;
        @org.jetbrains.annotations.NotNull
        private final kotlin.jvm.functions.Function1<android.graphics.drawable.Drawable, kotlin.Unit> bindDrawable = null;
        
        public PhotoHolder(@org.jetbrains.annotations.NotNull
        android.widget.ImageView itemImageView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.bignerdranch.android.photogallery.GalleryItem getGalleryItem() {
            return null;
        }
        
        public final void setGalleryItem(@org.jetbrains.annotations.NotNull
        com.bignerdranch.android.photogallery.GalleryItem p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final kotlin.jvm.functions.Function1<android.graphics.drawable.Drawable, kotlin.Unit> getBindDrawable() {
            return null;
        }
        
        @java.lang.Override
        public void onClick(@org.jetbrains.annotations.Nullable
        android.view.View v) {
        }
    }
}