package model;

import java.util.Date;

public class Project {

    private int id;
    private String name;
    private String description;
    private Date createDat;
    private Date createUpdate;

    public Project(int id, String name, String description, Date createDat, Date createUpdate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createDat = createDat;
        this.createUpdate = createUpdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateDat() {
        return createDat;
    }

    public void setCreateDat(Date createDat) {
        this.createDat = createDat;
    }

    public Date getCreateUpdate() {
        return createUpdate;
    }

    public void setCreateUpdate(Date createUpdate) {
        this.createUpdate = createUpdate;
    }
//===========

    @Override
    public String toString() {
        return "Projetct(" + "   id=" + id + ", name=" + name + ", description=" + description + " createDat=" + createDat + ", createUpdate=" + createUpdate + ')';
}


}
