package Day5.task3;

import java.util.Objects;

public class Child {

    private String name;
    private String pesel;
    private String id;


    public Child() {
    }

    public Child(String name, String pesel, String id) {
        this.name = name;
        this.pesel = pesel;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", pesel='" + pesel + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Child child = (Child) o;
        return Objects.equals(name, child.name) && Objects.equals(pesel, child.pesel) && Objects.equals(id, child.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pesel, id);
    }

    public static class Builder {

        private String name;
        private String pesel;
        private String id;

        private Builder() {
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder pesel(String pesel) {
            this.pesel = pesel;
            return this;
        }

        public Builder id (String id) {
            this.id = id;
            return this;
        }


        public Child builder() {

            Child child = new Child();

            child.name = this.name;
            child.pesel = this.pesel;
            child.id = this.id;

            return child;
        }
    }

}
