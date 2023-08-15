public class CreateObj {
    String name = "abcd";
    public static void main(String[] args)
        {
            try {
                Class cls = Class.forName("CreateObj");
                CreateObj obj = (CreateObj)cls.newInstance();
                System.out.println(obj.name);
            }
            catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            catch (InstantiationException e) {

                e.printStackTrace();
            }
            catch (IllegalAccessException e) {

                e.printStackTrace();
            }
        }
    }
