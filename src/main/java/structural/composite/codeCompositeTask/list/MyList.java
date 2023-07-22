package structural.composite.codeCompositeTask.list;

import structural.composite.codeCompositeTask.value.ValueContainer;

import java.util.ArrayList;
import java.util.Collection;

public class MyList extends ArrayList<ValueContainer>
{
    // please leave this constructor as-is
    public MyList(Collection<? extends ValueContainer> c) {
        super(c);
    }

    public int sum() {
        Integer sum = 0;
        for (Iterable<Integer> i : this) {
            for (Integer value : i) {
                sum += value;
            }
        }
        return sum;
    }
}
