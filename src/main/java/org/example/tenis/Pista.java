package org.example.tenis;

public class Pista {

    private int id;
    private String techado;

    public Pista(int id, String techado) {

        this.id=id;
        this.techado=techado;

    }

    public String getTechado() {
        return techado;
    }

    public void setTechado(String techado) {
        this.techado = techado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Pista{" +
                "id=" + id +
                ", techado='" + techado + '\'' +
                '}';
    }


}
