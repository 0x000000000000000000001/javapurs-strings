public class Data_Profunctor_Split {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };


public static final class SplitF {
            public final Object value0;
            public final Object value1;
            public final Object value2;
            public SplitF(Object value0, Object value1, Object value2) {
                this.value0 = value0;
                this.value1 = value1;
                this.value2 = value2;
            }
        }
public static final Object SplitF = (java.util.function.Function<Object, Object>) (value0_i0) -> (java.util.function.Function<Object, Object>) (value1_i0) -> (java.util.function.Function<Object, Object>) (value2_i0) -> new Data_Profunctor_Split.SplitF(value0_i0, value1_i0, value2_i0);
public static final Object unSplit = (java.util.function.Function<Object, Object>) (f_0_i0) -> (java.util.function.Function<Object, Object>) (v_1_i1) -> ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (f_0_i0)).apply((((Data_Profunctor_Split.SplitF) v_1_i1).value0)))).apply((((Data_Profunctor_Split.SplitF) v_1_i1).value1)))).apply((((Data_Profunctor_Split.SplitF) v_1_i1).value2));
public static final Object split = (java.util.function.Function<Object, Object>) (f_0_i0) -> (java.util.function.Function<Object, Object>) (g_1_i1) -> (java.util.function.Function<Object, Object>) (fx_2_i2) -> new Data_Profunctor_Split.SplitF(f_0_i0, g_1_i1, fx_2_i2);
public static final Object profunctorSplit = new java.util.LinkedHashMap<String, Object>() {{ put("dimap", (java.util.function.Function<Object, Object>) (f_0_i0) -> (java.util.function.Function<Object, Object>) (g_1_i1) -> (java.util.function.Function<Object, Object>) (v_2_i2) -> new Data_Profunctor_Split.SplitF((java.util.function.Function<Object, Object>) (x_3_i3) -> ((java.util.function.Function<Object, Object>) ((((Data_Profunctor_Split.SplitF) v_2_i2).value0))).apply(((java.util.function.Function<Object, Object>) (f_0_i0)).apply(x_3_i3)), (java.util.function.Function<Object, Object>) (x_3_i4) -> ((java.util.function.Function<Object, Object>) (g_1_i1)).apply(((java.util.function.Function<Object, Object>) ((((Data_Profunctor_Split.SplitF) v_2_i2).value1))).apply(x_3_i4)), (((Data_Profunctor_Split.SplitF) v_2_i2).value2))); }};
public static final Object lowerSplit = (java.util.function.Function<Object, Object>) (dictInvariant_0_i0) -> (java.util.function.Function<Object, Object>) (v_1_i1) -> ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictInvariant_0_i0).get("imap"))).apply((((Data_Profunctor_Split.SplitF) v_1_i1).value1)))).apply((((Data_Profunctor_Split.SplitF) v_1_i1).value0)))).apply((((Data_Profunctor_Split.SplitF) v_1_i1).value2));
public static final Object liftSplit = (java.util.function.Function<Object, Object>) (fx_0_i0) -> new Data_Profunctor_Split.SplitF((java.util.function.Function<Object, Object>) (x_1_i1) -> x_1_i1, (java.util.function.Function<Object, Object>) (x_1_i2) -> x_1_i2, fx_0_i0);
public static final Object hoistSplit = (java.util.function.Function<Object, Object>) (nat_0_i0) -> (java.util.function.Function<Object, Object>) (v_1_i1) -> new Data_Profunctor_Split.SplitF((((Data_Profunctor_Split.SplitF) v_1_i1).value0), (((Data_Profunctor_Split.SplitF) v_1_i1).value1), ((java.util.function.Function<Object, Object>) (nat_0_i0)).apply((((Data_Profunctor_Split.SplitF) v_1_i1).value2)));
public static final Object functorSplit = new java.util.LinkedHashMap<String, Object>() {{ put("map", (java.util.function.Function<Object, Object>) (f_0_i0) -> (java.util.function.Function<Object, Object>) (v_1_i1) -> new Data_Profunctor_Split.SplitF((((Data_Profunctor_Split.SplitF) v_1_i1).value0), (java.util.function.Function<Object, Object>) (x_2_i2) -> ((java.util.function.Function<Object, Object>) (f_0_i0)).apply(((java.util.function.Function<Object, Object>) ((((Data_Profunctor_Split.SplitF) v_1_i1).value1))).apply(x_2_i2)), (((Data_Profunctor_Split.SplitF) v_1_i1).value2))); }};
}
