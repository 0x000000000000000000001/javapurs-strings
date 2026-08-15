public class Data_Generic_Rep {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };


public static final class Inl {
            public final Object value0;
            public Inl(Object value0) {
                this.value0 = value0;
            }
        }
public static final class Inr {
            public final Object value0;
            public Inr(Object value0) {
                this.value0 = value0;
            }
        }
public static final class Product {
            public final Object value0;
            public final Object value1;
            public Product(Object value0, Object value1) {
                this.value0 = value0;
                this.value1 = value1;
            }
        }
public static final class NoArguments {
            
            public NoArguments() {
                
            }
        }
public static final Object Inl = (java.util.function.Function<Object, Object>) (value0_i0) -> new Data_Generic_Rep.Inl(value0_i0);
public static final Object Inr = (java.util.function.Function<Object, Object>) (value0_i0) -> new Data_Generic_Rep.Inr(value0_i0);
public static final Object Product = (java.util.function.Function<Object, Object>) (value0_i0) -> (java.util.function.Function<Object, Object>) (value1_i0) -> new Data_Generic_Rep.Product(value0_i0, value1_i0);
public static final Object NoArguments = new Data_Generic_Rep.NoArguments();
public static final Object Constructor = (java.util.function.Function<Object, Object>) (x_0_i0) -> x_0_i0;
public static final Object Argument = (java.util.function.Function<Object, Object>) (x_0_i0) -> x_0_i0;
public static final Object to = (java.util.function.Function<Object, Object>) (dict_0_i0) -> ((java.util.LinkedHashMap<String, Object>) dict_0_i0).get("to");
public static final Object showSum = (java.util.function.Function<Object, Object>) (dictShow_0_i0) -> (java.util.function.Function<Object, Object>) (dictShow1_1_i1) -> new java.util.LinkedHashMap<String, Object>() {{ put("show", (java.util.function.Function<Object, Object>) (v_2_i2) -> ( ((Boolean) ((v_2_i2 instanceof Data_Generic_Rep.Inl))) ? (((String) ((((String) ("(Inl ")) + ((String) (((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictShow_0_i0).get("show"))).apply((((Data_Generic_Rep.Inl) v_2_i2).value0))))))) + ((String) (")"))) : ( ((Boolean) ((v_2_i2 instanceof Data_Generic_Rep.Inr))) ? (((String) ((((String) ("(Inr ")) + ((String) (((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictShow1_1_i1).get("show"))).apply((((Data_Generic_Rep.Inr) v_2_i2).value0))))))) + ((String) (")"))) : ((java.util.function.Supplier<Object>) () -> { throw new RuntimeException("Failed pattern match"); }).get()))); }};
public static final Object showProduct = (java.util.function.Function<Object, Object>) (dictShow_0_i0) -> (java.util.function.Function<Object, Object>) (dictShow1_1_i1) -> new java.util.LinkedHashMap<String, Object>() {{ put("show", (java.util.function.Function<Object, Object>) (v_2_i2) -> (((String) ((((String) ((((String) ((((String) ("(Product ")) + ((String) (((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictShow_0_i0).get("show"))).apply((((Data_Generic_Rep.Product) v_2_i2).value0))))))) + ((String) (" "))))) + ((String) (((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictShow1_1_i1).get("show"))).apply((((Data_Generic_Rep.Product) v_2_i2).value1))))))) + ((String) (")")))); }};
public static final Object showNoArguments = new java.util.LinkedHashMap<String, Object>() {{ put("show", (java.util.function.Function<Object, Object>) (v_0_i0) -> "NoArguments"); }};
public static final Object showConstructor = (java.util.function.Function<Object, Object>) (dictIsSymbol_0_i0) -> (java.util.function.Function<Object, Object>) (dictShow_1_i1) -> new java.util.LinkedHashMap<String, Object>() {{ put("show", (java.util.function.Function<Object, Object>) (v_2_i2) -> (((String) ((((String) ((((String) ((((String) ("(Constructor @")) + ((String) (((java.util.function.Function<Object, Object>) (Data_Show.showStringImpl)).apply(((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictIsSymbol_0_i0).get("reflectSymbol"))).apply(new Type_Proxy.Proxy()))))))) + ((String) (" "))))) + ((String) (((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictShow_1_i1).get("show"))).apply(v_2_i2)))))) + ((String) (")")))); }};
public static final Object showArgument = (java.util.function.Function<Object, Object>) (dictShow_0_i0) -> new java.util.LinkedHashMap<String, Object>() {{ put("show", (java.util.function.Function<Object, Object>) (v_1_i1) -> (((String) ((((String) ("(Argument ")) + ((String) (((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictShow_0_i0).get("show"))).apply(v_1_i1)))))) + ((String) (")")))); }};
public static final Object repOf = (java.util.function.Function<Object, Object>) (dictGeneric_0_i0) -> (java.util.function.Function<Object, Object>) (v_1_i1) -> new Type_Proxy.Proxy();
public static final Object from = (java.util.function.Function<Object, Object>) (dict_0_i0) -> ((java.util.LinkedHashMap<String, Object>) dict_0_i0).get("from");
}
