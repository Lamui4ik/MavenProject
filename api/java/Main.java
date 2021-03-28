public class Main {

    public static void main(String[] args) {
        MyServ myService = new MyServ();
        System.out.println(myService.getMyEntity());
        System.out.println(myService.setMyEntity(new MyEntity("second")));
        System.out.println(myService.getMyEntity());
    }
}