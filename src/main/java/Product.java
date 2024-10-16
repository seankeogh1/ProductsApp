public class Product {
    private String name;
    private String email;
    private String course;

    public Product() {
        this.name = null;
        this.email = null;
        this.course = null;
    }

    public Product(String name) {
        this.name = name;
        this.email = null;
        this.course = null;
    }
    public Product(String name,String email,String course)
    {
        this.name = name;
        this.email = email;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
