package com.yh.liyang;

public class App {
    public static void main(String[] a) {
        int count = 0;
        App p = new App();
        for (float i=p.t(a[0]); i<=p.t(a[1])&&i<24; i++) {
            if (12 * i / 11 >= 60) continue;
            count++;
        }
        System.out.println(count);
    }
    float t(String a){
        return f(p(a)[0])+(f(p(a)[0])/60)+(f(p(a)[0])/3600);
    }
    String[] p(String s){
        return s.split(":");
    }
    float f(String s){
        return Float.valueOf(s);
    }
}
