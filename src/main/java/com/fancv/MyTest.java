package com.fancv;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MyTest {
    public static void main(String[] args) {
        List<mydto> mydtoList= new ArrayList<>(2);
        mydto a = new mydto();
        a.setId(102L);
        a.setName("a");

        mydto b = new mydto();
        b.setId(101L);
        b.setName("a");
        mydtoList.add(a);
        mydtoList.add(b);

        Map<String,Long> d =mydtoList.stream().collect(Collectors.toMap(mydto::getName,mydto::getId));
    }

}

class mydto {

    private String name;

    private Long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}

