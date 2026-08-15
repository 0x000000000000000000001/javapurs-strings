public class Data_Array_ST {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };
    public static Object cloneImpl = FFI_STUB;
    public static Object cloneImpl(Object... args) { return null; }
    public static Object freezeImpl = FFI_STUB;
    public static Object freezeImpl(Object... args) { return null; }
    public static Object lengthImpl = FFI_STUB;
    public static Object lengthImpl(Object... args) { return null; }
    public static Object $new = FFI_STUB;
    public static Object $new(Object... args) { return null; }
    public static Object peekImpl = FFI_STUB;
    public static Object peekImpl(Object... args) { return null; }
    public static Object pokeImpl = FFI_STUB;
    public static Object pokeImpl(Object... args) { return null; }
    public static Object popImpl = FFI_STUB;
    public static Object popImpl(Object... args) { return null; }
    public static Object pushAllImpl = FFI_STUB;
    public static Object pushAllImpl(Object... args) { return null; }
    public static Object pushImpl = FFI_STUB;
    public static Object pushImpl(Object... args) { return null; }
    public static Object shiftImpl = FFI_STUB;
    public static Object shiftImpl(Object... args) { return null; }
    public static Object sortByImpl = FFI_STUB;
    public static Object sortByImpl(Object... args) { return null; }
    public static Object spliceImpl = FFI_STUB;
    public static Object spliceImpl(Object... args) { return null; }
    public static Object thawImpl = FFI_STUB;
    public static Object thawImpl(Object... args) { return null; }
    public static Object toAssocArrayImpl = FFI_STUB;
    public static Object toAssocArrayImpl(Object... args) { return null; }
    public static Object unsafeFreezeImpl = FFI_STUB;
    public static Object unsafeFreezeImpl(Object... args) { return null; }
    public static Object unsafeThawImpl = FFI_STUB;
    public static Object unsafeThawImpl(Object... args) { return null; }
    public static Object unshiftAllImpl = FFI_STUB;
    public static Object unshiftAllImpl(Object... args) { return null; }

public static final Object unshiftAll = ((java.util.function.Function<Object, Object>) (Control_Monad_ST_Uncurried.runSTFn2)).apply(Data_Array_ST.unshiftAllImpl);
public static final Object unshift = (java.util.function.Function<Object, Object>) (a_0_i0) -> ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Control_Monad_ST_Uncurried.runSTFn2)).apply(Data_Array_ST.unshiftAllImpl))).apply(new Object[]{a_0_i0});
public static final Object unsafeThaw = ((java.util.function.Function<Object, Object>) (Control_Monad_ST_Uncurried.runSTFn1)).apply(Data_Array_ST.unsafeThawImpl);
public static final Object unsafeFreeze = ((java.util.function.Function<Object, Object>) (Control_Monad_ST_Uncurried.runSTFn1)).apply(Data_Array_ST.unsafeFreezeImpl);
public static final Object toAssocArray = ((java.util.function.Function<Object, Object>) (Control_Monad_ST_Uncurried.runSTFn1)).apply(Data_Array_ST.toAssocArrayImpl);
public static final Object thaw = ((java.util.function.Function<Object, Object>) (Control_Monad_ST_Uncurried.runSTFn1)).apply(Data_Array_ST.thawImpl);
public static final Object withArray = (java.util.function.Function<Object, Object>) (f_0_i0) -> (java.util.function.Function<Object, Object>) (xs_1_i1) -> ((java.util.function.Supplier<Object>) () -> { Object result_2_i2 = ((java.util.function.Function<Object, Object>) (Data_Array_ST.thawImpl)).apply(xs_1_i1); return ((java.util.function.Supplier<Object>) () -> { Object _dollar___unused_3_i3 = ((java.util.function.Function<Object, Object>) (f_0_i0)).apply(result_2_i2); return ((java.util.function.Function<Object, Object>) (Data_Array_ST.unsafeFreezeImpl)).apply(result_2_i2); }).get(); }).get();
public static final Object splice = ((java.util.function.Function<Object, Object>) (Control_Monad_ST_Uncurried.runSTFn4)).apply(Data_Array_ST.spliceImpl);
public static final Object sortBy = (java.util.function.Function<Object, Object>) (comp_0_i0) -> ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Control_Monad_ST_Uncurried.runSTFn3)).apply(Data_Array_ST.sortByImpl))).apply(comp_0_i0))).apply((java.util.function.Function<Object, Object>) (v_1_i1) -> ( ((Boolean) ((v_1_i1 instanceof Data_Ordering.GT))) ? 1 : ( ((Boolean) ((v_1_i1 instanceof Data_Ordering.EQ))) ? 0 : ( ((Boolean) ((v_1_i1 instanceof Data_Ordering.LT))) ? -1 : ((java.util.function.Supplier<Object>) () -> { throw new RuntimeException("Failed pattern match"); }).get()))));
public static final Object sortWith = (java.util.function.Function<Object, Object>) (dictOrd_0_i0) -> (java.util.function.Function<Object, Object>) (f_1_i1) -> ((java.util.function.Function<Object, Object>) (Data_Array_ST.sortBy)).apply((java.util.function.Function<Object, Object>) (x_2_i2) -> (java.util.function.Function<Object, Object>) (y_3_i3) -> ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictOrd_0_i0).get("compare"))).apply(((java.util.function.Function<Object, Object>) (f_1_i1)).apply(x_2_i2)))).apply(((java.util.function.Function<Object, Object>) (f_1_i1)).apply(y_3_i3)));
public static final Object sort = (java.util.function.Function<Object, Object>) (dictOrd_0_i0) -> ((java.util.function.Function<Object, Object>) (Data_Array_ST.sortBy)).apply(((java.util.LinkedHashMap<String, Object>) dictOrd_0_i0).get("compare"));
public static final Object shift = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Control_Monad_ST_Uncurried.runSTFn3)).apply(Data_Array_ST.shiftImpl))).apply(Data_Maybe.Just))).apply(new Data_Maybe.Nothing());
public static final Object run = (java.util.function.Function<Object, Object>) (st_0_i0) -> ((java.util.function.Function<Object, Object>) (Control_Monad_ST_Internal.run)).apply(((java.util.function.Supplier<Object>) () -> { Object __local_var_1_i1 = st_0_i0; return ((java.util.function.Function<Object, Object>) (Data_Array_ST.unsafeFreezeImpl)).apply(__local_var_1_i1); }).get());
public static final Object pushAll = ((java.util.function.Function<Object, Object>) (Control_Monad_ST_Uncurried.runSTFn2)).apply(Data_Array_ST.pushAllImpl);
public static final Object push = ((java.util.function.Function<Object, Object>) (Control_Monad_ST_Uncurried.runSTFn2)).apply(Data_Array_ST.pushImpl);
public static final Object pop = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Control_Monad_ST_Uncurried.runSTFn3)).apply(Data_Array_ST.popImpl))).apply(Data_Maybe.Just))).apply(new Data_Maybe.Nothing());
public static final Object poke = ((java.util.function.Function<Object, Object>) (Control_Monad_ST_Uncurried.runSTFn3)).apply(Data_Array_ST.pokeImpl);
public static final Object peek = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Control_Monad_ST_Uncurried.runSTFn4)).apply(Data_Array_ST.peekImpl))).apply(Data_Maybe.Just))).apply(new Data_Maybe.Nothing());
public static final Object modify = (java.util.function.Function<Object, Object>) (i_0_i0) -> (java.util.function.Function<Object, Object>) (f_1_i1) -> (java.util.function.Function<Object, Object>) (xs_2_i2) -> ((java.util.function.Supplier<Object>) () -> { Object entry_3_i3 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_Array_ST.peekImpl)).apply(Data_Maybe.Just))).apply(new Data_Maybe.Nothing()))).apply(i_0_i0))).apply(xs_2_i2); return ( ((Boolean) ((entry_3_i3 instanceof Data_Maybe.Just))) ? ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_Array_ST.pokeImpl)).apply(i_0_i0))).apply(((java.util.function.Function<Object, Object>) (f_1_i1)).apply((((Data_Maybe.Just) entry_3_i3).value0))))).apply(xs_2_i2) : ( ((Boolean) ((entry_3_i3 instanceof Data_Maybe.Nothing))) ? false : ((java.util.function.Supplier<Object>) () -> { throw new RuntimeException("Failed pattern match"); }).get())); }).get();
public static final Object length = ((java.util.function.Function<Object, Object>) (Control_Monad_ST_Uncurried.runSTFn1)).apply(Data_Array_ST.lengthImpl);
public static final Object freeze = ((java.util.function.Function<Object, Object>) (Control_Monad_ST_Uncurried.runSTFn1)).apply(Data_Array_ST.freezeImpl);
public static final Object clone = ((java.util.function.Function<Object, Object>) (Control_Monad_ST_Uncurried.runSTFn1)).apply(Data_Array_ST.cloneImpl);
}
