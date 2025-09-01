package oops;

public class Album {
    //Instance variabels
    //accessmodifier datatype variablename=value;

    private String name;
    private String artist;
    private double price;
    private int noOfCopies;

    //Setter & getter methods
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if(price>0) {
            this.price = price;
        }else{
            this.price=0.0;
        }
    }

    public int getNoOfCopies() {
        return noOfCopies;
    }
    public void setNoOfCopies(int noOfCopies) {
        if(noOfCopies>0) {
            this.noOfCopies = noOfCopies;
        }else{
            this.noOfCopies =0;
        }
    }




}
