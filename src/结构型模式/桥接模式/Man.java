package 结构型模式.桥接模式;

class Man extends Person {

    public Man(){
        setType("男人");
    }

    public void dress(){
        Clothing clothing = getClothing();
        clothing.personDressCloth(this);
    }
}
