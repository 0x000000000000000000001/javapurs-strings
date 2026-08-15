public class Data_Equivalence {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };


public static final Object Equivalence = (java.util.function.Function<Object, Object>) (x_0_i0) -> x_0_i0;
public static final Object semigroupEquivalence = new java.util.LinkedHashMap<String, Object>() {{ put("append", (java.util.function.Function<Object, Object>) (v_0_i0) -> (java.util.function.Function<Object, Object>) (v1_1_i1) -> (java.util.function.Function<Object, Object>) (a_2_i2) -> (java.util.function.Function<Object, Object>) (b_3_i3) -> (((Boolean) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (v_0_i0)).apply(a_2_i2))).apply(b_3_i3))) && ((Boolean) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (v1_1_i1)).apply(a_2_i2))).apply(b_3_i3))))); }};
public static final Object newtypeEquivalence = new java.util.LinkedHashMap<String, Object>() {{ put("Coercible0", (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> null /* TODO: PrimUndefined */); }};
public static final Object monoidEquivalence = new java.util.LinkedHashMap<String, Object>() {{ put("mempty", (java.util.function.Function<Object, Object>) (v_0_i0) -> (java.util.function.Function<Object, Object>) (v1_1_i1) -> true); put("Semigroup0", (java.util.function.Function<Object, Object>) (_dollar___unused_0_i2) -> Data_Equivalence.semigroupEquivalence); }};
public static final Object defaultEquivalence = (java.util.function.Function<Object, Object>) (dictEq_0_i0) -> ((java.util.LinkedHashMap<String, Object>) dictEq_0_i0).get("eq");
public static final Object contravariantEquivalence = new java.util.LinkedHashMap<String, Object>() {{ put("cmap", (java.util.function.Function<Object, Object>) (f_0_i0) -> (java.util.function.Function<Object, Object>) (v_1_i1) -> (java.util.function.Function<Object, Object>) (x_2_i2) -> (java.util.function.Function<Object, Object>) (y_3_i3) -> ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (v_1_i1)).apply(((java.util.function.Function<Object, Object>) (f_0_i0)).apply(x_2_i2)))).apply(((java.util.function.Function<Object, Object>) (f_0_i0)).apply(y_3_i3))); }};
public static final Object comparisonEquivalence = (java.util.function.Function<Object, Object>) (v_0_i0) -> (java.util.function.Function<Object, Object>) (a_1_i1) -> (java.util.function.Function<Object, Object>) (b_2_i2) -> (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (v_0_i0)).apply(a_1_i1))).apply(b_2_i2) instanceof Data_Ordering.EQ);
}
