package Main;
import java.util.ArrayList;
import java.util.Scanner;

public class Hw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Store> arrStore = new ArrayList<>();

        Store product1 = new Store("a1", "b1", "c1", 10, 10000);
        Store product2 = new Store("a2", "b2", "c2", 8, 109000);
        Store product3 = new Store("a3", "b3", "c3", 5, 65000);
        Store product4 = new Store("a4", "b4", "c4", 2, 1002340);

        arrStore.add(product1);
        arrStore.add(product2);
        arrStore.add(product3);
        arrStore.add(product4);

        for (int i = 0; i < arrStore.size(); i++) {
            System.out.println(arrStore.get(i));
        }

        System.out.println("Nhập tên sản phẩm muốn tìm");
        String findName = sc.nextLine();
        for (int i = 0; i < arrStore.size(); i++) {
            if (arrStore.get(i).getName().equalsIgnoreCase(findName)) {
                System.out.println(arrStore.get(i));
            }
        }
        System.out.println("Nhập id sản phẩm muốn tìm");
        String findId = sc.nextLine();
        for (int i = 0; i < arrStore.size(); i++) {
            if (arrStore.get(i).getId().equalsIgnoreCase(findId)) {
                System.out.println(arrStore.get(i));
            }
        }
        System.out.println("Nhập id sản phẩm muốn xóa");
        String removeId = sc.nextLine();
        System.out.println("Nhập số lượng sản phẩm muốn xóa");
        int removeQuantity=sc.nextInt();
        for (int i = 0; i < arrStore.size(); i++) {
            if (arrStore.get(i).getId().equalsIgnoreCase(removeId)) {
                while (true) {
                    if (removeQuantity>0&&removeQuantity<=arrStore.get(i).getQuantity()) {
                        System.out.println("Số lượng sản phẩm còn lại là: "+(arrStore.get(i).getQuantity()-removeQuantity));
                        break;
                    }else {
                        System.out.println("Lỗi! Mời nhập lại");
                        int removeQuantity1= sc.nextInt();
                        if (removeQuantity1>0&&removeQuantity1<=arrStore.get(i).getQuantity()) {
                            System.out.println("Số lượng sản phẩm còn lại là: "+(arrStore.get(i).getQuantity()-removeQuantity1));
                            break;
                        }
                    }
                }
            }
        }
        System.out.println("Các sản phẩm có số lượng dưới 5 là:");
        for (int i=0;i<arrStore.size();i++){
            if (arrStore.get(i).getQuantity()<5){
                System.out.println(arrStore.get(i));
            }
        }

        System.out.println("Nhập mức giá mà bạn muốn tìm");
        int findPrice=sc.nextInt();
        for(int i=0;i<arrStore.size();i++){
            if (findPrice<50000){
                if (arrStore.get(i).getPrice()<50000){
                    System.out.println("Sản phẩm có giá dưới 50000 là:");
                    System.out.println(arrStore.get(i));
                }
            }else if (findPrice>=100000){
                if (arrStore.get(i).getPrice()>=100000){
                    System.out.println("Sản phẩm có giá từ 100000 trở lên là:");
                    System.out.println(arrStore.get(i));
                }
            }else{
                System.out.println("Sản phẩm có giá từ 50000 đến 100000 là:");
                System.out.println(arrStore.get(i));
            }
        }
    }
}
