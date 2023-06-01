package com.example.prog4td1p1;

import lombok.Getter;

@Getter
public enum EnumSingleton {
    INSTANCE(1);

    private int click;

    private EnumSingleton(int click) {
        this.click = click;
    }

    public EnumSingleton getInstance() {
        return INSTANCE;
    }
    public void setClick(int click){
        this.click = click;
    }
}
