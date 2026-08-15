public class Data_Functor {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };
    public static Object arrayMap = FFI_STUB;
    public static Object arrayMap(Object... args) { return null; }

public static final Object map = (java.util.function.Function<Object, Object>) (dict_0_i0) -> ((java.util.LinkedHashMap<String, Object>) dict_0_i0).get("map");
public static final Object mapFlipped = (java.util.function.Function<Object, Object>) (dictFunctor_0_i0) -> (java.util.function.Function<Object, Object>) (fa_1_i1) -> (java.util.function.Function<Object, Object>) (f_2_i2) -> ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictFunctor_0_i0).get("map"))).apply(f_2_i2))).apply(fa_1_i1);
public static final Object $void = (java.util.function.Function<Object, Object>) (dictFunctor_0_i0) -> ((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictFunctor_0_i0).get("map"))).apply((java.util.function.Function<Object, Object>) (v_1_i1) -> Data_Unit.unit);
public static final Object voidLeft = (java.util.function.Function<Object, Object>) (dictFunctor_0_i0) -> (java.util.function.Function<Object, Object>) (f_1_i1) -> (java.util.function.Function<Object, Object>) (x_2_i2) -> ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictFunctor_0_i0).get("map"))).apply((java.util.function.Function<Object, Object>) (v_3_i3) -> x_2_i2))).apply(f_1_i1);
public static final Object voidRight = (java.util.function.Function<Object, Object>) (dictFunctor_0_i0) -> (java.util.function.Function<Object, Object>) (x_1_i1) -> ((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictFunctor_0_i0).get("map"))).apply((java.util.function.Function<Object, Object>) (v_2_i2) -> x_1_i1);
public static final Object functorProxy = new java.util.LinkedHashMap<String, Object>() {{ put("map", (java.util.function.Function<Object, Object>) (v_0_i0) -> (java.util.function.Function<Object, Object>) (v1_1_i1) -> new Type_Proxy.Proxy()); }};
public static final Object functorFn = new java.util.LinkedHashMap<String, Object>() {{ put("map", ((java.util.LinkedHashMap<String, Object>) Control_Semigroupoid.semigroupoidFn).get("compose")); }};
public static final Object functorArray = new java.util.LinkedHashMap<String, Object>() {{ put("map", Data_Functor.arrayMap); }};
public static final Object flap = (java.util.function.Function<Object, Object>) (dictFunctor_0_i0) -> (java.util.function.Function<Object, Object>) (ff_1_i1) -> (java.util.function.Function<Object, Object>) (x_2_i2) -> ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictFunctor_0_i0).get("map"))).apply((java.util.function.Function<Object, Object>) (f_3_i3) -> ((java.util.function.Function<Object, Object>) (f_3_i3)).apply(x_2_i2)))).apply(ff_1_i1);
}
