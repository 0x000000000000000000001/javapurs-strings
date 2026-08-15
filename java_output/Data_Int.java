public class Data_Int {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };
    // FFI provided by /Users/0x1/Documents/htdocs/javapurs/javapurs-strings/src/Data/Int.java
    public static final Object fromNumberImpl = (java.util.function.Function<Object, Object>) (just) -> (java.util.function.Function<Object, Object>) (nothing) -> (java.util.function.Function<Object, Object>) (n) -> {
        Double d = (Double) n;
        if (d.isNaN() || d.isInfinite() || Math.floor(d) != d) return nothing;
        return ((java.util.function.Function<Object, Object>) just).apply(d.intValue());
    };
    public static final Object fromStringAsImpl = (java.util.function.Function<Object, Object>) (just) -> (java.util.function.Function<Object, Object>) (nothing) -> (java.util.function.Function<Object, Object>) (radix) -> (java.util.function.Function<Object, Object>) (s) -> {
        try {
            return ((java.util.function.Function<Object, Object>) just).apply(Integer.parseInt((String) s, (Integer) radix));
        } catch (NumberFormatException e) {
            return nothing;
        }
    };
    public static final Object pow = (java.util.function.Function<Object, Object>) (x) -> (java.util.function.Function<Object, Object>) (y) -> (int) Math.pow((Integer) x, (Integer) y);
    public static final Object quot = (java.util.function.Function<Object, Object>) (x) -> (java.util.function.Function<Object, Object>) (y) -> ((Integer) x) / ((Integer) y);
    public static final Object rem = (java.util.function.Function<Object, Object>) (x) -> (java.util.function.Function<Object, Object>) (y) -> ((Integer) x) % ((Integer) y);
    public static final Object toNumber = (java.util.function.Function<Object, Object>) (n) -> ((Integer) n).doubleValue();
    public static final Object toStringAs = (java.util.function.Function<Object, Object>) (radix) -> (java.util.function.Function<Object, Object>) (i) -> Integer.toString((Integer) i, (Integer) radix);


public static final class Even {
            
            public Even() {
                
            }
        }
public static final class Odd {
            
            public Odd() {
                
            }
        }
public static final Object Even = new Data_Int.Even();
public static final Object Odd = new Data_Int.Odd();
public static final Object showParity = new java.util.LinkedHashMap<String, Object>() {{ put("show", (java.util.function.Function<Object, Object>) (v_0_i0) -> ( ((Boolean) ((v_0_i0 instanceof Data_Int.Even))) ? "Even" : ( ((Boolean) ((v_0_i0 instanceof Data_Int.Odd))) ? "Odd" : ((java.util.function.Supplier<Object>) () -> { throw new RuntimeException("Failed pattern match"); }).get()))); }};
public static final Object radix = (java.util.function.Function<Object, Object>) (n_0_i0) -> ( ((Boolean) ((((Boolean) ((((Integer) (n_0_i0)) >= ((Integer) (2))))) && ((Boolean) ((((Integer) (n_0_i0)) <= ((Integer) (36)))))))) ? new Data_Maybe.Just(n_0_i0) : new Data_Maybe.Nothing());
public static final Object odd = (java.util.function.Function<Object, Object>) (x_0_i0) -> (((Integer) ((((Integer) (x_0_i0)) & ((Integer) (1))))) != ((Integer) (0)));
public static final Object octal = 8;
public static final Object hexadecimal = 16;
public static final Object fromStringAs = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_Int.fromStringAsImpl)).apply(Data_Maybe.Just))).apply(new Data_Maybe.Nothing());
public static final Object fromString = ((java.util.function.Function<Object, Object>) (Data_Int.fromStringAs)).apply(10);
public static final Object fromNumber = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_Int.fromNumberImpl)).apply(Data_Maybe.Just))).apply(new Data_Maybe.Nothing());
public static final Object unsafeClamp = (java.util.function.Function<Object, Object>) (x_0_i0) -> ( ((Boolean) (!(((Boolean) (((java.util.function.Function<Object, Object>) (Data_Number.isFinite)).apply(x_0_i0)))))) ? 0 : ( ((Boolean) (!(((Boolean) ((((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_Ord.ordNumberImpl)).apply(new Data_Ordering.LT()))).apply(new Data_Ordering.EQ()))).apply(new Data_Ordering.GT()))).apply(x_0_i0))).apply(((java.util.function.Function<Object, Object>) (Data_Int.toNumber)).apply(Data_Bounded.topInt)) instanceof Data_Ordering.LT)))))) ? Data_Bounded.topInt : ( ((Boolean) (!(((Boolean) ((((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_Ord.ordNumberImpl)).apply(new Data_Ordering.LT()))).apply(new Data_Ordering.EQ()))).apply(new Data_Ordering.GT()))).apply(x_0_i0))).apply(((java.util.function.Function<Object, Object>) (Data_Int.toNumber)).apply(Data_Bounded.bottomInt)) instanceof Data_Ordering.GT)))))) ? Data_Bounded.bottomInt : ((java.util.function.Supplier<Object>) () -> { Object __local_var_1_i1 = ((java.util.function.Function<Object, Object>) (Data_Int.fromNumber)).apply(x_0_i0); return ( ((Boolean) ((__local_var_1_i1 instanceof Data_Maybe.Nothing))) ? 0 : ( ((Boolean) ((__local_var_1_i1 instanceof Data_Maybe.Just))) ? (((Data_Maybe.Just) __local_var_1_i1).value0) : ((java.util.function.Supplier<Object>) () -> { throw new RuntimeException("Failed pattern match"); }).get())); }).get())));
public static final Object round = (java.util.function.Function<Object, Object>) (x_0_i0) -> ((java.util.function.Function<Object, Object>) (Data_Int.unsafeClamp)).apply(((java.util.function.Function<Object, Object>) (Data_Number.round)).apply(x_0_i0));
public static final Object trunc = (java.util.function.Function<Object, Object>) (x_0_i0) -> ((java.util.function.Function<Object, Object>) (Data_Int.unsafeClamp)).apply(((java.util.function.Function<Object, Object>) (Data_Number.trunc)).apply(x_0_i0));
public static final Object floor = (java.util.function.Function<Object, Object>) (x_0_i0) -> ((java.util.function.Function<Object, Object>) (Data_Int.unsafeClamp)).apply(((java.util.function.Function<Object, Object>) (Data_Number.floor)).apply(x_0_i0));
public static final Object even = (java.util.function.Function<Object, Object>) (x_0_i0) -> (((Integer) ((((Integer) (x_0_i0)) & ((Integer) (1))))) == ((Integer) (0)));
public static final Object parity = (java.util.function.Function<Object, Object>) (n_0_i0) -> ( ((Boolean) ((((Integer) ((((Integer) (n_0_i0)) & ((Integer) (1))))) == ((Integer) (0))))) ? new Data_Int.Even() : new Data_Int.Odd());
public static final Object eqParity = new java.util.LinkedHashMap<String, Object>() {{ put("eq", (java.util.function.Function<Object, Object>) (x_0_i0) -> (java.util.function.Function<Object, Object>) (y_1_i1) -> ( ((Boolean) ((x_0_i0 instanceof Data_Int.Even))) ? (y_1_i1 instanceof Data_Int.Even) : (((Boolean) ((x_0_i0 instanceof Data_Int.Odd))) && ((Boolean) ((y_1_i1 instanceof Data_Int.Odd)))))); }};
public static final Object ordParity = new java.util.LinkedHashMap<String, Object>() {{ put("compare", (java.util.function.Function<Object, Object>) (x_0_i0) -> (java.util.function.Function<Object, Object>) (y_1_i1) -> ( ((Boolean) ((x_0_i0 instanceof Data_Int.Even))) ? ( ((Boolean) ((y_1_i1 instanceof Data_Int.Even))) ? new Data_Ordering.EQ() : new Data_Ordering.LT()) : ( ((Boolean) ((y_1_i1 instanceof Data_Int.Even))) ? new Data_Ordering.GT() : ( ((Boolean) ((((Boolean) ((x_0_i0 instanceof Data_Int.Odd))) && ((Boolean) ((y_1_i1 instanceof Data_Int.Odd)))))) ? new Data_Ordering.EQ() : ((java.util.function.Supplier<Object>) () -> { throw new RuntimeException("Failed pattern match"); }).get())))); put("Eq0", (java.util.function.Function<Object, Object>) (_dollar___unused_0_i2) -> Data_Int.eqParity); }};
public static final Object semiringParity = new java.util.LinkedHashMap<String, Object>() {{ put("zero", new Data_Int.Even()); put("add", (java.util.function.Function<Object, Object>) (x_0_i0) -> (java.util.function.Function<Object, Object>) (y_1_i1) -> ( ((Boolean) (( ((Boolean) ((x_0_i0 instanceof Data_Int.Even))) ? (y_1_i1 instanceof Data_Int.Even) : (((Boolean) ((x_0_i0 instanceof Data_Int.Odd))) && ((Boolean) ((y_1_i1 instanceof Data_Int.Odd))))))) ? new Data_Int.Even() : new Data_Int.Odd())); put("one", new Data_Int.Odd()); put("mul", (java.util.function.Function<Object, Object>) (v_0_i2) -> (java.util.function.Function<Object, Object>) (v1_1_i3) -> ( ((Boolean) ((((Boolean) ((v_0_i2 instanceof Data_Int.Odd))) && ((Boolean) ((v1_1_i3 instanceof Data_Int.Odd)))))) ? new Data_Int.Odd() : new Data_Int.Even())); }};
public static final Object ringParity = new java.util.LinkedHashMap<String, Object>() {{ put("sub", (java.util.function.Function<Object, Object>) (x_0_i0) -> (java.util.function.Function<Object, Object>) (y_1_i1) -> ( ((Boolean) (( ((Boolean) ((x_0_i0 instanceof Data_Int.Even))) ? (y_1_i1 instanceof Data_Int.Even) : (((Boolean) ((x_0_i0 instanceof Data_Int.Odd))) && ((Boolean) ((y_1_i1 instanceof Data_Int.Odd))))))) ? new Data_Int.Even() : new Data_Int.Odd())); put("Semiring0", (java.util.function.Function<Object, Object>) (_dollar___unused_0_i2) -> Data_Int.semiringParity); }};
public static final Object divisionRingParity = new java.util.LinkedHashMap<String, Object>() {{ put("recip", (java.util.function.Function<Object, Object>) (x_0_i0) -> x_0_i0); put("Ring0", (java.util.function.Function<Object, Object>) (_dollar___unused_0_i1) -> Data_Int.ringParity); }};
public static final Object decimal = 10;
public static final Object commutativeRingParity = new java.util.LinkedHashMap<String, Object>() {{ put("Ring0", (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> Data_Int.ringParity); }};
public static final Object euclideanRingParity = new java.util.LinkedHashMap<String, Object>() {{ put("degree", (java.util.function.Function<Object, Object>) (v_0_i0) -> ( ((Boolean) ((v_0_i0 instanceof Data_Int.Even))) ? 0 : ( ((Boolean) ((v_0_i0 instanceof Data_Int.Odd))) ? 1 : ((java.util.function.Supplier<Object>) () -> { throw new RuntimeException("Failed pattern match"); }).get()))); put("div", (java.util.function.Function<Object, Object>) (x_0_i1) -> (java.util.function.Function<Object, Object>) (v_1_i2) -> x_0_i1); put("mod", (java.util.function.Function<Object, Object>) (v_0_i3) -> (java.util.function.Function<Object, Object>) (v1_1_i4) -> new Data_Int.Even()); put("CommutativeRing0", (java.util.function.Function<Object, Object>) (_dollar___unused_0_i5) -> Data_Int.commutativeRingParity); }};
public static final Object ceil = (java.util.function.Function<Object, Object>) (x_0_i0) -> ((java.util.function.Function<Object, Object>) (Data_Int.unsafeClamp)).apply(((java.util.function.Function<Object, Object>) (Data_Number.ceil)).apply(x_0_i0));
public static final Object boundedParity = new java.util.LinkedHashMap<String, Object>() {{ put("bottom", new Data_Int.Even()); put("top", new Data_Int.Odd()); put("Ord0", (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> Data_Int.ordParity); }};
public static final Object binary = 2;
public static final Object base36 = 36;
}
