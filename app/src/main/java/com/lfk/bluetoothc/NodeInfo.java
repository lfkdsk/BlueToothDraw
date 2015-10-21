package com.lfk.bluetoothc;

/**
 * Created by liufengkai on 15/10/6.
 */
public class NodeInfo {
    private int img;
    private String Text;
    private String  CODE;

    public NodeInfo(int img, String text, String  CODE) {
        this.img = img;
        this.Text = text;
        this.CODE = CODE;
    }

    public int getImg() {
        return img;
    }

    public String getText() {
        return Text;
    }

    public String getCODE() {
        return CODE;
    }
}
