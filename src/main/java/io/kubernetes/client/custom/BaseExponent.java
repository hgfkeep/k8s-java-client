package io.kubernetes.client.custom;

public class BaseExponent {

    private final int base;
    private final int exponent;
    private final Quantity.Format format;

    public BaseExponent(final int base, final int exponent, final Quantity.Format format) {
        this.base = base;
        this.exponent = exponent;
        this.format = format;
    }

    public int getBase() {
        return base;
    }

    public int getExponent() {
        return exponent;
    }

    public Quantity.Format getFormat() {
        return format;
    }

    @Override
    public String toString() {
        return "BaseExponent{" +
                "base=" + base +
                ", exponent=" + exponent +
                ", format=" + format +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaseExponent that = (BaseExponent) o;

        return base == that.base && exponent == that.exponent && format == that.format;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }
}
