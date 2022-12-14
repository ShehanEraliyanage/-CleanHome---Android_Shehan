package com.example.cleanhome.Model;

public class VolunteerOrganizationCategory {

    String id;
    String organization_id;
    String category_id;
    String category_name;
    String category_image;

    public VolunteerOrganizationCategory() {
    }

    public VolunteerOrganizationCategory(String id, String organization_id, String category_id, String category_name, String category_image) {
        this.id = id;
        this.organization_id = organization_id;
        this.category_id = category_id;
        this.category_name = category_name;
        this.category_image = category_image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrganization_id() {
        return organization_id;
    }

    public void setOrganization_id(String organization_id) {
        this.organization_id = organization_id;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getCategory_image() {
        return category_image;
    }

    public void setCategory_image(String category_image) {
        this.category_image = category_image;
    }
}
