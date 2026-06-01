package com.example.FirstApi.Service;

import org.springframework.stereotype.Service;

@Service
public class helloService {
    public String greeting(){
        return "hello springboottt";
    }
    public String aboutme(){
        return "about springboot";
    }
    public String lect(){
       return "welcome to lecture" ;
    }
}
