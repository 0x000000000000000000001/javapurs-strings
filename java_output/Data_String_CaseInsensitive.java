public class Data_String_CaseInsensitive {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };


public static final Object CaseInsensitiveString = (java.util.function.Function<Object, Object>) (x_0_i0) -> x_0_i0;
public static final Object showCaseInsensitiveString = new java.util.LinkedHashMap<String, Object>() {{ put("show", (java.util.function.Function<Object, Object>) (v_0_i0) -> (((String) ((((String) ("(CaseInsensitiveString ")) + ((String) (((java.util.function.Function<Object, Object>) (Data_Show.showStringImpl)).apply(v_0_i0)))))) + ((String) (")")))); }};
public static final Object newtypeCaseInsensitiveString = new java.util.LinkedHashMap<String, Object>() {{ put("Coercible0", (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> null /* TODO: PrimUndefined */); }};
public static final Object eqCaseInsensitiveString = new java.util.LinkedHashMap<String, Object>() {{ put("eq", (java.util.function.Function<Object, Object>) (v_0_i0) -> (java.util.function.Function<Object, Object>) (v1_1_i1) -> java.util.Objects.equals(((java.util.function.Function<Object, Object>) (Data_String_Common.toLower)).apply(v_0_i0), ((java.util.function.Function<Object, Object>) (Data_String_Common.toLower)).apply(v1_1_i1))); }};
public static final Object ordCaseInsensitiveString = new java.util.LinkedHashMap<String, Object>() {{ put("compare", (java.util.function.Function<Object, Object>) (v_0_i0) -> (java.util.function.Function<Object, Object>) (v1_1_i1) -> ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_Ord.ordStringImpl)).apply(new Data_Ordering.LT()))).apply(new Data_Ordering.EQ()))).apply(new Data_Ordering.GT()))).apply(((java.util.function.Function<Object, Object>) (Data_String_Common.toLower)).apply(v_0_i0)))).apply(((java.util.function.Function<Object, Object>) (Data_String_Common.toLower)).apply(v1_1_i1))); put("Eq0", (java.util.function.Function<Object, Object>) (_dollar___unused_0_i2) -> Data_String_CaseInsensitive.eqCaseInsensitiveString); }};
}
