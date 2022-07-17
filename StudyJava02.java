import java.util.Scanner;

public class StudyJava02 {
    public static void main(String[] args){
        int num=0;
        String []record =new String[10];
        record[0]="收支\t账户金额\t收支金额\t说明\t";
        int balance =10000;
        int money;
        String details;

        boolean charge =true;
        while(charge){
            System.out.println("---家庭收支记账软件---");
            System.out.println("1 收支明细");
            System.out.println("2 登记收入");
            System.out.println("3 登记支出");
            System.out.println("4 退出\n");
            System.out.println("请选择");

            Scanner scanner2 =new Scanner(System.in);
            int choose =scanner2.nextInt();

            switch(choose){
                case 1:
                    for(int i=0;i<num+1;i++){
                        System.out.println(record[i]);
                    }
                    break;
                case 2:
                    System.out.println("请输入收支金额");
                    Scanner scanner0 =new Scanner(System.in);
                    money = scanner0.nextInt();
                    balance=balance+money;
                    System.out.println("请输入说明");
                    Scanner scanner1 =new Scanner(System.in);
                    details =scanner1.next();
                    num+=1;
                    record[num]="收入\t"+balance+"\t"+money+"     "+details;
                    break;
                case 3:
                    System.out.println("请输入收支金额");
                    Scanner scanner3 =new Scanner(System.in);
                    money = scanner3.nextInt();
                    if(money>balance){
                        System.out.println("负债");
                    }
                    balance=balance-money;
                    System.out.println("请输入说明");
                    Scanner scanner4 =new Scanner(System.in);
                    details =scanner4.next();
                    num+=1;
                    record[num]="支出\t"+balance+"\t"+money+"     "+details;
                    break;
                case 4:
                    System.out.println("是否退出 Y/N");
                    Scanner scanner5=new Scanner(System.in);
                    String str0=scanner5.next();
                    //System.out.println(getType(str0));
                    if(str0.equals("Y")||str0.equals("y")){
                        charge=false;
                        break;
                    }else if(str0.equals("N")||str0.equals("n")){
                        break;
                    }else{
                        System.out.println("输入错误");
                        break;
                    }


                default:
                    System.out.println("输入错误，请重新输入");
                    break;
            }
        }
    }
}
