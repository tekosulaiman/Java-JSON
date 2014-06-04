package co.id.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tombisnis@yahoo.com
 */
public class User {
    private int age = 27;
    private String name = "Tom";
    private List<String> list = new ArrayList<String>(){
        {
            add("Java");
            add("Developer");
        }
    };

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}