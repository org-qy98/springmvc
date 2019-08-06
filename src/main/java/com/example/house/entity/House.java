package com.example.house.entity;

import java.util.Date;

public class House {
    private Integer id;

    private Integer houseid;

    private Integer landlord;

    private String htitle;

    private String hadr;

    private Integer hrent;

    private Integer state;

    private String himg;

    private Integer hfloor;

    private String hspace;

    private String orientation;

    private Date releasedate;

    private String hdesc;

    private String longitude;

    private String latitude;

    private Integer agentid;

    private Integer tenantid;

    private String cimg;

    private String examine;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHouseid() {
        return houseid;
    }

    public void setHouseid(Integer houseid) {
        this.houseid = houseid;
    }

    public Integer getLandlord() {
        return landlord;
    }

    public void setLandlord(Integer landlord) {
        this.landlord = landlord;
    }

    public String getHtitle() {
        return htitle;
    }

    public void setHtitle(String htitle) {
        this.htitle = htitle == null ? null : htitle.trim();
    }

    public String getHadr() {
        return hadr;
    }

    public void setHadr(String hadr) {
        this.hadr = hadr == null ? null : hadr.trim();
    }

    public Integer getHrent() {
        return hrent;
    }

    public void setHrent(Integer hrent) {
        this.hrent = hrent;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getHimg() {
        return himg;
    }

    public void setHimg(String himg) {
        this.himg = himg == null ? null : himg.trim();
    }

    public Integer getHfloor() {
        return hfloor;
    }

    public void setHfloor(Integer hfloor) {
        this.hfloor = hfloor;
    }

    public String getHspace() {
        return hspace;
    }

    public void setHspace(String hspace) {
        this.hspace = hspace == null ? null : hspace.trim();
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation == null ? null : orientation.trim();
    }

    public Date getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(Date releasedate) {
        this.releasedate = releasedate;
    }

    public String getHdesc() {
        return hdesc;
    }

    public void setHdesc(String hdesc) {
        this.hdesc = hdesc == null ? null : hdesc.trim();
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    public Integer getAgentid() {
        return agentid;
    }

    public void setAgentid(Integer agentid) {
        this.agentid = agentid;
    }

    public Integer getTenantid() {
        return tenantid;
    }

    public void setTenantid(Integer tenantid) {
        this.tenantid = tenantid;
    }

    public String getCimg() {
        return cimg;
    }

    public void setCimg(String cimg) {
        this.cimg = cimg == null ? null : cimg.trim();
    }

    public String getExamine() {
        return examine;
    }

    public void setExamine(String examine) {
        this.examine = examine == null ? null : examine.trim();
    }
}