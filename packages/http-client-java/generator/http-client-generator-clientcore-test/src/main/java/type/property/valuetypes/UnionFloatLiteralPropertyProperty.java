package type.property.valuetypes;

/**
 * Defines values for UnionFloatLiteralPropertyProperty.
 */
public enum UnionFloatLiteralPropertyProperty {
    /**
     * Enum value 43.125.
     */
    FOUR_THREE_ONE_TWO_FIVE(43.125),

    /**
     * Enum value 46.875.
     */
    FOUR_SIX_EIGHT_SEVEN_FIVE(46.875);

    /**
     * The actual serialized value for a UnionFloatLiteralPropertyProperty instance.
     */
    private final double value;

    UnionFloatLiteralPropertyProperty(double value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a UnionFloatLiteralPropertyProperty instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed UnionFloatLiteralPropertyProperty object, or null if unable to parse.
     */
    public static UnionFloatLiteralPropertyProperty fromDouble(double value) {
        UnionFloatLiteralPropertyProperty[] items = UnionFloatLiteralPropertyProperty.values();
        for (UnionFloatLiteralPropertyProperty item : items) {
            if (Double.doubleToLongBits(item.toDouble()) == Double.doubleToLongBits(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * De-serializes the instance to double value.
     * 
     * @return the double value.
     */
    public double toDouble() {
        return this.value;
    }
}
