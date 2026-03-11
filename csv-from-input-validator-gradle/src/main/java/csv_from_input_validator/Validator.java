package csv_from_input_validator;

public interface Validator<T> {
    boolean isValid(T t);
}
