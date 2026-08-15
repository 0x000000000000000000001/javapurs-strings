public class Data_Monoid_Endo {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };


public static final Object Endo = (java.util.function.Function<Object, Object>) (x_0_i0) -> x_0_i0;
public static final Object showEndo = (java.util.function.Function<Object, Object>) (dictShow_0_i0) -> new java.util.LinkedHashMap<String, Object>() {{ put("show", (java.util.function.Function<Object, Object>) (v_1_i1) -> (((String) ((((String) ("(Endo ")) + ((String) (((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictShow_0_i0).get("show"))).apply(v_1_i1)))))) + ((String) (")")))); }};
public static final Object semigroupEndo = (java.util.function.Function<Object, Object>) (dictSemigroupoid_0_i0) -> new java.util.LinkedHashMap<String, Object>() {{ put("append", (java.util.function.Function<Object, Object>) (v_1_i1) -> (java.util.function.Function<Object, Object>) (v1_2_i2) -> ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictSemigroupoid_0_i0).get("compose"))).apply(v_1_i1))).apply(v1_2_i2)); }};
public static final Object ordEndo = (java.util.function.Function<Object, Object>) (dictOrd_0_i0) -> dictOrd_0_i0;
public static final Object monoidEndo = (java.util.function.Function<Object, Object>) (dictCategory_0_i0) -> ((java.util.function.Supplier<Object>) () -> { Object semigroupEndo1_1_i4 = ((java.util.function.Supplier<Object>) () -> { Object __local_var_1_i1 = ((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictCategory_0_i0).get("Semigroupoid0"))).apply(null /* TODO: PrimUndefined */); return new java.util.LinkedHashMap<String, Object>() {{ put("append", (java.util.function.Function<Object, Object>) (v_2_i2) -> (java.util.function.Function<Object, Object>) (v1_3_i3) -> ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) __local_var_1_i1).get("compose"))).apply(v_2_i2))).apply(v1_3_i3)); }}; }).get(); return new java.util.LinkedHashMap<String, Object>() {{ put("mempty", ((java.util.LinkedHashMap<String, Object>) dictCategory_0_i0).get("identity")); put("Semigroup0", (java.util.function.Function<Object, Object>) (_dollar___unused_2_i5) -> semigroupEndo1_1_i4); }}; }).get();
public static final Object eqEndo = (java.util.function.Function<Object, Object>) (dictEq_0_i0) -> dictEq_0_i0;
public static final Object boundedEndo = (java.util.function.Function<Object, Object>) (dictBounded_0_i0) -> dictBounded_0_i0;
}
