package csv_from_input_validator.validators;

public interface Validator<T> {
    boolean isValid(T t);
}
