package starter.com.exception;

import java.io.Serializable;

public class ElementNotFoundException extends RuntimeException implements Serializable {

    private final String element;
    private final String fieldName;
    private final transient Object fieldValue;

    public ElementNotFoundException(String element, String fieldName, Object fieldValue) {
        super(String.format("%s called '%s' was not found : '%s'", element, fieldName, fieldValue));
        this.element = element;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }

    public String getElement() {
        return element;
    }

    public String getFieldName() {
        return fieldName;
    }

    public Object getFieldValue() {
        return fieldValue;
    }
}
