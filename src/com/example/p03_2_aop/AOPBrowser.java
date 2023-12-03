package com.example.p03_2_aop;

import com.example.p03_1_proxy.Html;
import com.example.p03_1_proxy.IBrowser;

public class AOPBrowser implements IBrowser {
    private String url;
    private Html html;
    private Runnable before;
    private Runnable after;
    public AOPBrowser(String url, Runnable before, Runnable after) {
        this.url = url;
        this.before = before;
        this.after = after;
    }
    @Override
    public Html show() {
        before.run();

        if(html == null) {
            this.html = new Html(url);
            System.out.println("AOPBrowser html loading from "+url);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        after.run();

        System.out.println("AOPBrowser html using cache "+url);
        return html;
    }
}
