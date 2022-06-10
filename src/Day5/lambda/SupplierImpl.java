package Day5.lambda;

import java.util.function.Supplier;

public class SupplierImpl implements Supplier<String> {

    @Override
    public String get() {
        return "pozdrowienia z implementacji klasy Supplier :)";
    }
}
