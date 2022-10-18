package com.example.mars_rover_photos.dto;



public class HomeDto {
    /*@RequestParam(required = false) String marsApiRoverData,
    @RequestParam(required = false) Integer sol)*/
    private String marsApiRoverData;
    private Integer sol;

    private Boolean cameraFhaz;
    private Boolean cameraRhaz;
    private Boolean cameraMast;
    private Boolean cameraChemCam;
    private Boolean cameraMahli;
    private Boolean cameraMardi;
    private Boolean cameraNavcam;
    private Boolean cameraPancam;
    private Boolean cameraMinites;


    //Perseverance has only unique cameras...:
            /*"EDL_DDCAM",
            "FRONT_HAZCAM_LEFT_A",
            "FRONT_HAZCAM_RIGHT_A",
            "REAR_HAZCAM_LEFT",
            "REAR_HAZCAM_RIGHT"*/


    public Boolean getCameraFhaz() {
        return cameraFhaz;
    }

    public void setCameraFhaz(Boolean cameraFhaz) {
        this.cameraFhaz = cameraFhaz;
    }

    public Boolean getCameraRhaz() {
        return cameraRhaz;
    }

    public void setCameraRhaz(Boolean cameraRhaz) {
        this.cameraRhaz = cameraRhaz;
    }

    public Boolean getCameraMast() {
        return cameraMast;
    }

    public void setCameraMast(Boolean cameraMast) {
        this.cameraMast = cameraMast;
    }

    public Boolean getCameraChemCam() {
        return cameraChemCam;
    }

    public void setCameraChemCam(Boolean cameraChemCam) {
        this.cameraChemCam = cameraChemCam;
    }

    public Boolean getCameraMahli() {
        return cameraMahli;
    }

    public void setCameraMahli(Boolean cameraMahli) {
        this.cameraMahli = cameraMahli;
    }

    public Boolean getCameraMardi() {
        return cameraMardi;
    }

    public void setCameraMardi(Boolean cameraMardi) {
        this.cameraMardi = cameraMardi;
    }

    public Boolean getCameraNavcam() {
        return cameraNavcam;
    }

    public void setCameraNavcam(Boolean cameraNavcam) {
        this.cameraNavcam = cameraNavcam;
    }

    public Boolean getCameraPancam() {
        return cameraPancam;
    }

    public void setCameraPancam(Boolean cameraPancam) {
        this.cameraPancam = cameraPancam;
    }

    public Boolean getCameraMinites() {
        return cameraMinites;
    }

    public void setCameraMinites(Boolean cameraMinites) {
        this.cameraMinites = cameraMinites;
    }

    public String getMarsApiRoverData() {
        return marsApiRoverData;
    }
    public void setMarsApiRoverData(String marsApiRoverData) {
        this.marsApiRoverData = marsApiRoverData;
    }
    public Integer getSol() {
        return sol;
    }
    public void setSol(Integer marsSol) {
        this.sol = marsSol;
    }


}
