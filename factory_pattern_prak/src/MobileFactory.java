// Nama Program: Factory Pattern
// Nama/NRP: 2072025/Sherly Santiadi

public class MobileFactory {
    public static Mobile createMobile(String type){
        if(type.equals(Mobile.SONY)){
            return new Sony(2,"ARM");
        }else if(type.equals(Mobile.SAMSUNG)){
            return new Samsung("Intel");
        }else{
            return null;
        }
    }
}
