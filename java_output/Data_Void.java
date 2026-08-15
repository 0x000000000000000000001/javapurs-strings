public class Data_Void {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };


public static final Object absurd = (java.util.function.Function<Object, Object>) (a_0_i0) -> ((new java.util.function.Supplier<Object>() { class LetRecScope { Object spin_1_i1; LetRecScope() { spin_1_i1 = (java.util.function.Function<Object, Object>) (v_2_i2) -> ((java.util.function.Supplier<Object>) () -> { Object __tco_v_2_i2 = v_2_i2; while(true) { final Object __final_v_2_i2 = __tco_v_2_i2; try { return ((java.util.function.Function<Object, Object>) (spin_1_i1)).apply(__final_v_2_i2); } catch (TcoLoop __tco_ex) { __tco_v_2_i2 = __tco_ex.args[0]; } } }).get(); } } LetRecScope _scope = new LetRecScope(); Object spin_1_i1 = _scope.spin_1_i1; public Object get() { return ((java.util.function.Function<Object, Object>) (spin_1_i1)).apply(a_0_i0); } })).get();
}
