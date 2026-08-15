public class Data_Array_Partial {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };


public static final Object tail = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> (java.util.function.Function<Object, Object>) (xs_1_i1) -> ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_Array.sliceImpl)).apply(1))).apply((((Object[]) ((Object[]) (xs_1_i1))).length)))).apply(xs_1_i1);
public static final Object last = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> (java.util.function.Function<Object, Object>) (xs_1_i1) -> null /* TODO: Op2 */;
public static final Object init = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> (java.util.function.Function<Object, Object>) (xs_1_i1) -> ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_Array.sliceImpl)).apply(0))).apply((((Integer) ((((Object[]) ((Object[]) (xs_1_i1))).length))) - ((Integer) (1)))))).apply(xs_1_i1);
public static final Object head = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> (java.util.function.Function<Object, Object>) (xs_1_i1) -> null /* TODO: Op2 */;
}
