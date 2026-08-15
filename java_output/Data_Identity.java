public class Data_Identity {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };


public static final Object Identity = (java.util.function.Function<Object, Object>) (x_0_i0) -> x_0_i0;
public static final Object showIdentity = (java.util.function.Function<Object, Object>) (dictShow_0_i0) -> new java.util.LinkedHashMap<String, Object>() {{ put("show", (java.util.function.Function<Object, Object>) (v_1_i1) -> (((String) ((((String) ("(Identity ")) + ((String) (((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictShow_0_i0).get("show"))).apply(v_1_i1)))))) + ((String) (")")))); }};
public static final Object semiringIdentity = (java.util.function.Function<Object, Object>) (dictSemiring_0_i0) -> dictSemiring_0_i0;
public static final Object semigroupIdentity = (java.util.function.Function<Object, Object>) (dictSemigroup_0_i0) -> dictSemigroup_0_i0;
public static final Object ringIdentity = (java.util.function.Function<Object, Object>) (dictRing_0_i0) -> dictRing_0_i0;
public static final Object ordIdentity = (java.util.function.Function<Object, Object>) (dictOrd_0_i0) -> dictOrd_0_i0;
public static final Object newtypeIdentity = new java.util.LinkedHashMap<String, Object>() {{ put("Coercible0", (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> null /* TODO: PrimUndefined */); }};
public static final Object monoidIdentity = (java.util.function.Function<Object, Object>) (dictMonoid_0_i0) -> dictMonoid_0_i0;
public static final Object lazyIdentity = (java.util.function.Function<Object, Object>) (dictLazy_0_i0) -> dictLazy_0_i0;
public static final Object heytingAlgebraIdentity = (java.util.function.Function<Object, Object>) (dictHeytingAlgebra_0_i0) -> dictHeytingAlgebra_0_i0;
public static final Object functorIdentity = new java.util.LinkedHashMap<String, Object>() {{ put("map", (java.util.function.Function<Object, Object>) (f_0_i0) -> (java.util.function.Function<Object, Object>) (m_1_i1) -> ((java.util.function.Function<Object, Object>) (f_0_i0)).apply(m_1_i1)); }};
public static final Object invariantIdentity = new java.util.LinkedHashMap<String, Object>() {{ put("imap", (java.util.function.Function<Object, Object>) (f_0_i0) -> (java.util.function.Function<Object, Object>) (v_1_i1) -> (java.util.function.Function<Object, Object>) (m_2_i2) -> ((java.util.function.Function<Object, Object>) (f_0_i0)).apply(m_2_i2)); }};
public static final Object extendIdentity = new java.util.LinkedHashMap<String, Object>() {{ put("extend", (java.util.function.Function<Object, Object>) (f_0_i0) -> (java.util.function.Function<Object, Object>) (m_1_i1) -> ((java.util.function.Function<Object, Object>) (f_0_i0)).apply(m_1_i1)); put("Functor0", (java.util.function.Function<Object, Object>) (_dollar___unused_0_i2) -> Data_Identity.functorIdentity); }};
public static final Object euclideanRingIdentity = (java.util.function.Function<Object, Object>) (dictEuclideanRing_0_i0) -> dictEuclideanRing_0_i0;
public static final Object eqIdentity = (java.util.function.Function<Object, Object>) (dictEq_0_i0) -> dictEq_0_i0;
public static final Object eq1Identity = new java.util.LinkedHashMap<String, Object>() {{ put("eq1", (java.util.function.Function<Object, Object>) (dictEq_0_i0) -> ((java.util.LinkedHashMap<String, Object>) dictEq_0_i0).get("eq")); }};
public static final Object ord1Identity = new java.util.LinkedHashMap<String, Object>() {{ put("compare1", (java.util.function.Function<Object, Object>) (dictOrd_0_i0) -> ((java.util.LinkedHashMap<String, Object>) dictOrd_0_i0).get("compare")); put("Eq10", (java.util.function.Function<Object, Object>) (_dollar___unused_0_i1) -> Data_Identity.eq1Identity); }};
public static final Object comonadIdentity = new java.util.LinkedHashMap<String, Object>() {{ put("extract", (java.util.function.Function<Object, Object>) (v_0_i0) -> v_0_i0); put("Extend0", (java.util.function.Function<Object, Object>) (_dollar___unused_0_i1) -> Data_Identity.extendIdentity); }};
public static final Object commutativeRingIdentity = (java.util.function.Function<Object, Object>) (dictCommutativeRing_0_i0) -> dictCommutativeRing_0_i0;
public static final Object boundedIdentity = (java.util.function.Function<Object, Object>) (dictBounded_0_i0) -> dictBounded_0_i0;
public static final Object booleanAlgebraIdentity = (java.util.function.Function<Object, Object>) (dictBooleanAlgebra_0_i0) -> dictBooleanAlgebra_0_i0;
public static final Object applyIdentity = new java.util.LinkedHashMap<String, Object>() {{ put("apply", (java.util.function.Function<Object, Object>) (v_0_i0) -> (java.util.function.Function<Object, Object>) (v1_1_i1) -> ((java.util.function.Function<Object, Object>) (v_0_i0)).apply(v1_1_i1)); put("Functor0", (java.util.function.Function<Object, Object>) (_dollar___unused_0_i2) -> Data_Identity.functorIdentity); }};
public static final Object bindIdentity = new java.util.LinkedHashMap<String, Object>() {{ put("bind", (java.util.function.Function<Object, Object>) (v_0_i0) -> (java.util.function.Function<Object, Object>) (f_1_i1) -> ((java.util.function.Function<Object, Object>) (f_1_i1)).apply(v_0_i0)); put("Apply0", (java.util.function.Function<Object, Object>) (_dollar___unused_0_i2) -> Data_Identity.applyIdentity); }};
public static final Object applicativeIdentity = new java.util.LinkedHashMap<String, Object>() {{ put("pure", (java.util.function.Function<Object, Object>) (x_0_i0) -> x_0_i0); put("Apply0", (java.util.function.Function<Object, Object>) (_dollar___unused_0_i1) -> Data_Identity.applyIdentity); }};
public static final Object monadIdentity = new java.util.LinkedHashMap<String, Object>() {{ put("Applicative0", (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> Data_Identity.applicativeIdentity); put("Bind1", (java.util.function.Function<Object, Object>) (_dollar___unused_0_i1) -> Data_Identity.bindIdentity); }};
public static final Object altIdentity = new java.util.LinkedHashMap<String, Object>() {{ put("alt", (java.util.function.Function<Object, Object>) (x_0_i0) -> (java.util.function.Function<Object, Object>) (v_1_i1) -> x_0_i0); put("Functor0", (java.util.function.Function<Object, Object>) (_dollar___unused_0_i2) -> Data_Identity.functorIdentity); }};
}
