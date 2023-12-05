package hashset;

class Customer {
    private long id;
    private String name;

    public Customer(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() { return id;}
    public void setId(long id) { this.id = id;}
    public String getName() { return name;}
    public void setName(String name) {  this.name = name;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id;
    }

    @Override
    public int hashCode() {return Long.hashCode(id); }

    @Override
    public String toString() {
        return "\nCustomer{" +"id=" + id +", name='" + name + '\'' + '}';
    }
}

