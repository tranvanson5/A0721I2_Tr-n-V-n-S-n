package CaseStudy.Controllers;

import CaseStudy.Models.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class MainController {
    static ArrayList <Services> servicesList = new ArrayList<>();
    private static Services services;

    public static void displayMainMenu(){
        int chose;
        Scanner scanner=new Scanner(System.in);
        while (true) {
            System.out.println("1.\tAdd New Services\n" +
                    "2.\tShow Services\n" +
                    "3.\tAdd New Customer\n" +
                    "4.\tShow Information of Customer\n" +
                    "5.\tAdd New Booking\n" +
                    "6.\tShow Information of Employee\n" +
                    "7.\tExit\n");
            System.out.println("Nhập lựa chọn dịch vụ: ");
            chose = scanner.nextInt();
            switch (chose) {
                case 1:
                    AddNewServices();
                    break;
                case 2:
                    ShowServices();
                    break;
                case 3:
                    AddNewCustomer();
                    break;
                case 4:
                    ShowInformationofCustomer();
                    break;
                case 5:
                    AddNewBooking();
                    break;
                case 6:
                    ShowInformationofEmployee();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhấn enter để tiếp tục");
                    scanner.nextLine();
                    displayMainMenu();
            }
        }
    }
    static void AddNewServices(){
        Scanner scanner=new Scanner(System.in);
        int chose;
        while (true){
            System.out.println("1.\tVilla\n" +
                    "2.\tHouse\n" +
                    "3.\tRoom\n" +
                    "4.\tBack\n" +
                    "5.\tExit");
            System.out.println("Nhập lựa chọn: ");
            chose = scanner.nextInt();
            switch (chose) {
                case 1:
                    Villa();
                    break;
                case 2:
                    House();
                    break;
                case 3:
                    Room();
                    break;
                case 4:
                    displayMainMenu();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Nhấn enter để tiếp tục");
                    scanner.nextLine();
                    AddNewServices();
            }
        }
    }
    static void Villa(){
        Scanner scanner=new Scanner(System.in);
        int id; String tenDichVu; double dienTich; double chiPhi; int soLuongToiDa; String kieuthue;
        String tieuChuan; String moTaTienNghi; double dienTichHoBoi ; int soTang; DichVuDiKem dichVuDiKem;
        System.out.println("Nhập id:");
        id= parseInt(scanner.nextLine());
        System.out.println("Nhập tên dịch vụ:");
        tenDichVu=scanner.nextLine();
        System.out.println("Nhập diện tích:");
        dienTich=parseDouble(scanner.nextLine());
        System.out.println("Nhập chi phí:");
        chiPhi=parseDouble(scanner.nextLine());
        System.out.println("Nhập số lượng người tối đa:");
        soLuongToiDa= parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu thuê");
        kieuthue=scanner.nextLine();
        System.out.println("Nhập tiêu chuẩn");
        tieuChuan=scanner.nextLine();
        System.out.println("Nhập mô tả tiện nghi");
        moTaTienNghi=scanner.nextLine();
        System.out.println("Nhập diện tích hồ bơi:");
        dienTichHoBoi=parseDouble(scanner.nextLine());
        System.out.println("Nhập số tầng: ");
        soTang= parseInt(scanner.nextLine());
        System.out.println("Nhập dịch vụ đi kèm: ");
        dichVuDiKem= dichvudikem();
        Services villa= new Villa(id,tenDichVu,dienTich,chiPhi,soLuongToiDa,kieuthue,tieuChuan,moTaTienNghi,dienTichHoBoi,soTang,dichVuDiKem);
        servicesList.add(villa);
        try {
            writeFile("java/src/CaseStudy/Data/Villa.csv",villa);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    static void House(){
        Scanner scanner=new Scanner(System.in);
        int id; String tenDichVu; double dienTich; double chiPhi; int soLuongToiDa; String kieuthue;
        String tieuChuan; String moTaTienNghi; int soTang; DichVuDiKem dichVuDiKem;
        System.out.println("Nhập id:");
        id= parseInt(scanner.nextLine());
        System.out.println("Nhập tên dịch vụ:");
        tenDichVu=scanner.nextLine();
        System.out.println("Nhập diện tích:");
        dienTich=parseDouble(scanner.nextLine());
        System.out.println("Nhập chi phí:");
        chiPhi=parseDouble(scanner.nextLine());
        System.out.println("Nhập số lượng người tối đa:");
        soLuongToiDa= parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu thuê");
        kieuthue=scanner.nextLine();
        System.out.println("Nhập tiêu chuẩn");
        tieuChuan=scanner.nextLine();
        System.out.println("Nhập mô tả tiện nghi");
        moTaTienNghi=scanner.nextLine();
        System.out.println("Nhập số tầng: ");
        soTang= parseInt(scanner.nextLine());
        System.out.println("Nhập dịch vụ đi kèm: ");
        dichVuDiKem= dichvudikem();
        Services house= new House(id,tenDichVu,dienTich,chiPhi,soLuongToiDa,kieuthue,tieuChuan,moTaTienNghi,soTang,dichVuDiKem);
        servicesList.add(house);
        writeFile("java/src/CaseStudy/Data/House.csv",house);
    }
    static void Room(){
        Scanner scanner=new Scanner(System.in);
        int id; String tenDichVu; double dienTich; double chiPhi; int soLuongToiDa; String kieuthue;
        String tieuChuan; String moTaTienNghi; double dienTichHoBoi ; int soTang; DichVuDiKem dichVuDiKem;
        System.out.println("Nhập id:");
        id= parseInt(scanner.nextLine());
        System.out.println("Nhập tên dịch vụ:");
        tenDichVu=scanner.nextLine();
        System.out.println("Nhập diện tích:");
        dienTich=parseDouble(scanner.nextLine());
        System.out.println("Nhập chi phí:");
        chiPhi=parseDouble(scanner.nextLine());
        System.out.println("Nhập số lượng người tối đa:");
        soLuongToiDa= parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu thuê");
        kieuthue=scanner.nextLine();
        System.out.println("Nhập dịch vụ đi kèm: ");
        dichVuDiKem= dichvudikem();
        dichVuDiKem.setChiPhi(0);
        Services room= new Room(id,tenDichVu,dienTich,chiPhi,soLuongToiDa,kieuthue,dichVuDiKem);
        servicesList.add(room);
        writeFile("java/src/CaseStudy/Data/Room.csv",room);
    }
    public static void writeFile(String filePath, Services sv) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath,true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(sv);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    static DichVuDiKem dichvudikem(){
        Scanner scanner=new Scanner(System.in);
        String tendichVuDiKem; String donVi; double chiPhidv;
        System.out.println("\t Nhập tên dịch vụ đi kèm");
        tendichVuDiKem= scanner.nextLine();
        System.out.println("\t Nhập đơn vị: ");
        donVi=scanner.nextLine();
        System.out.println("\t Nhập chi phí dịch vụ: ");
        chiPhidv=parseDouble(scanner.nextLine());
        DichVuDiKem dichVuDiKem=new DichVuDiKem(tendichVuDiKem,donVi,chiPhidv);
        return dichVuDiKem;
    }
    public static List<Services> readDataFromFile(String filePath) {
        List<Services> services1= new ArrayList<>();
        try {
            FileInputStream inputStream=new FileInputStream(filePath);
            ObjectInputStream ois= new ObjectInputStream(inputStream);
            services1 = (List<Services>) ois.readObject();
            inputStream.close();
            ois.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return services1;
    }
    static void ShowServices(){
        Scanner scanner=new Scanner(System.in);
        int chose;
        while (true){
            System.out.println("1.\tShow Villa\n" +
                    "2.\tShow House\n" +
                    "3.\tShow Room\n" +
                    "4.\tBack\n" +
                    "5.\tExit");
            System.out.println("Nhập lựa chọn: ");
            chose = scanner.nextInt();
            switch (chose) {
                case 1:
                    ShowVilla();
                    break;
                case 2:
                    ShowHome();
                    break;
                case 3:
                    ShowRoom();
                    break;
                case 4:
                    displayMainMenu();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Nhấn enter để tiếp tục");
                    scanner.nextLine();
                    AddNewServices();
            }
        }
    }
    static void ShowVilla(){
        List<Services> servicesDataOfVilla =readDataFromFile("java/src/CaseStudy/Data/Villa.csv");
        for (Services s: servicesDataOfVilla) {
            System.out.println(s);
        }
    }
    static void ShowHome(){
        List<Services> servicesDataOfHome = readDataFromFile("java/src/CaseStudy/Data/House.csv");
        for (Services s: servicesDataOfHome) {
            System.out.println(s);
        }
    }
    static void ShowRoom(){
        List<Services> servicesDataOfRoom =readDataFromFile("java/src/CaseStudy/Data/Room.csv");
        for (Services s: servicesDataOfRoom) {
            System.out.println(s);
        }
    }
    static void AddNewCustomer(){

    }
    static void ShowInformationofCustomer(){

    }
    static void AddNewBooking(){

    }
    static void ShowInformationofEmployee(){

    }
    public static void main(String[] args) {
        displayMainMenu();
        ShowServices();

    }
}
