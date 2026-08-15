public class Control_Semigroupoid {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };


public static final Object semigroupoidFn = new java.util.LinkedHashMap<String, Object>() {{ put("compose", (java.util.function.Function<Object, Object>) (f_0_i0) -> (java.util.function.Function<Object, Object>) (g_1_i1) -> (java.util.function.Function<Object, Object>) (x_2_i2) -> ((java.util.function.Function<Object, Object>) (f_0_i0)).apply(((java.util.function.Function<Object, Object>) (g_1_i1)).apply(x_2_i2))); }};
public static final Object compose = (java.util.function.Function<Object, Object>) (dict_0_i0) -> ((java.util.LinkedHashMap<String, Object>) dict_0_i0).get("compose");
public static final Object composeFlipped = (java.util.function.Function<Object, Object>) (dictSemigroupoid_0_i0) -> (java.util.function.Function<Object, Object>) (f_1_i1) -> (java.util.function.Function<Object, Object>) (g_2_i2) -> ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictSemigroupoid_0_i0).get("compose"))).apply(g_2_i2))).apply(f_1_i1);
}
