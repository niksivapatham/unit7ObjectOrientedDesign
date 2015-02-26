public class Coin implements Comparable/*hi*/{private double value;private String name;public Coin( double value, String name ){this.value = value;this.name = name;}public int compareTo( Object otherObject){Coin other = (Coin) otherObject;if( this.value < other.value ){return -1;} else if (this.value > other.value){return 1;} else {return 0;}}
    public static void main( String[] args){
        Coin quarter = new Coin( .25, "quarter");
        Coin dime = new Coin(.10, "dime");        
        Comparable quarterObj = quarter;
        Comparable dimeObj = dime;
        
        if( dimeObj.compareTo( quarterObj
    }
}
