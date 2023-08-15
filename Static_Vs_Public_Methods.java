public class Static_Vs_Public_Methods {

    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }


    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }


    public static void main(String[] args) {
        myStaticMethod();
        //myPublicMethod() : will output an error

        Static_Vs_Public_Methods myObj = new Static_Vs_Public_Methods();
        myObj.myPublicMethod();
    }
}
