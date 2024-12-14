public class UserEntity {
    private Integer id;
    private String name;
    private String apellido;

    public UserEntity(Integer id, String name, String apellido) {
        this.id = id;
        this.name = name;
        this.apellido = apellido;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
