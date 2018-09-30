package com.adtec.jfBuilder.entity;

public class EstDesignImageWithBLOBs extends EstDesignImage {
    /**
     * 
     */
    private byte[] designImage;

    /**
     * 
     */
    private byte[] designJpgImage;

    /**
     * 
     */
    private byte[] designDiagramImage;

    /**
     * 
     * @return design_image 
     */
    public byte[] getDesignImage() {
        return designImage;
    }

    /**
     * 
     * @param designImage 
     */
    public void setDesignImage(byte[] designImage) {
        this.designImage = designImage;
    }

    /**
     * 
     * @return design_jpg_image 
     */
    public byte[] getDesignJpgImage() {
        return designJpgImage;
    }

    /**
     * 
     * @param designJpgImage 
     */
    public void setDesignJpgImage(byte[] designJpgImage) {
        this.designJpgImage = designJpgImage;
    }

    /**
     * 
     * @return design_diagram_image 
     */
    public byte[] getDesignDiagramImage() {
        return designDiagramImage;
    }

    /**
     * 
     * @param designDiagramImage 
     */
    public void setDesignDiagramImage(byte[] designDiagramImage) {
        this.designDiagramImage = designDiagramImage;
    }
}