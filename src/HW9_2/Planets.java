package HW9_2;

import java.util.Objects;

public class Planets {
    private String name;
    private int size;
    private int satellites;

    Planets(String name, int size, int satellites){
        this.name=name;
        this.size=size;
        this.satellites=satellites;
    }

    public int hashCode() {
        int length = name.length();
        int result = 0;
        result = 77 * size + satellites+length;
        return result;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Planets that = (Planets) o;

        if (name != that.name) return false;
        else if (size != that.size) return false;
        else if (satellites != that.satellites) return false;
        else return true;
    }
}
