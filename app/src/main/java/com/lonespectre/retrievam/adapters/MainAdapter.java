// MainAdapter.java
package com.lonespectre.retrievam.adapters;
import android.content.Context;
import android.view.ViewGroup;
import android.view.View;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import com.lonespectre.retrievam.Record;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.lonespectre.retrievam.R.drawable;
import com.lonespectre.retrievam.R.id;
import com.lonespectre.retrievam.R.layout;
@Metadata(
        mv = {1, 9, 0},
        k = 1,
        d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0019H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001e"},
        d2 = {"Lme/moty/cylost/adapters/MainAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lme/moty/cylost/Record;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "imgListener", "Lme/moty/cylost/adapters/ImgBtnClickListener;", "getImgListener", "()Lme/moty/cylost/adapters/ImgBtnClickListener;", "setImgListener", "(Lme/moty/cylost/adapters/ImgBtnClickListener;)V", "itemListener", "Lme/moty/cylost/adapters/OnRecyclerViewClickListener;", "getItemListener", "()Lme/moty/cylost/adapters/OnRecyclerViewClickListener;", "setItemListener", "(Lme/moty/cylost/adapters/OnRecyclerViewClickListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_debug"}
)
public final class MainAdapter extends ListAdapter {
    @Nullable
    private ImgBtnClickListener imgListener;
    @Nullable
    private OnRecyclerViewClickListener itemListener;
    @NotNull
    private final Context context;

    @Nullable
    public final ImgBtnClickListener getImgListener() {
        return this.imgListener;
    }

    public final void setImgListener(@Nullable ImgBtnClickListener var1) {
        this.imgListener = var1;
    }

    @Nullable
    public final OnRecyclerViewClickListener getItemListener() {
        return this.itemListener;
    }

    public final void setItemListener(@Nullable OnRecyclerViewClickListener var1) {
        this.itemListener = var1;
    }

    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return ItemViewHolder.Companion.from(parent, this.imgListener, this.itemListener);
    }

    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof ItemViewHolder) {
            ItemViewHolder var10000 = (ItemViewHolder)holder;
            Object var10001 = this.getItem(position);
            Intrinsics.checkNotNullExpressionValue(var10001, "getItem(position)");
            var10000.bind((Record)var10001);
        }

    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public MainAdapter(@NotNull Context context) {
        super((DiffUtil.ItemCallback)(new DiffCallback()));
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }
}
// ImgBtnClickListener.java

@Metadata(
        mv = {1, 9, 0},
        k = 1,
        d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"},
        d2 = {"Lme/moty/cylost/adapters/ImgBtnClickListener;", "", "onItemClick", "", "view", "Landroid/view/View;", "pos", "", "item", "Lme/moty/cylost/Record;", "app_debug"}
)
interface ImgBtnClickListener {
    void onItemClick(@NotNull View var1, int var2, @NotNull Record var3);
}
// ItemViewHolder.java

@Metadata(
        mv = {1, 9, 0},
        k = 1,
        d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB#\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"},
        d2 = {"Lme/moty/cylost/adapters/ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "imgListener", "Lme/moty/cylost/adapters/ImgBtnClickListener;", "itemListener", "Lme/moty/cylost/adapters/OnRecyclerViewClickListener;", "(Landroid/view/View;Lme/moty/cylost/adapters/ImgBtnClickListener;Lme/moty/cylost/adapters/OnRecyclerViewClickListener;)V", "bind", "", "item", "Lme/moty/cylost/Record;", "Companion", "app_debug"}
)
public final class ItemViewHolder extends RecyclerView.ViewHolder {
    private final View view;
    private final ImgBtnClickListener imgListener;
    private final OnRecyclerViewClickListener itemListener;
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker)null);

    @SuppressLint({"SetTextI18n"})
    public final void bind(@NotNull final Record item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ImageView img = (ImageView)this.view.findViewById(id.img);
        TextView date = (TextView)this.view.findViewById(id.date);
        TextView loc = (TextView)this.view.findViewById(id.location);
        TextView content = (TextView)this.view.findViewById(id.content);
        final ImageButton imageButton = (ImageButton)this.itemView.findViewById(id.menu);
        if (item.getImage1() != null) {
            ((RequestBuilder)Glide.with(this.view).load(item.getImage1()).centerCrop()).into(img);
        } else {
            ((RequestBuilder)Glide.with(this.view).load(drawable.baseline_image_not_supported_24).centerCrop()).into(img);
        }

        if (this.itemListener != null) {
            this.itemView.setOnClickListener((View.OnClickListener)(new View.OnClickListener() {
                public final void onClick(View it) {
                    ItemViewHolder.this.itemListener.onItemClick(item);
                }
            }));
        }

        if (this.imgListener != null) {
            imageButton.setOnClickListener((View.OnClickListener)(new View.OnClickListener() {
                public final void onClick(View it) {
                    if (ItemViewHolder.this.imgListener != null) {
                        int position = ItemViewHolder.this.getAbsoluteAdapterPosition();
                        if (position != -1) {
                            ImgBtnClickListener var10000 = ItemViewHolder.this.imgListener;
                            ImageButton var10001 = imageButton;
                            Intrinsics.checkNotNullExpressionValue(var10001, "imageButton");
                            var10000.onItemClick((View)var10001, position, item);
                        }

                    }
                }
            }));
        }

        Intrinsics.checkNotNullExpressionValue(date, "date");
        date.setText((CharSequence)item.getDate());
        Intrinsics.checkNotNullExpressionValue(loc, "loc");
        loc.setText((CharSequence)("位置: " + item.getLoc()));
        Intrinsics.checkNotNullExpressionValue(content, "content");
        content.setText((CharSequence)item.getContent());
    }

    private ItemViewHolder(View view, ImgBtnClickListener imgListener, OnRecyclerViewClickListener itemListener) {
        super(view);
        this.view = view;
        this.imgListener = imgListener;
        this.itemListener = itemListener;
    }

    // $FF: synthetic method
    public ItemViewHolder(View view, ImgBtnClickListener imgListener, OnRecyclerViewClickListener itemListener, DefaultConstructorMarker $constructor_marker) {
        this(view, imgListener, itemListener);
    }

    @Metadata(
            mv = {1, 9, 0},
            k = 1,
            d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n¨\u0006\u000b"},
            d2 = {"Lme/moty/cylost/adapters/ItemViewHolder$Companion;", "", "()V", "from", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "imgListener", "Lme/moty/cylost/adapters/ImgBtnClickListener;", "itemListener", "Lme/moty/cylost/adapters/OnRecyclerViewClickListener;", "app_debug"}
    )
    public static final class Companion {
        @NotNull
        public final RecyclerView.ViewHolder from(@NotNull ViewGroup parent, @Nullable ImgBtnClickListener imgListener, @Nullable OnRecyclerViewClickListener itemListener) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            View binding = LayoutInflater.from(parent.getContext()).inflate(layout.adapter_main, parent, false);
            Intrinsics.checkNotNullExpressionValue(binding, "binding");
            return (RecyclerView.ViewHolder)(new ItemViewHolder(binding, imgListener, itemListener, (DefaultConstructorMarker)null));
        }

        private Companion() {
        }

        // $FF: synthetic method
        public Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
// DiffCallback.java

@Metadata(
        mv = {1, 9, 0},
        k = 1,
        d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\t"},
        d2 = {"Lme/moty/cylost/adapters/DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lme/moty/cylost/Record;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"}
)
final class DiffCallback extends DiffUtil.ItemCallback {
    public boolean areItemsTheSame(@NotNull Record oldItem, @NotNull Record newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.areEqual(oldItem.getId(), newItem.getId());
    }

    // $FF: synthetic method
    // $FF: bridge method
    public boolean areItemsTheSame(Object var1, Object var2) {
        return this.areItemsTheSame((Record)var1, (Record)var2);
    }

    public boolean areContentsTheSame(@NotNull Record oldItem, @NotNull Record newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.areEqual(oldItem, newItem);
    }

    // $FF: synthetic method
    // $FF: bridge method
    public boolean areContentsTheSame(Object var1, Object var2) {
        return this.areContentsTheSame((Record)var1, (Record)var2);
    }
}
// OnRecyclerViewClickListener.java

@Metadata(
        mv = {1, 9, 0},
        k = 1,
        d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"},
        d2 = {"Lme/moty/cylost/adapters/OnRecyclerViewClickListener;", "", "onItemClick", "", "record", "Lme/moty/cylost/Record;", "app_debug"}
)
interface OnRecyclerViewClickListener {
    void onItemClick(@NotNull Record var1);
}
