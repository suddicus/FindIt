package com.lonespectre.retrievam;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 9, 0},
        k = 1,
        d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\"\u0010\u000f\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0016J\"\u0010\u0012\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0016¨\u0006\u0014"},
        d2 = {"Lme/moty/cylost/MyDBHelper;", "Landroid/database/sqlite/SQLiteOpenHelper;", "context", "Landroid/content/Context;", "name", "", "factory", "Landroid/database/sqlite/SQLiteDatabase$CursorFactory;", "version", "", "(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V", "onCreate", "", "db", "Landroid/database/sqlite/SQLiteDatabase;", "onDowngrade", "oldVersion", "newVersion", "onUpgrade", "Companion", "app_debug"}
)
public final class MyDBHelper extends SQLiteOpenHelper {
    private static final String database = "CYLost";
    private static final int v = 2;
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker)null);

    public void onCreate(@Nullable SQLiteDatabase db) {
        if (db != null) {
            db.execSQL("CREATE TABLE Record(id INTEGER PRIMARY KEY, owner INTEGER NOT NULL, content VARCHAR(20) NOT NULL, loc VARCHAR(10) NOT NULL, date TEXT NOT NULL, type VARCHAR(10) NOT NULL,  pin TEXT, image1 BLOB, image2 BLOB, image3 BLOB)");
        }

    }

    public void onUpgrade(@Nullable SQLiteDatabase db, int oldVersion, int newVersion) {
        if (db != null) {
            db.execSQL("DROP TABLE IF EXISTS Record");
        }

        this.onCreate(db);
    }

    public void onDowngrade(@Nullable SQLiteDatabase db, int oldVersion, int newVersion) {
        if (db != null) {
            db.execSQL("DROP TABLE IF EXISTS Record");
        }

        this.onCreate(db);
    }

    public MyDBHelper(@NotNull Context context, @NotNull String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
    }

    // $FF: synthetic method
    public MyDBHelper(Context var1, String var2, SQLiteDatabase.CursorFactory var3, int var4, int var5, DefaultConstructorMarker var6) {
        this(var1, var2, var3, var4);
        if ((var5 & 2) != 0) {
            var2 = "CYLost";
        }

        if ((var5 & 4) != 0) {
            var3 = null;
        }

        if ((var5 & 8) != 0) {
            var4 = 2;
        }
    }

    @Metadata(
            mv = {1, 9, 0},
            k = 1,
            d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"},
            d2 = {"Lme/moty/cylost/MyDBHelper$Companion;", "", "()V", "database", "", "v", "", "app_debug"}
    )
    public static final class Companion {
        private Companion() {
        }

        // $FF: synthetic method
        public Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
