package com.maxlab.recipeshub.model;

public class ViewpageModel {
    private String pageId, recipeImage, recipeName, catName;

    public ViewpageModel(String pageId, String recipeImage, String recipeName, String catName) {
        this.pageId = pageId;
        this.recipeImage = recipeImage;
        this.recipeName = recipeName;
        this.catName = catName;
    }

    public ViewpageModel() {
    }

    public String getRecipeImage() {
        return recipeImage;
    }

    public void setRecipeImage(String recipeImage) {
        this.recipeImage = recipeImage;
    }

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }
}
