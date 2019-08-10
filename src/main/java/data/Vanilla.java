package data;

/**
 * * @Author: cuixin
 * * @Date: 2019/7/12 16:45
 */

import java.util.Arrays;

public class Vanilla {
    private final String name;
    private int age;
    private double score;
    private String[] tags;

    public Vanilla(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return this.score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String[] getTags() {
        return this.tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Vanilla(" + this.getName() + ", " + this.getAge() + ", " + this.getScore() + ", " + Arrays.deepToString(this.getTags()) + ")";
    }

    protected boolean canEqual(Object other) {
        return other instanceof Vanilla;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Vanilla)) return false;
        Vanilla other = (Vanilla) o;
        if (!other.canEqual(this)) return false;
        if (this.getName() == null ? other.getName() != null : !this.getName().equals(other.getName())) return false;
        if (this.getAge() != other.getAge()) return false;
        if (Double.compare(this.getScore(), other.getScore()) != 0) return false;
        return Arrays.deepEquals(this.getTags(), other.getTags());
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final long temp1 = Double.doubleToLongBits(this.getScore());
        result = (result * PRIME) + (this.getName() == null ? 43 : this.getName().hashCode());
        result = (result * PRIME) + this.getAge();
        result = (result * PRIME) + (int) (temp1 ^ (temp1 >>> 32));
        result = (result * PRIME) + Arrays.deepHashCode(this.getTags());
        return result;
    }

    public static class Exercise<T> {
        private final String name;
        private final T value;

        private Exercise(String name, T value) {
            this.name = name;
            this.value = value;
        }

        public static <T> Exercise<T> of(String name, T value) {
            return new Exercise<T>(name, value);
        }

        public String getName() {
            return this.name;
        }

        public T getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return "Exercise(name=" + this.getName() + ", value=" + this.getValue() + ")";
        }

        protected boolean canEqual(Object other) {
            return other instanceof Exercise;
        }

        @Override
        public boolean equals(Object o) {
            if (o == this) return true;
            if (!(o instanceof Exercise)) return false;
            Exercise<?> other = (Exercise<?>) o;
            if (!other.canEqual(this)) return false;
            if (this.getName() == null ? other.getValue() != null : !this.getName().equals(other.getName())) return false;
            return this.getValue() == null ? other.getValue() == null : this.getValue().equals(other.getValue());
        }

        @Override
        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            result = (result * PRIME) + (this.getName() == null ? 43 : this.getName().hashCode());
            result = (result * PRIME) + (this.getValue() == null ? 43 : this.getValue().hashCode());
            return result;
        }
    }
}

