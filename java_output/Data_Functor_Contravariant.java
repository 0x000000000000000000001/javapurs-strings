public class Data_Functor_Contravariant {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };


public static final Object contravariantConst = new java.util.LinkedHashMap<String, Object>() {{ put("cmap", (java.util.function.Function<Object, Object>) (v_0_i0) -> (java.util.function.Function<Object, Object>) (v1_1_i1) -> v1_1_i1); }};
public static final Object cmap = (java.util.function.Function<Object, Object>) (dict_0_i0) -> ((java.util.LinkedHashMap<String, Object>) dict_0_i0).get("cmap");
public static final Object cmapFlipped = (java.util.function.Function<Object, Object>) (dictContravariant_0_i0) -> (java.util.function.Function<Object, Object>) (x_1_i1) -> (java.util.function.Function<Object, Object>) (f_2_i2) -> ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictContravariant_0_i0).get("cmap"))).apply(f_2_i2))).apply(x_1_i1);
public static final Object coerce = (java.util.function.Function<Object, Object>) (dictContravariant_0_i0) -> (java.util.function.Function<Object, Object>) (dictFunctor_1_i1) -> (java.util.function.Function<Object, Object>) (a_2_i2) -> ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictFunctor_1_i1).get("map"))).apply(Data_Void.absurd))).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictContravariant_0_i0).get("cmap"))).apply(Data_Void.absurd))).apply(a_2_i2));
public static final Object imapC = (java.util.function.Function<Object, Object>) (dictContravariant_0_i0) -> (java.util.function.Function<Object, Object>) (v_1_i1) -> (java.util.function.Function<Object, Object>) (f_2_i2) -> ((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictContravariant_0_i0).get("cmap"))).apply(f_2_i2);
}
