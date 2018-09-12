package 结构型模式.桥接模式;

class Lady extends Person {

    public Lady(){
        setType("女人");
    }

    public void dress(){
        Clothing clothing = getClothing();
        clothing.personDressCloth(this);
    }

}
