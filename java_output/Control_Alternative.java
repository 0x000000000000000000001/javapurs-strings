public class Control_Alternative {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };


public static final Object guard = (java.util.function.Function<Object, Object>) (dictAlternative_0_i0) -> ((java.util.function.Supplier<Object>) () -> { Object Applicative0_1_i1 = ((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictAlternative_0_i0).get("Applicative0"))).apply(null /* TODO: PrimUndefined */); return ((java.util.function.Supplier<Object>) () -> { Object empty_2_i2 = ((java.util.LinkedHashMap<String, Object>) ((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictAlternative_0_i0).get("Plus1"))).apply(null /* TODO: PrimUndefined */)).get("empty"); return (java.util.function.Function<Object, Object>) (v_3_i3) -> ( ((Boolean) (v_3_i3)) ? ((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) Applicative0_1_i1).get("pure"))).apply(Data_Unit.unit) : empty_2_i2); }).get(); }).get();
public static final Object alternativeArray = new java.util.LinkedHashMap<String, Object>() {{ put("Applicative0", (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> Control_Applicative.applicativeArray); put("Plus1", (java.util.function.Function<Object, Object>) (_dollar___unused_0_i1) -> Control_Plus.plusArray); }};
}
