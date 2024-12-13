package com.bignerdranch.android.photogallery;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u00a2\u0006\u0002\u0010\tJ\u0006\u0010\u0018\u001a\u00020\bJ\u0015\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00028\u0000H\u0002\u00a2\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\bH\u0015J\u001b\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00020\u0015\u00a2\u0006\u0002\u0010\u001fJ\b\u0010 \u001a\u00020\u0011H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150\u0014X\u0088\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f\u00a8\u0006!"}, d2 = {"Lcom/bignerdranch/android/photogallery/ThumbnailDownloader;", "T", "Landroid/os/HandlerThread;", "responseHandler", "Landroid/os/Handler;", "onThumbnailDownloaded", "Lkotlin/Function2;", "Landroid/graphics/Bitmap;", "", "(Landroid/os/Handler;Lkotlin/jvm/functions/Function2;)V", "flickrFetchr", "Lcom/bignerdranch/android/photogallery/FlickrFetchr;", "fragmentLifecycleObserver", "Landroidx/lifecycle/LifecycleObserver;", "getFragmentLifecycleObserver", "()Landroidx/lifecycle/LifecycleObserver;", "hasQuit", "", "requestHandler", "requestMap", "Ljava/util/concurrent/ConcurrentHashMap;", "", "viewLifecycleObserver", "getViewLifecycleObserver", "clearQueue", "handleRequest", "target", "(Ljava/lang/Object;)V", "onLooperPrepared", "queueThumbnail", "url", "(Ljava/lang/Object;Ljava/lang/String;)V", "quit", "app_debug"})
public final class ThumbnailDownloader<T extends java.lang.Object> extends android.os.HandlerThread {
    @org.jetbrains.annotations.NotNull
    private final android.os.Handler responseHandler = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function2<T, android.graphics.Bitmap, kotlin.Unit> onThumbnailDownloaded = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LifecycleObserver fragmentLifecycleObserver = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LifecycleObserver viewLifecycleObserver = null;
    private boolean hasQuit = false;
    private android.os.Handler requestHandler;
    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.ConcurrentHashMap<T, java.lang.String> requestMap = null;
    @org.jetbrains.annotations.NotNull
    private final com.bignerdranch.android.photogallery.FlickrFetchr flickrFetchr = null;
    
    public ThumbnailDownloader(@org.jetbrains.annotations.NotNull
    android.os.Handler responseHandler, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super T, ? super android.graphics.Bitmap, kotlin.Unit> onThumbnailDownloaded) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LifecycleObserver getFragmentLifecycleObserver() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LifecycleObserver getViewLifecycleObserver() {
        return null;
    }
    
    @java.lang.Override
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    @android.annotation.SuppressLint(value = {"HandlerLeak"})
    protected void onLooperPrepared() {
    }
    
    @java.lang.Override
    public boolean quit() {
        return false;
    }
    
    public final void queueThumbnail(T target, @org.jetbrains.annotations.NotNull
    java.lang.String url) {
    }
    
    public final void clearQueue() {
    }
    
    private final void handleRequest(T target) {
    }
}