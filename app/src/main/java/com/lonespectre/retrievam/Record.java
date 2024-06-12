// Record.java
package com.lonespectre.retrievam;

import android.graphics.Bitmap;
import com.google.android.gms.maps.model.LatLng;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 9, 0},
        k = 1,
        d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000eHÆ\u0003Ju\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0005HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00061"},
        d2 = {"Lme/moty/cylost/Record;", "", "id", "", "owner", "", "content", "loc", "date", "type", "Lme/moty/cylost/RecordType;", "pin", "Lcom/google/android/gms/maps/model/LatLng;", "image1", "Landroid/graphics/Bitmap;", "image2", "image3", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lme/moty/cylost/RecordType;Lcom/google/android/gms/maps/model/LatLng;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V", "getContent", "()Ljava/lang/String;", "getDate", "getId", "getImage1", "()Landroid/graphics/Bitmap;", "getImage2", "getImage3", "getLoc", "getOwner", "()I", "getPin", "()Lcom/google/android/gms/maps/model/LatLng;", "getType", "()Lme/moty/cylost/RecordType;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}
)
public final class Record {
    @NotNull
    private final String id;
    private final int owner;
    @NotNull
    private final String content;
    @NotNull
    private final String loc;
    @NotNull
    private final String date;
    @NotNull
    private final RecordType type;
    @Nullable
    private final LatLng pin;
    @Nullable
    private final Bitmap image1;
    @Nullable
    private final Bitmap image2;
    @Nullable
    private final Bitmap image3;

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final int getOwner() {
        return this.owner;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final String getLoc() {
        return this.loc;
    }

    @NotNull
    public final String getDate() {
        return this.date;
    }

    @NotNull
    public final RecordType getType() {
        return this.type;
    }

    @Nullable
    public final LatLng getPin() {
        return this.pin;
    }

    @Nullable
    public final Bitmap getImage1() {
        return this.image1;
    }

    @Nullable
    public final Bitmap getImage2() {
        return this.image2;
    }

    @Nullable
    public final Bitmap getImage3() {
        return this.image3;
    }

    public Record(@NotNull String id, int owner, @NotNull String content, @NotNull String loc, @NotNull String date, @NotNull RecordType type, @Nullable LatLng pin, @Nullable Bitmap image1, @Nullable Bitmap image2, @Nullable Bitmap image3) {
        super();
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(loc, "loc");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(type, "type");
        this.id = id;
        this.owner = owner;
        this.content = content;
        this.loc = loc;
        this.date = date;
        this.type = type;
        this.pin = pin;
        this.image1 = image1;
        this.image2 = image2;
        this.image3 = image3;
    }

    @NotNull
    public final String component1() {
        return this.id;
    }

    public final int component2() {
        return this.owner;
    }

    @NotNull
    public final String component3() {
        return this.content;
    }

    @NotNull
    public final String component4() {
        return this.loc;
    }

    @NotNull
    public final String component5() {
        return this.date;
    }

    @NotNull
    public final RecordType component6() {
        return this.type;
    }

    @Nullable
    public final LatLng component7() {
        return this.pin;
    }

    @Nullable
    public final Bitmap component8() {
        return this.image1;
    }

    @Nullable
    public final Bitmap component9() {
        return this.image2;
    }

    @Nullable
    public final Bitmap component10() {
        return this.image3;
    }

    @NotNull
    public final Record copy(@NotNull String id, int owner, @NotNull String content, @NotNull String loc, @NotNull String date, @NotNull RecordType type, @Nullable LatLng pin, @Nullable Bitmap image1, @Nullable Bitmap image2, @Nullable Bitmap image3) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(loc, "loc");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(type, "type");
        return new Record(id, owner, content, loc, date, type, pin, image1, image2, image3);
    }

    // $FF: synthetic method
    public static Record copy$default(Record var0, String var1, int var2, String var3, String var4, String var5, RecordType var6, LatLng var7, Bitmap var8, Bitmap var9, Bitmap var10, int var11, Object var12) {
        if ((var11 & 1) != 0) {
            var1 = var0.id;
        }

        if ((var11 & 2) != 0) {
            var2 = var0.owner;
        }

        if ((var11 & 4) != 0) {
            var3 = var0.content;
        }

        if ((var11 & 8) != 0) {
            var4 = var0.loc;
        }

        if ((var11 & 16) != 0) {
            var5 = var0.date;
        }

        if ((var11 & 32) != 0) {
            var6 = var0.type;
        }

        if ((var11 & 64) != 0) {
            var7 = var0.pin;
        }

        if ((var11 & 128) != 0) {
            var8 = var0.image1;
        }

        if ((var11 & 256) != 0) {
            var9 = var0.image2;
        }

        if ((var11 & 512) != 0) {
            var10 = var0.image3;
        }

        return var0.copy(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
    }

    @NotNull
    public String toString() {
        return "Record(id=" + this.id + ", owner=" + this.owner + ", content=" + this.content + ", loc=" + this.loc + ", date=" + this.date + ", type=" + this.type + ", pin=" + this.pin + ", image1=" + this.image1 + ", image2=" + this.image2 + ", image3=" + this.image3 + ")";
    }

    public int hashCode() {
        String var10000 = this.id;
        int var1 = ((var10000 != null ? var10000.hashCode() : 0) * 31 + Integer.hashCode(this.owner)) * 31;
        String var10001 = this.content;
        var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        var10001 = this.loc;
        var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        var10001 = this.date;
        var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        RecordType var2 = this.type;
        var1 = (var1 + (var2 != null ? var2.hashCode() : 0)) * 31;
        LatLng var3 = this.pin;
        var1 = (var1 + (var3 != null ? var3.hashCode() : 0)) * 31;
        Bitmap var4 = this.image1;
        var1 = (var1 + (var4 != null ? var4.hashCode() : 0)) * 31;
        var4 = this.image2;
        var1 = (var1 + (var4 != null ? var4.hashCode() : 0)) * 31;
        var4 = this.image3;
        return var1 + (var4 != null ? var4.hashCode() : 0);
    }

    public boolean equals(@Nullable Object var1) {
        if (this != var1) {
            if (var1 instanceof Record) {
                Record var2 = (Record)var1;
                if (Intrinsics.areEqual(this.id, var2.id) && this.owner == var2.owner && Intrinsics.areEqual(this.content, var2.content) && Intrinsics.areEqual(this.loc, var2.loc) && Intrinsics.areEqual(this.date, var2.date) && Intrinsics.areEqual(this.type, var2.type) && Intrinsics.areEqual(this.pin, var2.pin) && Intrinsics.areEqual(this.image1, var2.image1) && Intrinsics.areEqual(this.image2, var2.image2) && Intrinsics.areEqual(this.image3, var2.image3)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}
// RecordType.java

@Metadata(
        mv = {1, 9, 0},
        k = 1,
        d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"},
        d2 = {"Lme/moty/cylost/RecordType;", "", "display", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getDisplay", "()Ljava/lang/String;", "KEYS", "CASH", "STUID", "WALLET", "HEADPHONE", "UMBRELLA", "CLOTHS", "GLASSES", "ID", "BOTTLE", "OTHERS", "app_debug"}
)
enum RecordType {
    KEYS("Key"),
    CASH("Cash"),
    STUID("Student ID"),
    WALLET("Wallet"),
    HEADPHONE("Headphones"),
    UMBRELLA("Umbrella"),
    CLOTHS("Clothing"),
    GLASSES("Glasses"),
    ID("ID Card"),
    BOTTLE("Kettle"),
    OTHERS("Others");

    @NotNull
    private final String display;

    @NotNull
    public final String getDisplay() {
        return this.display;
    }

    private RecordType(String display) {
        this.display = display;
    }
}
