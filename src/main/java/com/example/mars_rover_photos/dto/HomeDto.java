package com.example.mars_rover_photos.dto;


import javax.persistence.*;

@Entity
@Table(name = "marsApiPreferences")
public class HomeDto {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)

    private Long userId;
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

    private Boolean cameraEDL_DDCAM;
    private Boolean cameraFRONT_HAZCAM_LEFT_A;
    private Boolean cameraFRONT_HAZCAM_RIGHT_A;
    private Boolean cameraREAR_HAZCAM_LEFT;
    private Boolean cameraREAR_HAZCAM_RIGHT;

    private Boolean rememberPreferences;

@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Boolean getRememberPreferences() {
        return rememberPreferences;
    }

    public void setRememberPreferences(Boolean rememberPreferences) {
        this.rememberPreferences = rememberPreferences;
    }

    public Boolean getCameraEDL_DDCAM() {
        return cameraEDL_DDCAM;
    }

    public void setCameraEDL_DDCAM(Boolean cameraEDL_DDCAM) {
        this.cameraEDL_DDCAM = cameraEDL_DDCAM;
    }

    public Boolean getCameraFRONT_HAZCAM_LEFT_A() {
        return cameraFRONT_HAZCAM_LEFT_A;
    }

    public void setCameraFRONT_HAZCAM_LEFT_A(Boolean cameraFRONT_HAZCAM_LEFT_A) {
        this.cameraFRONT_HAZCAM_LEFT_A = cameraFRONT_HAZCAM_LEFT_A;
    }

    public Boolean getCameraFRONT_HAZCAM_RIGHT_A() {
        return cameraFRONT_HAZCAM_RIGHT_A;
    }

    public void setCameraFRONT_HAZCAM_RIGHT_A(Boolean cameraFRONT_HAZCAM_RIGHT_A) {
        this.cameraFRONT_HAZCAM_RIGHT_A = cameraFRONT_HAZCAM_RIGHT_A;
    }

    public Boolean getCameraREAR_HAZCAM_LEFT() {
        return cameraREAR_HAZCAM_LEFT;
    }

    public void setCameraREAR_HAZCAM_LEFT(Boolean cameraREAR_HAZCAM_LEFT) {
        this.cameraREAR_HAZCAM_LEFT = cameraREAR_HAZCAM_LEFT;
    }

    public Boolean getCameraREAR_HAZCAM_RIGHT() {
        return cameraREAR_HAZCAM_RIGHT;
    }

    public void setCameraREAR_HAZCAM_RIGHT(Boolean cameraREAR_HAZCAM_RIGHT) {
        this.cameraREAR_HAZCAM_RIGHT = cameraREAR_HAZCAM_RIGHT;
    }

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
@Column(length = 20 )
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

    @Override
    public String toString() {
        return "HomeDto{" +
                "userId=" + userId +
                ", marsApiRoverData='" + marsApiRoverData + '\'' +
                ", sol=" + sol +
                ", cameraFhaz=" + cameraFhaz +
                ", cameraRhaz=" + cameraRhaz +
                ", cameraMast=" + cameraMast +
                ", cameraChemCam=" + cameraChemCam +
                ", cameraMahli=" + cameraMahli +
                ", cameraMardi=" + cameraMardi +
                ", cameraNavcam=" + cameraNavcam +
                ", cameraPancam=" + cameraPancam +
                ", cameraMinites=" + cameraMinites +
                ", cameraEDL_DDCAM=" + cameraEDL_DDCAM +
                ", cameraFRONT_HAZCAM_LEFT_A=" + cameraFRONT_HAZCAM_LEFT_A +
                ", cameraFRONT_HAZCAM_RIGHT_A=" + cameraFRONT_HAZCAM_RIGHT_A +
                ", cameraREAR_HAZCAM_LEFT=" + cameraREAR_HAZCAM_LEFT +
                ", cameraREAR_HAZCAM_RIGHT=" + cameraREAR_HAZCAM_RIGHT +
                ", rememberPreferences=" + rememberPreferences +
                '}';
    }
}
