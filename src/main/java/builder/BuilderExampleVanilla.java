package builder;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class BuilderExampleVanilla {
    private long created;
    private String name;
    private int age;
    private Set<String> occupations;

    BuilderExampleVanilla(long created, String name, int age, Set<String> occupations) {
        this.created = created;
        this.name = name;
        this.age = age;
        this.occupations = occupations;
    }

    private static long $default$created() {
        return System.currentTimeMillis();
    }

    public static BuilderExampleVanillaBuilder builder() {
        return new BuilderExampleVanillaBuilder();
    }

    public static class BuilderExampleVanillaBuilder {
        private long created;
        private boolean created$set;
        private String name;
        private int age;
        private java.util.ArrayList<String> occupations;

        BuilderExampleVanillaBuilder() {
        }

        public BuilderExampleVanillaBuilder created(long created) {
            this.created = created;
            this.created$set = true;
            return this;
        }

        public BuilderExampleVanillaBuilder name(String name) {
            this.name = name;
            return this;
        }

        public BuilderExampleVanillaBuilder age(int age) {
            this.age = age;
            return this;
        }

        public BuilderExampleVanillaBuilder occupation(String occupation) {
            if (this.occupations == null) {
                this.occupations = new java.util.ArrayList<String>();
            }

            this.occupations.add(occupation);
            return this;
        }

        public BuilderExampleVanillaBuilder occupations(Collection<? extends String> occupations) {
            if (this.occupations == null) {
                this.occupations = new java.util.ArrayList<String>();
            }

            this.occupations.addAll(occupations);
            return this;
        }

        public BuilderExampleVanillaBuilder clearOccupations() {
            if (this.occupations != null) {
                this.occupations.clear();
            }

            return this;
        }

        public BuilderExampleVanilla build() {
            // complicated switch statement to produce a compact properly sized immutable set omitted.
            Set<String> occupations = new HashSet<String>(Arrays.asList("document"));
            return new BuilderExampleVanilla(created$set ? created : BuilderExampleVanilla.$default$created(), name, age, occupations);
        }

        @java.lang.Override
        public String toString() {
            return "BuilderExampleVanilla.BuilderExampleVanillaBuilder(created = " + this.created + ", name = " + this.name + ", age = " + this.age + ", occupations = " + this.occupations + ")";
        }
    }
}