public class Data_Show {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };
    // FFI provided by /Users/0x1/Documents/htdocs/javapurs/javapurs-strings/src/Data/Show.java
    public static final Object showStringImpl = (java.util.function.Function<Object, Object>) (str) -> "\"" + str.toString().replace("\"", "\\\"") + "\"";
    public static final Object showIntImpl = (java.util.function.Function<Object, Object>) (i) -> i.toString();
    public static final Object showNumberImpl = (java.util.function.Function<Object, Object>) (n) -> n.toString();
    public static final Object showCharImpl = (java.util.function.Function<Object, Object>) (c) -> "'" + c.toString() + "'";
    public static final Object showArrayImpl = (java.util.function.Function<Object, Object>) (f) -> (java.util.function.Function<Object, Object>) (arr) -> {
        Object[] a = (Object[]) arr;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < a.length; i++) {
            sb.append(((java.util.function.Function<Object, Object>) f).apply(a[i]).toString());
            if (i < a.length - 1) sb.append(",");
        }
        sb.append("]");
        return sb.toString();
    };


public static final Object showVoid = new java.util.LinkedHashMap<String, Object>() {{ put("show", Data_Void.absurd); }};
public static final Object showUnit = new java.util.LinkedHashMap<String, Object>() {{ put("show", (java.util.function.Function<Object, Object>) (v_0_i0) -> "unit"); }};
public static final Object showString = new java.util.LinkedHashMap<String, Object>() {{ put("show", Data_Show.showStringImpl); }};
public static final Object showRecordFieldsNil = new java.util.LinkedHashMap<String, Object>() {{ put("showRecordFields", (java.util.function.Function<Object, Object>) (v_0_i0) -> (java.util.function.Function<Object, Object>) (v1_1_i1) -> ""); }};
public static final Object showRecordFields = (java.util.function.Function<Object, Object>) (dict_0_i0) -> ((java.util.LinkedHashMap<String, Object>) dict_0_i0).get("showRecordFields");
public static final Object showRecord = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> (java.util.function.Function<Object, Object>) (_dollar___unused_1_i1) -> (java.util.function.Function<Object, Object>) (dictShowRecordFields_2_i2) -> new java.util.LinkedHashMap<String, Object>() {{ put("show", (java.util.function.Function<Object, Object>) (record_3_i3) -> (((String) ((((String) ("{")) + ((String) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictShowRecordFields_2_i2).get("showRecordFields"))).apply(new Type_Proxy.Proxy()))).apply(record_3_i3)))))) + ((String) ("}")))); }};
public static final Object showProxy = new java.util.LinkedHashMap<String, Object>() {{ put("show", (java.util.function.Function<Object, Object>) (v_0_i0) -> "Proxy"); }};
public static final Object showNumber = new java.util.LinkedHashMap<String, Object>() {{ put("show", Data_Show.showNumberImpl); }};
public static final Object showInt = new java.util.LinkedHashMap<String, Object>() {{ put("show", Data_Show.showIntImpl); }};
public static final Object showChar = new java.util.LinkedHashMap<String, Object>() {{ put("show", Data_Show.showCharImpl); }};
public static final Object showBoolean = new java.util.LinkedHashMap<String, Object>() {{ put("show", (java.util.function.Function<Object, Object>) (v_0_i0) -> ( ((Boolean) (v_0_i0)) ? "true" : "false")); }};
public static final Object show = (java.util.function.Function<Object, Object>) (dict_0_i0) -> ((java.util.LinkedHashMap<String, Object>) dict_0_i0).get("show");
public static final Object showArray = (java.util.function.Function<Object, Object>) (dictShow_0_i0) -> new java.util.LinkedHashMap<String, Object>() {{ put("show", ((java.util.function.Function<Object, Object>) (Data_Show.showArrayImpl)).apply(((java.util.LinkedHashMap<String, Object>) dictShow_0_i0).get("show"))); }};
public static final Object showRecordFieldsCons = (java.util.function.Function<Object, Object>) (dictIsSymbol_0_i0) -> (java.util.function.Function<Object, Object>) (dictShowRecordFields_1_i1) -> (java.util.function.Function<Object, Object>) (dictShow_2_i2) -> new java.util.LinkedHashMap<String, Object>() {{ put("showRecordFields", (java.util.function.Function<Object, Object>) (v_3_i3) -> (java.util.function.Function<Object, Object>) (record_4_i4) -> ((java.util.function.Supplier<Object>) () -> { Object key_5_i5 = ((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictIsSymbol_0_i0).get("reflectSymbol"))).apply(new Type_Proxy.Proxy()); return (((String) ((((String) ((((String) ((((String) ((((String) (" ")) + ((String) (key_5_i5))))) + ((String) (": "))))) + ((String) (((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictShow_2_i2).get("show"))).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Record_Unsafe.unsafeGet)).apply(key_5_i5))).apply(record_4_i4))))))) + ((String) (","))))) + ((String) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictShowRecordFields_1_i1).get("showRecordFields"))).apply(new Type_Proxy.Proxy()))).apply(record_4_i4)))); }).get()); }};
public static final Object showRecordFieldsConsNil = (java.util.function.Function<Object, Object>) (dictIsSymbol_0_i0) -> (java.util.function.Function<Object, Object>) (dictShow_1_i1) -> new java.util.LinkedHashMap<String, Object>() {{ put("showRecordFields", (java.util.function.Function<Object, Object>) (v_2_i2) -> (java.util.function.Function<Object, Object>) (record_3_i3) -> ((java.util.function.Supplier<Object>) () -> { Object key_4_i4 = ((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictIsSymbol_0_i0).get("reflectSymbol"))).apply(new Type_Proxy.Proxy()); return (((String) ((((String) ((((String) ((((String) (" ")) + ((String) (key_4_i4))))) + ((String) (": "))))) + ((String) (((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictShow_1_i1).get("show"))).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Record_Unsafe.unsafeGet)).apply(key_4_i4))).apply(record_3_i3))))))) + ((String) (" "))); }).get()); }};
}
