public class Effect_Class {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };


public static final Object monadEffectEffect = new java.util.LinkedHashMap<String, Object>() {{ put("liftEffect", (java.util.function.Function<Object, Object>) (x_0_i0) -> x_0_i0); put("Monad0", (java.util.function.Function<Object, Object>) (_dollar___unused_0_i1) -> Effect.monadEffect); }};
public static final Object liftEffect = (java.util.function.Function<Object, Object>) (dict_0_i0) -> ((java.util.LinkedHashMap<String, Object>) dict_0_i0).get("liftEffect");
}
