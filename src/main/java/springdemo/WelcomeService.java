package springdemo;

import org.springframework.stereotype.Service;

//@Service("ws")
public class WelcomeService {

    private String mes="hello!!!";

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getMes() {
        return mes;
    }

}
