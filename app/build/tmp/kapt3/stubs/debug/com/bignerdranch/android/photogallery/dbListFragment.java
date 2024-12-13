package com.bignerdranch.android.photogallery;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001c2\u00020\u0001:\u0003\u001c\u001d\u001eB\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0016\u0010\u0018\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002R\u0014\u0010\u0003\u001a\b\u0018\u00010\u0004R\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/bignerdranch/android/photogallery/dbListFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Lcom/bignerdranch/android/photogallery/dbListFragment$PhotoAdapter;", "photoListViewModel", "Lcom/bignerdranch/android/photogallery/dbListViewModel;", "getPhotoListViewModel", "()Lcom/bignerdranch/android/photogallery/dbListViewModel;", "photoListViewModel$delegate", "Lkotlin/Lazy;", "photoRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "updateUI", "galleryItems", "", "Lcom/bignerdranch/android/photogallery/GalleryItem;", "Companion", "PhotoAdapter", "PhotoHolder", "app_debug"})
public final class dbListFragment extends androidx.fragment.app.Fragment {
    private androidx.recyclerview.widget.RecyclerView photoRecyclerView;
    @org.jetbrains.annotations.Nullable
    private com.bignerdranch.android.photogallery.dbListFragment.PhotoAdapter adapter;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy photoListViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    public static final com.bignerdranch.android.photogallery.dbListFragment.Companion Companion = null;
    
    public dbListFragment() {
        super();
    }
    
    private final com.bignerdranch.android.photogallery.dbListViewModel getPhotoListViewModel() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
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
    
    private final void updateUI(java.util.List<com.bignerdranch.android.photogallery.GalleryItem> galleryItems) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/bignerdranch/android/photogallery/dbListFragment$Companion;", "", "()V", "newInstance", "Lcom/bignerdranch/android/photogallery/dbListFragment;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.bignerdranch.android.photogallery.dbListFragment newInstance() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lcom/bignerdranch/android/photogallery/dbListFragment$PhotoAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bignerdranch/android/photogallery/dbListFragment$PhotoHolder;", "Lcom/bignerdranch/android/photogallery/dbListFragment;", "galleryItems", "", "Lcom/bignerdranch/android/photogallery/GalleryItem;", "(Lcom/bignerdranch/android/photogallery/dbListFragment;Ljava/util/List;)V", "getGalleryItems", "()Ljava/util/List;", "setGalleryItems", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_debug"})
    final class PhotoAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.bignerdranch.android.photogallery.dbListFragment.PhotoHolder> {
        @org.jetbrains.annotations.NotNull
        private java.util.List<com.bignerdranch.android.photogallery.GalleryItem> galleryItems;
        
        public PhotoAdapter(@org.jetbrains.annotations.NotNull
        java.util.List<com.bignerdranch.android.photogallery.GalleryItem> galleryItems) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.bignerdranch.android.photogallery.GalleryItem> getGalleryItems() {
            return null;
        }
        
        public final void setGalleryItems(@org.jetbrains.annotations.NotNull
        java.util.List<com.bignerdranch.android.photogallery.GalleryItem> p0) {
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public com.bignerdranch.android.photogallery.dbListFragment.PhotoHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull
        com.bignerdranch.android.photogallery.dbListFragment.PhotoHolder holder, int position) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n\u00a8\u0006\u0011"}, d2 = {"Lcom/bignerdranch/android/photogallery/dbListFragment$PhotoHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/bignerdranch/android/photogallery/dbListFragment;Landroid/view/View;)V", "galleryItem", "Lcom/bignerdranch/android/photogallery/GalleryItem;", "idTextView", "Landroid/widget/TextView;", "getIdTextView", "()Landroid/widget/TextView;", "titleTextView", "getTitleTextView", "urlTextView", "getUrlTextView", "bind", "", "app_debug"})
    final class PhotoHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private com.bignerdranch.android.photogallery.GalleryItem galleryItem;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView idTextView = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView titleTextView = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView urlTextView = null;
        
        public PhotoHolder(@org.jetbrains.annotations.NotNull
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getIdTextView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getTitleTextView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getUrlTextView() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.bignerdranch.android.photogallery.GalleryItem galleryItem) {
        }
    }
}