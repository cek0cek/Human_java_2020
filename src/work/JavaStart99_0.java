package work;

import java.text.DecimalFormat;

//import src.orgjava_tutorials.java;

public class JavaStart99_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//가위 바위 보 게임을만들어서 이겼는지 졌는지출력하는 프로그램을
		//만들어보자
/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("");
		
		int abc=(int)(Math.random()*3+1);
		int a5=0;
		System.out.println("1:주먹 2:가위 3: 보 4:종료");
		System.out.println("1~4? 선택>>");
		a5=Integer.parseInt(scanner.nextLine());
		
		switch(a5) {
		case 1:
			if(abc==1) {
			System.out.printf(" 주먹 비겼습니다 \n");
			} else if(abc==2) {
				System.out.printf("가위 이겼습니다.\n");
			} else {
				System.out.printf("보 졌습니다.\n");
			}
			break;
		case 2:
			if(abc==1) {
			System.out.printf("주먹 졌습니다.\n");
			} else if(abc==2) {
				System.out.printf("가위 비겼습니다.\n");
			} else {
				System.out.printf("보 이겼습니다.\n");
			}
			break;
		case 3:
			if(abc==1) {
			System.out.printf("주먹 이겼습니다.\n");
			} else if(abc==2) {
				System.out.printf("가위 졌습니다.\n");
			} else {
				System.out.printf("보 비겼습니다.\n");
			}
			break;
		case 4:
			System.out.printf("종료.\n");
			break;
		default: 
			System.out.printf("잘못된 입력.\n");
			break;
			
		}
*/
		//왼쪽표를기본으로 보인이 낼 세금이 얼마인지 출력하는 프로그램을 
		//구현해보자 만약에 본인이 번돈이 1600만원 이라면 1200만원은 세율이6%이고
		//나머지 400만원은 세율이 15%이다.
/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("");
		DecimalFormat kkk = new DecimalFormat("###,###");
		System.out.print("본인이 본돈>>");
		int money= Integer.parseInt(scanner.nextLine());
		int tax =0;
		
		if(money<=120000000) {
			tax+=money*0.06;
		} else if ((money >120000000) && (money <=46000000)) {
			tax+=money*0.15 + 1080000;
		} else if ((money >460000000) && (money <=88000000)) {
			tax+=money*0.24 + 5220000;
		} else if ((money >880000000) && (money <=150000000)) {
			tax+=money*0.35 + 14900000;	
		} else if ((money >150000000) && (money <=300000000)) {
			tax+=money*0.38 + 19400000;	
		} else if ((money >300000000) && (money <=500000000)) {
			tax+=money*0.40 + 25400000;
		} else if (money >500000000) {
			tax+=money*0.42 + 35400000;	
		} else {
			System.out.println("잘못된 입력");
		}	
		
		System.out.println("세금 = "+kkk.format(tax)+"원");

*/
		//사용자가 알고 있는 신체사이즈중하나를 입력받아 
		//해당 미국사이즈와 한국사이즈를 출력하시오
/*		
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("");
		
		System.out.println("신체사이즈 입력:0.종료 1. 목둘레(cm) 2.가슴둘레 (cm) 3.팔길이(cm), 4.허리둘레(inch).  >>");
		int sss= Integer.parseInt(scanner.nextLine());
		
		System.out.println("입력하세요.?>>");
		int sgs= Integer.parseInt(scanner.nextLine());
				
		switch(sss) {
				
		   case 1 :
				if((33 <= sgs) || (35>sgs)) {
					System.out.println("한국 SIZE : 90~95 ,  미국SIZE:S");
				} else if ((36<=sgs) && (37>sgs)) {
					System.out.println("한국 SIZE : 95~100 , 미국SIZE:M");
				} else if ((38<=sgs) && (39>sgs)) {
					System.out.println("한국 SIZE : 100~105 , 미국SIZE:L");
				} else if ((41<=sgs) && (42>sgs)) {
					System.out.println("한국 SIZE : 105~120 , 미국SIZE:XL");
				} else if ((43<=sgs) && (45>sgs)) {
					System.out.println("한국 SIZE : 110이상 , 미국SIZE:XXL");
				} else {
					System.out.println("잘못입력했습니다.");
				}
					
				break;
			case 2 :
				
				if((86<=sgs) && (91>sgs)) {
					System.out.println("한국 SIZE : 90~95 ,  미국SIZE:S");
				} else if ((96 <=sgs) && (102>sgs)) {
					System.out.println("한국 SIZE : 95~100 , 미국SIZE:M");
				} else if ((107 <=sgs) && (112>sgs)) {
					System.out.println("한국 SIZE : 100~105 , 미국SIZE:L");
				} else if ((117 <=sgs) && (122>sgs)) {
					System.out.println("한국 SIZE : 105~120 , 미국SIZE:XL");
				} else if ((127 <=sgs) && (132>sgs)) {
					System.out.println("한국 SIZE : 110이상 , 미국SIZE:XXL");
				} else {
					System.out.println("잘못입력했습니다.");
				}
				break;
					
			case 3 :
				
				if((78<=sgs) && (81>sgs)) {
					System.out.println("한국 SIZE : 90~95 ,  미국SIZE:S");
				} else if ((81<=sgs) && (84>sgs)) {
					System.out.println("한국 SIZE : 95~100 , 미국SIZE:M");
				} else if ((84<=sgs) && (86>sgs)) {
					System.out.println("한국 SIZE : 100~105 , 미국SIZE:L");
				} else if ((86<=sgs) && (89>sgs)) {
					System.out.println("한국 SIZE : 105~120 , 미국SIZE:XL");
				} else if ((89<=sgs) && (91>sgs)) {
					System.out.println("한국 SIZE : 110이상 , 미국SIZE:XXL");
				} else {
					System.out.println("잘못입력했습니다.");
				}
				break;		
			case 4 :
				
				if((28<=sgs) && (29>sgs)) {
					System.out.println("한국 SIZE : 90~95 ,  미국SIZE:S");
				} else if ((30<=sgs) && (31>sgs)) {
					System.out.println("한국 SIZE : 95~100 , 미국SIZE:M");
				} else if ((32<=sgs) && (34>sgs)) {
					System.out.println("한국 SIZE : 100~105 , 미국SIZE:L");
				} else if ((34<=sgs) && (37>sgs)) {
					System.out.println("한국 SIZE : 105~120 , 미국SIZE:XL");
				} else if ((38<=sgs) && (40>sgs)) {
					System.out.println("한국 SIZE : 110이상 , 미국SIZE:XXL");
				} else {
					System.out.println("잘못입력했습니다.");
				} 
				break;				
			default :
				System.out.println("잘못입력했습니다");
				break;
				
				}
*/
		//‘해’,’구름’, ‘달’, ‘별’ 를 이용해서 다음과 같이 7개가 출력 될수 있는 형태의 if문과
		//boolean형태의 flag변수들을 선언하고 flag값들을 설정해 보자. 힌트는 구름과 별이 짝이다.
		//코드를 작성하고 아래와같은 결과가 나올수 있는 flag값을 선언해보자.
		
		
		
	
		
		
		
		
		
		
		
	}

}
