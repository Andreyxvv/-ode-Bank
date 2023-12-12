package Map.EqualsHashcode;

import java.util.Objects;

public class HashClassTest
{
    int num;
    String name;
    double avg;

    public HashClassTest (int num, String name, double avg) {
        this.num = num;
        this.name = name;
        this.avg = avg;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (! (o instanceof HashClassTest)) return false;
        HashClassTest that = (HashClassTest) o;
        return num == that.num && Double.compare (that.avg, avg) == 0 && name.equals (that.name);
    }

    @Override
    public int hashCode () {
        return Objects.hash (num, name, avg);
    }
}
