public class Data_Either_Inject {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };


public static final Object prj = (java.util.function.Function<Object, Object>) (dict_0_i0) -> ((java.util.LinkedHashMap<String, Object>) dict_0_i0).get("prj");
public static final Object injectReflexive = new java.util.LinkedHashMap<String, Object>() {{ put("inj", (java.util.function.Function<Object, Object>) (x_0_i0) -> x_0_i0); put("prj", Data_Maybe.Just); }};
public static final Object injectLeft = new java.util.LinkedHashMap<String, Object>() {{ put("inj", Data_Either.Left); put("prj", (java.util.function.Function<Object, Object>) (v2_0_i0) -> ( ((Boolean) ((v2_0_i0 instanceof Data_Either.Left))) ? new Data_Maybe.Just((((Data_Either.Left) v2_0_i0).value0)) : ( ((Boolean) ((v2_0_i0 instanceof Data_Either.Right))) ? new Data_Maybe.Nothing() : ((java.util.function.Supplier<Object>) () -> { throw new RuntimeException("Failed pattern match"); }).get()))); }};
public static final Object inj = (java.util.function.Function<Object, Object>) (dict_0_i0) -> ((java.util.LinkedHashMap<String, Object>) dict_0_i0).get("inj");
public static final Object injectRight = (java.util.function.Function<Object, Object>) (dictInject_0_i0) -> new java.util.LinkedHashMap<String, Object>() {{ put("inj", (java.util.function.Function<Object, Object>) (x_1_i1) -> new Data_Either.Right(((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictInject_0_i0).get("inj"))).apply(x_1_i1))); put("prj", (java.util.function.Function<Object, Object>) (v2_1_i2) -> ( ((Boolean) ((v2_1_i2 instanceof Data_Either.Left))) ? new Data_Maybe.Nothing() : ( ((Boolean) ((v2_1_i2 instanceof Data_Either.Right))) ? ((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictInject_0_i0).get("prj"))).apply((((Data_Either.Right) v2_1_i2).value0)) : ((java.util.function.Supplier<Object>) () -> { throw new RuntimeException("Failed pattern match"); }).get()))); }};
}
