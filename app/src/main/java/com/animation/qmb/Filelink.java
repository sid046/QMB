package com.animation.qmb;

public class Filelink {

    String downloadurl,name;

    public Filelink(String downloadurl,String name) {
        this.downloadurl = downloadurl;
        this.name = name;
    }

    public Filelink() {
    }

    public String getDownloadurl() {
        return downloadurl;
    }

    public void setDownloadurl(String downloadurl) {
        this.downloadurl = downloadurl;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

