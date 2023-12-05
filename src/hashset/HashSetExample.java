package hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
Set<Customer> customers;

    public HashSetExample() {
        this.customers = new HashSet<>();
    }

    public void addCustomer(String name) {
        long nextId = getNextId();
        customers.add(new Customer(nextId, name));
    }

    private long getNextId() {
        long maxId = 0;
        for (Customer customer : customers) {
            maxId = Math.max(maxId, customer.getId());
        }
        return maxId + 1;
    }

    public void removeCustomer(long id) {
        customers.remove(new Customer(id, ""));
    }

    public boolean containsCustomer(long id) {
        return customers.contains(new Customer(id, ""));
    }

    public int getSize() {
        return customers.size();
    }

    public void clearSet() {
        customers.clear();
    }
}
