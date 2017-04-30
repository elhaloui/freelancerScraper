/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EL HALOUI
 */
public class JobCategory {
    private String name;
    private int openProjectsCount;

    public JobCategory(String name, int openProjectsCount) {
        this.name = name;
        this.openProjectsCount = openProjectsCount;
    }

    public JobCategory() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOpenProjectsCount() {
        return openProjectsCount;
    }

    public void setOpenProjectsCount(int openProjectsCount) {
        this.openProjectsCount = openProjectsCount;
    }

    @Override
    public String toString() {
        return this.name+" : "+this.openProjectsCount;
    }
    
    
}
