package Cat2;

import java.util.Objects;

public class Cat2 {
    private String name;
    private int age;
    private String color;

    public Cat2(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getColor(){
        return color;
    }

    public void setName(String name){
        this.name =  name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setColor(String color){
        this.color = color;
    }

/*3. Создайте метод public boolean equals(Object o)
Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод
должен возвращать true, только если значения во всех полях сравниваемых объектов равны. */

    @Override
    public boolean equals(Object obj) {
        if (this == obj) 
        return true;
        if (obj == null || getClass() != obj.getClass())
        return false;
        
        Cat2 cat = (Cat2) obj; //преобразовали obj в Cat2
        return name.equals(cat.name) &&
                age == cat.age &&
                color.equals(cat.color);
    }

/*4. Создайте метод public int hashCode()
который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать
Objects.hash(...)). Убедитесь что в основном классе при запуске программы дубликаты удалились*/

    @Override
    public int hashCode() {
        return Objects.hash(name, age, color);
    }

    //*********************/
    @Override
    public String toString() {
        return 
                "Кличка: " + name + ", " +
                "Возраст: " + age + ", " +
                "Окрас: " + color;
    }
    
}
