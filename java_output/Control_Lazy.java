public class Control_Lazy {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };


public static final Object lazyUnit = new java.util.LinkedHashMap<String, Object>() {{ put("defer", (java.util.function.Function<Object, Object>) (v_0_i0) -> Data_Unit.unit); }};
public static final Object lazyFn = new java.util.LinkedHashMap<String, Object>() {{ put("defer", (java.util.function.Function<Object, Object>) (f_0_i0) -> (java.util.function.Function<Object, Object>) (x_1_i1) -> ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (f_0_i0)).apply(Data_Unit.unit))).apply(x_1_i1)); }};
public static final Object defer = (java.util.function.Function<Object, Object>) (dict_0_i0) -> ((java.util.LinkedHashMap<String, Object>) dict_0_i0).get("defer");
public static final Object fix = (java.util.function.Function<Object, Object>) (dictLazy_0_i0) -> (java.util.function.Function<Object, Object>) (f_1_i1) -> ((new java.util.function.Supplier<Object>() { class LetRecScope { Object go__go_2_i2; LetRecScope() { go__go_2_i2 = ((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictLazy_0_i0).get("defer"))).apply((java.util.function.Function<Object, Object>) (v_3_i3) -> ((java.util.function.Function<Object, Object>) (f_1_i1)).apply(go__go_2_i2)); } } LetRecScope _scope = new LetRecScope(); Object go__go_2_i2 = _scope.go__go_2_i2; public Object get() { return go__go_2_i2; } })).get();
}
