package com.lonespectre.retrievam;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.BottomNavigationViewKt;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import com.lonespectre.retrievam.R.id;
import com.lonespectre.retrievam.databinding.ActivityMainBinding;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 9, 0},
        k = 1,
        d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0015J\b\u0010\r\u001a\u00020\nH\u0014J\b\u0010\u000e\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0010"},
        d2 = {"Lme/moty/cylost/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lme/moty/cylost/databinding/ActivityMainBinding;", "helper", "Lme/moty/cylost/MyDBHelper;", "getDatebase", "Landroid/database/sqlite/SQLiteDatabase;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "requestPermission", "Companion", "app_debug"}
)
public final class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private MyDBHelper helper;
    public static MainActivity appContext;
    public static SharedPreferences sharedPreferences;
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker)null);

    @RequiresApi(33)
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestPermission();
        appContext = (MainActivity)this;
        SharedPreferences var10000 = this.getSharedPreferences("cylost", 0);
        Intrinsics.checkNotNullExpressionValue(var10000, "getSharedPreferences(\"cylost\", MODE_PRIVATE)");
        sharedPreferences = var10000;
        FragmentManager var6 = this.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(var6, "supportFragmentManager");
        FragmentManager fgmr = var6;
        ActivityMainBinding var10001 = ActivityMainBinding.inflate(this.getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(var10001, "ActivityMainBinding.inflate(layoutInflater)");
        this.binding = var10001;
        var10001 = this.binding;
        if (var10001 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        this.setContentView((View)var10001.getRoot());
        ActivityMainBinding var7 = this.binding;
        if (var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        BottomNavigationView var8 = var7.navView;
        Intrinsics.checkNotNullExpressionValue(var8, "binding.navView");
        BottomNavigationView navView = var8;
        Fragment var9 = fgmr.findFragmentById(id.fragment);
        if (var9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        } else {
            NavHostFragment navHostFragment = (NavHostFragment)var9;
            NavController navController = navHostFragment.getNavController();
            BottomNavigationViewKt.setupWithNavController((NavigationBarView)navView, navController);
            this.helper = new MyDBHelper((Context)this, (String)null, (SQLiteDatabase.CursorFactory)null, 0, 14, (DefaultConstructorMarker)null);
        }
    }

    @NotNull
    public final SQLiteDatabase getDatebase() {
        MyDBHelper var10000 = this.helper;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("helper");
        }

        SQLiteDatabase var1 = var10000.getWritableDatabase();
        Intrinsics.checkNotNullExpressionValue(var1, "helper.writableDatabase");
        return var1;
    }

    protected void onDestroy() {
        MyDBHelper var10000 = this.helper;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("helper");
        }

        var10000.getWritableDatabase().close();
        super.onDestroy();
    }

    private final void requestPermission() {
        if (ContextCompat.checkSelfPermission((Context)this, "android.permission.ACCESS_FINE_LOCATION") != 0 && ContextCompat.checkSelfPermission((Context)this, "android.permission.ACCESS_COARSE_LOCATION") != 0 || ContextCompat.checkSelfPermission((Context)this, "android.permission.INTERNET") != 0) {
            if (!ActivityCompat.shouldShowRequestPermissionRationale((Activity)this, "android.permission.ACCESS_FINE_LOCATION") && !ActivityCompat.shouldShowRequestPermissionRationale((Activity)this, "android.permission.ACCESS_COARSE_LOCATION") && !ActivityCompat.shouldShowRequestPermissionRationale((Activity)this, "android.permission.INTERNET")) {
                ActivityResultLauncher var10000 = this.registerForActivityResult((ActivityResultContract)(new ActivityResultContracts.RequestMultiplePermissions()), (ActivityResultCallback)null.INSTANCE);
                Intrinsics.checkNotNullExpressionValue(var10000, "registerForActivityResul…}\n            }\n        }");
                ActivityResultLauncher permissionRequest = var10000;
                permissionRequest.launch(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.INTERNET"});
            }
        }
    }

    @Metadata(
            mv = {1, 9, 0},
            k = 1,
            d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"},
            d2 = {"Lme/moty/cylost/MainActivity$Companion;", "", "()V", "appContext", "Lme/moty/cylost/MainActivity;", "getAppContext", "()Lme/moty/cylost/MainActivity;", "setAppContext", "(Lme/moty/cylost/MainActivity;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "app_debug"}
    )
    public static final class Companion {
        @NotNull
        public final MainActivity getAppContext() {
            MainActivity var10000 = MainActivity.appContext;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appContext");
            }

            return var10000;
        }

        public final void setAppContext(@NotNull MainActivity var1) {
            Intrinsics.checkNotNullParameter(var1, "<set-?>");
            MainActivity.appContext = var1;
        }

        @NotNull
        public final SharedPreferences getSharedPreferences() {
            SharedPreferences var10000 = MainActivity.sharedPreferences;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
            }

            return var10000;
        }

        public final void setSharedPreferences(@NotNull SharedPreferences var1) {
            Intrinsics.checkNotNullParameter(var1, "<set-?>");
            MainActivity.sharedPreferences = var1;
        }

        private Companion() {
        }

        // $FF: synthetic method
        public Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
