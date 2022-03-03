package app.model;

import org.springframework.stereotype.Component;

/**
 * @author Vadim Ilin
 */

@Component
public class Dog extends Animal {
    @Override
    public String toString() {
        return "Im a Dog";
    }
}
