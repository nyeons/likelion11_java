import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList accounts = new ArrayList();
        HashMap account = new HashMap();

        while(true){
            System.out.println("=======Bank Menu=======");
            System.out.println("1. 계좌 개설");
            System.out.println("2. 입금하기");
            System.out.println("3. 출금하기");
            System.out.println("4. 전체 조회");
            System.out.println("5. 프로그램 종료");
            System.out.println("=======================");
            System.out.print("입력 : ");
            String choose_input = sc.nextLine();

            int deposit = 0;
            int withdraw;

            if(choose_input.equalsIgnoreCase("1")){
                System.out.println("========계좌 개설========");
                System.out.print("계좌 번호 : ");
                System.out.print("이름 : ");
                do{
                    System.out.print("예금 : ");
                    while(!sc.hasNextInt()){
                        sc.next();
                        System.out.println("입력값을 확인해주세요.");
                        System.out.print("예금 : ");
                    }
                    deposit = sc.nextInt();
                }while(deposit<=0);
                System.out.println("#계좌 개설을 완료하였습니다#");

            } else if(choose_input.equalsIgnoreCase("2")){
                System.out.println("========입금하기========");
                System.out.print("입금하실 계좌 번호를 입력해주세요 : ");
                String send_number = sc.nextLine();
                if(send_number.equalsIgnoreCase("3333217911991")){
                    System.out.println("계좌 이름 : 노연수");
                    System.out.println("계좌 잔고 : 100000원");
                    do{
                        System.out.print("입금하실 금액을 입력해주세요 : ");
                        while(!sc.hasNextInt()){
                            sc.next();
                            System.out.println("입력값을 확인해주세요.");
                            System.out.print("입금하실 금액을 입력해주세요 : ");
                        }
                        deposit = sc.nextInt();
                    }while(deposit<=0);
                    int result = 1000000+deposit;
                    System.out.println("##계좌 잔고 : " + result + " 원##");
                    System.out.println("##입금이 완료되었습니다##");
                    account.put("3333217911991", result);

                }else if(send_number.equalsIgnoreCase("1234567890111")){
                    System.out.println("계좌 이름 : B");
                    System.out.println("계좌 잔고 : 10원");
                    do{
                        System.out.print("입금하실 금액을 입력해주세요 : ");
                        while(!sc.hasNextInt()){
                            sc.next();
                            System.out.println("입력값을 확인해주세요.");
                            System.out.print("입금하실 금액을 입력해주세요 : ");
                        }
                        deposit = sc.nextInt();
                    }while(deposit<=0);
                    int result = 10+deposit;
                    System.out.println("##계좌 잔고 : " + result + " 원##");
                    System.out.println("##입금이 완료되었습니다##");
                    account.put("1234567890111", result);
                }

            } else if(choose_input.equalsIgnoreCase("3")){
                System.out.println("========출금하기========");
                System.out.print("출금하실 계좌 번호를 입력해주세요 : ");
                String get_number = sc.nextLine();
                if(get_number.equalsIgnoreCase("3333217911991")){
                    System.out.println("계좌 이름 : 노연수");
                    System.out.println("계좌 잔고 : 100000 원");
                    do{
                        System.out.print("출금하실 금액을 입력해주세요 : ");
                        while(!sc.hasNextInt()){
                            sc.next();
                            System.out.println("입력값을 확인해주세요.");
                            System.out.print("출금하실 금액을 입력해주세요 : ");
                        }
                        withdraw = sc.nextInt();

                        if(withdraw>100000){
                            System.out.println("잔액이 부족합니다.");
                        }
                    } while(withdraw<=0 || withdraw>100000);
                    int result=100000-withdraw;
                    System.out.println("##계좌 잔고 : " + result + " 원##");
                    System.out.println("##출금이 완료되었습니다##");
                    account.put("3333217911991", result);
                }else if(get_number.equalsIgnoreCase("1234567890111")){
                    System.out.println("계좌 이름 : B");
                    System.out.println("계좌 잔고 : 10 원");
                    do{
                        System.out.print("출금하실 금액을 입력해주세요 : ");
                        while(!sc.hasNextInt()){
                            sc.next();
                            System.out.println("입력값을 확인해주세요.");
                            System.out.print("출금하실 금액을 입력해주세요 : ");
                        }
                        withdraw = sc.nextInt();
                        if(withdraw>10){
                            System.out.println("잔액이 부족합니다.");
                        }
                    } while(withdraw<=0 || withdraw>10);
                    int result=10-withdraw;
                    System.out.println("##계좌 잔고 : " + result + " 원##");
                    System.out.println("##출금이 완료되었습니다##");
                    account.put("1234567890111", result);
                }

            } else if(choose_input.equalsIgnoreCase("4")){
                System.out.println("========전체 조회========");
                System.out.println("계좌 번호 : 3333217911991 / 이름 : 노연수 / 잔액 : "+account.get("3333217911991")+" 원");
                System.out.println("계좌 번호 : 1234567890111 / 이름 : B / 잔액 : "+account.get("1234567890111")+" 원");


            } else if(choose_input.equalsIgnoreCase("5")){
                System.out.println("##프로그램을 종료합니다##");
                System.exit(0);
            } else{
                System.out.println("입력값을 확인해주세요.");
            }
        }

    }
}