public class Type_Equality {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };


public static final Object refl = new java.util.LinkedHashMap<String, Object>() {{ put("proof", (java.util.function.Function<Object, Object>) (a_0_i0) -> a_0_i0); put("Coercible0", (java.util.function.Function<Object, Object>) (_dollar___unused_0_i1) -> null /* TODO: PrimUndefined */); }};
public static final Object proof = (java.util.function.Function<Object, Object>) (dict_0_i0) -> ((java.util.LinkedHashMap<String, Object>) dict_0_i0).get("proof");
public static final Object to = (java.util.function.Function<Object, Object>) (dictTypeEquals_0_i0) -> ((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictTypeEquals_0_i0).get("proof"))).apply((java.util.function.Function<Object, Object>) (a_1_i1) -> a_1_i1);
public static final Object from = (java.util.function.Function<Object, Object>) (dictTypeEquals_0_i0) -> ((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictTypeEquals_0_i0).get("proof"))).apply((java.util.function.Function<Object, Object>) (a_1_i1) -> a_1_i1);
}
