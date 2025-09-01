package oops;

public class StockKeeper {

    public String name;

    //Parameterized constructor-->accessmodifier ClassName(){}
    public StockKeeper(String name){
        this.name=name;
    }

    //Instance method
    public void manageAlbum(Album aObj,String name,String artist,double price,int noOfCopies){
        aObj.setName(name);
        aObj.setArtist(artist);
        aObj.setPrice(price);
        aObj.setNoOfCopies(noOfCopies);
        System.out.println("Album is managed by:"+this.name);
        System.out.println("Album details :::::::::::::");
        System.out.println("Album name is :"+aObj.getName());
        System.out.println("Album artist is :"+aObj.getArtist());
        System.out.println("Album price is :"+aObj.getPrice());
        System.out.println("Album copies are :"+aObj.getNoOfCopies());

    }

    public static void main(String[]args){
        StockKeeper sObj=new StockKeeper("Arjun");
        sObj.manageAlbum(new Album(),"Indu","Monalisa",10000.00,50);
    }
}
